package com.dongtu.service.impl;

import com.dongtu.consts.RedisKeys;
import com.dongtu.pojo.TbInsureOrder;
import com.dongtu.pojo.TbPubOrder;
import com.dongtu.pojo.TbSeckillOrder;
import com.dongtu.pojo.TbTravelOrder;
import com.dongtu.service.OrderServiceI;
import org.apache.rocketmq.spring.annotation.MessageModel;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @Author: HAO
 * @Date: 2020-01-02 11:13
 * @Desc:
 */
@Component
@RocketMQMessageListener(topic = "unpaid-order", consumerGroup = "consumer-group", messageModel = MessageModel.BROADCASTING)
public class UnpaidOrderServcie implements RocketMQListener<Map> {

    @Resource
    private OrderServiceI orderService;

    @Resource
    private StringRedisTemplate stringRedisTemplate;


    Logger logger = LoggerFactory.getLogger(UnpaidOrderServcie.class);

    /**
     * 未支付超时
     *
     * @param map orderType：1普通商品 2秒杀商品
     */
    @Override
    public void onMessage(Map map) {
        logger.info("延迟消息接收成功>>>>>>>>map:{}", map);
        Long orderId = (Long) map.get("orderId");
        Integer prodId = (Integer) map.get("prodId");
        Integer orderType = (Integer) map.get("orderType");
        // 去数据库查询支付状态 如果未支付 则修改订单状态 未支付超时
        // 方案二：用户支付成功后，保存到redis key：orderId
        boolean result;
        if (orderType == 1) {
            result = orderService.getOrderIsPaid(orderId);
        } else {
            result = orderService.getOrderIsPaidFormSekillOrder(orderId);
        }
        if (result == false) {
            try {
                // 修改订单状态 未支付超时
                updateOrderStatus(orderId, orderType, 3);
                logger.info("修改订单状态成功，orderId：{}，orderType：{}", orderId, orderType);
                // 恢复商品库存
                if (orderType == 2) {
                    stringRedisTemplate.opsForValue().increment(RedisKeys.NUM_ORDER + prodId);
                }
                // 如果用户使用积分，把积分退回
            } catch (Exception e) {
                logger.error("修改订单状态失败", e);
            }
        }
    }

    // 修改订单状态
    public void updateOrderStatus(Long orderId, Integer orderType, Integer status) {
        if (orderType == 1) {
            TbTravelOrder travelOrder = new TbTravelOrder();
            travelOrder.setTrOrderId(orderId);
            travelOrder.setTrStatus(status);
            orderService.updateTravelOrder(travelOrder);
        } else {
            TbSeckillOrder seckillOrder = new TbSeckillOrder();
            seckillOrder.setSeckillOrderId(orderId);
            seckillOrder.setSeckillOrderStatus(status);
            orderService.updateSeckillOrder(seckillOrder);
        }
        TbPubOrder pubOrder = new TbPubOrder();
        pubOrder.setPoOrderId(orderId);
        pubOrder.setPoStatus(status);
        orderService.updatePubOrder(pubOrder);

        TbInsureOrder insureOrder = new TbInsureOrder();
        insureOrder.setInsureOrderId(orderId);
        insureOrder.setInsureStatus(status);
        orderService.updateInsureOrder(insureOrder);
    }

}
