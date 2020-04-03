package com.dongtu.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dongtu.consts.RedisKeys;
import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.*;
import com.dongtu.service.OrderService;
import com.dongtu.util.IdWorker;
import io.swagger.annotations.ApiOperation;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @Author: HAO
 * @Date: 2019-12-30 14:08
 * @Desc:
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private RocketMQTemplate rocketMQTemplate;

    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    /**
     * 生成订单
     *
     * @param orderParams
     * @param flag        1:普通订单 2：秒杀订单
     * @return
     */
    @PostMapping("createOrder")
    public Result createOrder(@RequestBody OrderParams orderParams, @RequestParam Integer flag) {
        logger.info("进入订单生成方法, orderParams:{},flag:{}", orderParams, flag);
        long orderId = new IdWorker().nextId();
        Date date = new Date();
        // 判断订单是否存在，防止用户重复下单
        Object obj = redisTemplate.opsForValue().get(RedisKeys.ORDER_IS_CREATED + orderParams.getUserId() + orderParams.getProdId());
        if (obj != null) {
            return new Result(ResultEnum.FAILED.getCode(), "您的订单已生成,快去支付吧>>>>");
        }

        // 判断是秒杀订单，还是普通订单
        if (flag == 1) {
            // 生成TbTravelOrder
            try {
                TbTravelOrder travelOrder = createTravelOrder(orderParams, orderId, date);
                logger.info("生成travelOrder:{}", JSONObject.toJSONString(travelOrder));
            } catch (Exception e) {
                logger.error("生成travelOrder失败", e);
            }
        } else {
            // 生成TbSeckillOrder
            try {
                TbSeckillOrder seckillOrder = createSeckillOrder(orderParams, orderId, date);
                logger.info("生成seckillOrder：{}", JSONObject.toJSONString(seckillOrder));
            } catch (Exception e) {
                logger.error("生成seckillOrder失败", e);
            }
        }
        // 生成酒店订单
        try {
            TbPubOrder pubOrder = createPubOrder(orderParams, orderId, date);
            logger.info("生成pubOrder：{}", pubOrder);
        } catch (Exception e) {
            logger.error("生成pubOrder失败", e);
        }
        // 生成保险订单
        try {
            TbInsureOrder insureOrder = createInsureOrder(orderParams, orderId, date);
            logger.info("生成insureOrder：{}", insureOrder);
        } catch (Exception e) {
            logger.error("生成insureOrder失败", e);
        }

        // 超过10分钟未支付，发送延迟消息，修改订单状态未支付超时,如果是秒杀商品还要还原库存
        Map<String, Object> map = new HashMap<>();
        map.put("orderId", orderId);
        map.put("prodId", orderParams.getProdId());
        map.put("orderType", flag);
        rocketMQTemplate.syncSend("unpaid-order", MessageBuilder.withPayload(map).build(), 1000, 14);

        // 把未支付订单放到redis 设置过期时间
        redisTemplate.opsForValue().set(RedisKeys.ORDER_USER + orderId, JSON.toJSONString(orderParams), 15, TimeUnit.DAYS);
        redisTemplate.opsForValue().set(RedisKeys.ORDER_TYPE + orderId, flag.toString(), 15, TimeUnit.DAYS);
        redisTemplate.opsForValue().set(RedisKeys.ORDER_USER_TYPE + orderId, "1", 15, TimeUnit.DAYS);
        redisTemplate.opsForValue().set(RedisKeys.ORDER_PAY_REFUND + orderId, "1", 30, TimeUnit.MINUTES);

        // 减积分

        // 防止用户重复下单
        redisTemplate.opsForValue().set(RedisKeys.ORDER_IS_CREATED + orderParams.getUserId() + orderParams.getProdId(), 1, 30, TimeUnit.MINUTES);
        return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.CREATE_ORDER_SUCCESS.getMessage());
    }

    /**
     * 商家支付订单生成
     *
     * @param price
     * @return
     */
    @PostMapping("createSellerOrder")
    public Result<TbSellerPayOrder> createSellerOrder(@RequestBody TbTravelSeller seller, @RequestParam BigDecimal price) {
        logger.info("生成sellerOrder,price：{}", price);
        long id = new IdWorker().nextId();
        TbSellerPayOrder sellerPayOrder = new TbSellerPayOrder();
        sellerPayOrder.setOrderId(id);
        sellerPayOrder.setOrderTime(new Date());
        sellerPayOrder.setPrice(price);
        sellerPayOrder.setSellerId(seller.getTravelSellerId());
        redisTemplate.opsForValue().set(RedisKeys.ORDER_USER + id, JSON.toJSONString(seller), 15, TimeUnit.DAYS);
        redisTemplate.opsForValue().set(RedisKeys.ORDER_USER_TYPE + id, "2", 15, TimeUnit.DAYS);
        redisTemplate.opsForValue().set(RedisKeys.ORDER_PAY_REFUND + id, "1", 30, TimeUnit.MINUTES);
        try {
            orderService.createSellerOrder(sellerPayOrder);
            logger.info("生成sellerOrder成功");
            // 发送延迟消息，超过1分钟，修改订单状态未支付超时
            sendDelayMessage(id, "unpaid-order", 14);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.CREATE_ORDER_SUCCESS.getMessage(), sellerPayOrder);
        } catch (Exception e) {
            logger.info("生成sellerOrder失败", e);
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.CREATE_ORDER_FAILED.getMessage());
        }
    }

    // 发送延迟消息
    public void sendDelayMessage(long id, String destination, Integer delayLevel) {
        rocketMQTemplate.syncSend(destination, MessageBuilder.withPayload(id).build(), 1000, delayLevel);
    }

    // 创建InsureOrder
    public TbInsureOrder createInsureOrder(@RequestBody OrderParams orderParams, long orderId, Date date) {
        TbInsureOrder insureOrder = new TbInsureOrder();
        insureOrder.setInsureOrderId(orderId);
        insureOrder.setCreateTime(date);
        insureOrder.setInsureTotalFee(orderParams.getInsureCost());
        insureOrder.setUserName(orderParams.getUesrName());
        insureOrder.setUserPhone(orderParams.getUserPhone());
        insureOrder.setInsureStatus(1);
        orderService.createInsureOrder(insureOrder);
        return insureOrder;
    }

    // 创建PubOrder
    public TbPubOrder createPubOrder(@RequestBody OrderParams orderParams, long orderId, Date date) {
        TbPubOrder pubOrder = new TbPubOrder();
        pubOrder.setPoCreateTime(date);
        pubOrder.setPoOrderId(orderId);
        pubOrder.setPoPrice(orderParams.getPubPrice());
        pubOrder.setPoTotalFee(orderParams.getPubCost());
        pubOrder.setPoTravelId(orderParams.getProdId());
        pubOrder.setPoTravelSellerId(orderParams.getSellerId());
        pubOrder.setPoUserId(orderParams.getUserId());
        pubOrder.setPoUserName(orderParams.getUesrName());
        pubOrder.setPoUserPhone(orderParams.getUserPhone());
        pubOrder.setPoStatus(1);
        orderService.createPubOrder(pubOrder);
        return pubOrder;
    }

    // 创建秒杀订单
    public TbSeckillOrder createSeckillOrder(@RequestBody OrderParams orderParams, long orderId, Date date) {
        TbSeckillOrder seckillOrder = new TbSeckillOrder();
        seckillOrder.setSeckillOrderId(orderId);
        seckillOrder.setSeckillId(orderParams.getProdId());
        seckillOrder.setUserId(orderParams.getUserId());
        seckillOrder.setTravelSellerId(orderParams.getSellerId());
        seckillOrder.setUserName(orderParams.getUesrName());
        seckillOrder.setUserPhone(orderParams.getUserPhone());
        seckillOrder.setSeckillOrderTotalMoney(orderParams.getTotalFee());
        seckillOrder.setSeckillOrderCreateTime(date);
        seckillOrder.setPubsId(orderParams.getPubId());
        seckillOrder.setInsureId(orderParams.getInsureId());
        seckillOrder.setInsureId(orderParams.getInsureId());
        seckillOrder.setTpGoTime(orderParams.getTpGoTime());
        seckillOrder.setSeckillOrderPrice(orderParams.getProdPrice());
        seckillOrder.setSeckillOrderCostPrice(orderParams.getSkillPrice());
        seckillOrder.setSeckillOrderPubsCost(orderParams.getPubCost());
        seckillOrder.setSeckillOrderInsureCost(orderParams.getInsureCost());
        seckillOrder.setSeckillOrderStatus(1);
        orderService.createSeckillOrder(seckillOrder);
        return seckillOrder;
    }

    // 创建TravelOrder
    public TbTravelOrder createTravelOrder(@RequestBody OrderParams orderParams, long orderId, Date date) {
        TbTravelOrder travelOrder = new TbTravelOrder();
        travelOrder.setTrOrderId(orderId);
        travelOrder.setTrUserId(orderParams.getUserId());
        travelOrder.setTrUserName(orderParams.getUesrName());
        travelOrder.setTrUserPhone(orderParams.getUserPhone());
        travelOrder.setTrTravelSellerId(orderParams.getSellerId());
        travelOrder.setTrTravelId(orderParams.getProdId());
        travelOrder.setTrTravelNum(orderParams.getTravelNum());
        travelOrder.setTrTravelPrice(orderParams.getProdPrice());
        travelOrder.setTrCreateTime(date);
        travelOrder.setTpGoTime(orderParams.getTpGoTime());
        travelOrder.setTrTravelTotalFee(orderParams.getTotalFee());
        travelOrder.setTrTravelNum(orderParams.getTravelNum());
        travelOrder.setTrTravelId(orderParams.getProdId());
        travelOrder.setTrStatus(1);
        orderService.createTravelOrder(travelOrder);
        return travelOrder;
    }

    /**
     * 创建订单
     *
     * @param travelOrder
     * @return
     */
    @PostMapping("createTravelOrder")
    public Result createTravelOrder(@RequestBody TbTravelOrder travelOrder) {
        orderService.createTravelOrder(travelOrder);
        return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.INSERT_SUCCESS.getMessage());
    }

    @PostMapping("createSeckillOrder")
    public Result createSeckillOrder(@RequestBody TbSeckillOrder seckillOrder) {
        orderService.createSeckillOrder(seckillOrder);
        return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.INSERT_SUCCESS.getMessage());
    }

    @PostMapping("createPubOrder")
    public Result createPubOrder(@RequestBody TbPubOrder pubOrder) {
        orderService.createPubOrder(pubOrder);
        return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.INSERT_SUCCESS.getMessage());
    }

    @PostMapping("createInsureOrder")
    public Result createInsureOrder(@RequestBody TbInsureOrder insureOrder) {
        orderService.createInsureOrder(insureOrder);
        return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.INSERT_SUCCESS.getMessage());
    }

    /**
     * 修改订单状态
     *
     * @param travelOrder
     * @return
     */
    @PutMapping("updateTravelOrder")
    public Result updateTravelOrder(@RequestBody TbTravelOrder travelOrder) {
        orderService.updateTravelOrder(travelOrder);
        return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.UPDATE_SUCCESS.getMessage());
    }

    @PutMapping("updateSeckillOrder")
    public Result updateSeckillOrder(@RequestBody TbSeckillOrder seckillOrder) {
        orderService.updateSeckillOrder(seckillOrder);
        return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.UPDATE_SUCCESS.getMessage());
    }

    @PutMapping("updatePubOrder")
    public Result updatePubOrder(@RequestBody TbPubOrder pubOrder) {
        orderService.updatePubOrder(pubOrder);
        return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.UPDATE_SUCCESS.getMessage());
    }

    @PutMapping("updateInsureOrder")
    public Result updateInsureOrder(@RequestBody TbInsureOrder insureOrder) {
        orderService.updateInsureOrder(insureOrder);
        return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.UPDATE_SUCCESS.getMessage());
    }

    /**
     * 根据订单状态查询
     *
     * @param userId
     * @param status
     * @return
     */
    @GetMapping("findUnpaidOrPaidOrder")
    public Result<List<TbTravelOrder>> findUnpaidOrPaidOrder(@RequestParam Long userId, @RequestParam Integer status) {
        List<TbTravelOrder> list = orderService.findUnpaidOrderOrPaid(userId, status);
        return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), list);
    }

    @GetMapping("findUnpaidOrPaidOrderSeckill")
    public Result<List<TbSeckillOrder>> findUnpaidOrPaidOrderSeckill(@RequestParam Long userId, @RequestParam Integer status) {
        List<TbSeckillOrder> list = orderService.findUnpaidOrPaidOrderSeckill(userId, status);
        return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), list);
    }

    @PutMapping("updateSellerOrder")
    public Result updateSellerOrder(@RequestBody TbSellerPayOrder sellerPayOrder) {
        orderService.updateSellerOrder(sellerPayOrder);
        return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.UPDATE_SUCCESS.getMessage());
    }

    /**
     * 查询订单是否支付
     *
     * @param orderId
     * @return
     */
    @GetMapping("getOrderIsPaid")
    public boolean getOrderIsPaid(@RequestParam Long orderId) {
        TbTravelOrder order = orderService.getOrderIsPaid(orderId);
        if (order.getTrStatus() == 1) {
            return false;
        }
        return true;
    }

    @GetMapping("getOrderIsPaidFormSekillOrder")
    public boolean getOrderIsPaidFormSekillOrder(@RequestParam Long orderId) {
        TbSeckillOrder order = orderService.getOrderIsPaidFormSekillOrder(orderId);
        if (order.getSeckillOrderStatus() == 1) {
            return false;
        }
        return true;
    }

    /**
     *
     * @param userId
     * @param status
     * 秒杀订单查询
     * @return
     */
    @GetMapping("getSeckillId")
    @ApiOperation(value = "秒杀商品查询")
    public Result<List<TbSeckillOrder>> getSeckillId(@RequestParam Long userId, @RequestParam Integer status){
        List<TbSeckillOrder> list = orderService.getSeckillId(userId, status);
        return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), list);
    }
}
