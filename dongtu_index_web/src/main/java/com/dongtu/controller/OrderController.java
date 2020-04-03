package com.dongtu.controller;

import com.alibaba.fastjson.JSONObject;
import com.dongtu.consts.RedisKeys;
import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.IntegralItem;
import com.dongtu.pojo.OrderParams;
import com.dongtu.pojo.TbUser;
import com.dongtu.pojo.UserAndSeck;
import com.dongtu.service.OrderServiceI;
import com.dongtu.service.PointsServiceI;
import com.dongtu.service.UserServiceI;
import com.dongtu.util.IdWorker;
import org.apache.shiro.SecurityUtils;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @Author: HAO
 * @Date: 2019-12-31 09:36
 * @Desc:
 */
@Controller
@CrossOrigin("*")
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderServiceI orderService;

    @Autowired
    private PointsServiceI pointsService;

    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private UserServiceI userService;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 去订单页面
     *
     * @param orderParams
     * @param model
     * @return
     */
    @RequestMapping("orderPage")
    public String orderPage(OrderParams orderParams, Model model) {
        // 判断用户是否登录
        TbUser user = (TbUser) SecurityUtils.getSubject().getPrincipal();
        if (user == null) {
            return "login";
        } else {
            // 把当前用户set到orderParams
            orderParamsSetter(orderParams, user);
            model.addAttribute("orderParams", orderParams);
            return "order";
        }
    }

    /**
     * 跳转秒杀订单页
     *
     * @param orderParams
     * @param model
     * @return
     */
    @RequestMapping("toSeckillOrderPage")
    public String toSeckillOrderPage(OrderParams orderParams, Model model) {
        // 判断用户是否登录
        TbUser user = (TbUser) SecurityUtils.getSubject().getPrincipal();
        if (user == null) {
            return "login";
        } else {
            // 把当前用户set到orderParams
            orderParamsSetter(orderParams, user);
            model.addAttribute("orderParams", orderParams);
            return "seckill-order";
        }
    }

    // 把当前用户set到orderParams
    public void orderParamsSetter(OrderParams orderParams, TbUser user) {
        TbUser tbUser = userService.findById(user.getUserId()).getData();
        orderParams.setUserId(tbUser.getUserId());
        orderParams.setUserPhone(tbUser.getUserPhone());
        orderParams.setUesrName(tbUser.getUserName());
        orderParams.setPionts(tbUser.getUserPoints());
        orderParams.setPointsToMoney(tbUser.getUserPoints().intValue() / 100);
        redisTemplate.opsForValue().set(RedisKeys.UNFINNISHED_ORDER + tbUser.getUserId(), JSONObject.toJSONString(orderParams), 30, TimeUnit.MINUTES);
    }


    /**
     * 创建订单
     *
     * @param orderParam
     * @param usePoints  是否使用积分 1：未使用 2：使用
     * @param flag       1:正常商品 2:秒杀商品
     * @return
     */
    @RequestMapping("createOrder")
    @ResponseBody
    public Result createOrder(OrderParams orderParam, Integer usePoints, Integer flag) {
        TbUser user = (TbUser) SecurityUtils.getSubject().getPrincipal();
        // 给orderParams set 值
        OrderParams orderParams = setOrderParams(orderParam, user);
        // 判断是否恶意传参，进行拦截
        if (orderParams.getPointsToMoney() < 0) {
            return new Result(ResultEnum.FAILED.getCode(), "参数有问题，请刷新页面重试>>>>");
        }
        // 生成订单
        Result result = orderService.createOrder(orderParams, flag);
        // 判断订单是否生成
        if (result.getCode() == 20000) {
            return new Result(ResultEnum.FAILED.getCode(), result.getMsg());
        }
        // 减积分
        if (usePoints == 2) {
            Result result1 = pointsService.updatePoints(user.getUserId(), Long.valueOf(-orderParams.getPointsToMoney() * 100));
            if (result1.getCode() == 20000) {
                return new Result(ResultEnum.FAILED.getCode(), result.getMsg());
            }
        }
        //减库存
        stringRedisTemplate.boundValueOps(RedisKeys.NUM_ORDER + orderParams.getProdId()).decrement(1);
        //创建空对象存缓存
        UserAndSeck userAndSeck = new UserAndSeck();
        //以用户的id + 商品id 做为key 放缓存
        redisTemplate.boundHashOps("userAndSeck").put(orderParams.getProdId()+user.getUserId(),userAndSeck);
        return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.CREATE_ORDER_SUCCESS.getMessage());
    }

    // 给orderParams set 值
    @NotNull
    public OrderParams setOrderParams(OrderParams orderParam, TbUser user) {
        Object o = redisTemplate.opsForValue().get(RedisKeys.UNFINNISHED_ORDER + user.getUserId());
        OrderParams orderParams = JSONObject.parseObject((String) o, OrderParams.class);
        orderParams.setTotalFee(orderParam.getTotalFee());
        orderParams.setInsureCost(orderParam.getInsureCost());
        orderParams.setTpGoTime(new Date());
        return orderParams;
    }

    /**
     * 检查订单是否生成
     *
     * @return
     */
    @RequestMapping("checkOrderDone")
    @ResponseBody
    public boolean checkOrderDone() {
        TbUser user = (TbUser) SecurityUtils.getSubject().getPrincipal();
        Object o = redisTemplate.opsForValue().get(RedisKeys.UNFINNISHED_ORDER + user.getUserId());
        OrderParams orderParams = JSONObject.parseObject((String) o, OrderParams.class);
        Object o1 = redisTemplate.opsForValue().get(RedisKeys.ORDER_IS_CREATED + orderParams.getUserId() + orderParams.getProdId());
        if (o1 == null) {
            return false;
        } else {
            return true;
        }
    }

    @RequestMapping("waitPage")
    public String waitPage() {

        return "wait-page";
    }

    @RequestMapping("orderList")
    public String orderList() {

        return "no-pay";
    }

    @RequestMapping("integralOrderPage")
     public String integralOrderPage(IntegralItem integralItem, Model model, @RequestParam String goodsName){
        TbUser user = (TbUser) SecurityUtils.getSubject().getPrincipal();
        integralItem.setUserId(user.getUserId());
        long id = new IdWorker().nextId();
        integralItem.setIntegralIdwork(String.valueOf(id));
        redisTemplate.opsForValue().set(RedisKeys.UNFINNISHED_ORDER + user.getUserId(), JSONObject.toJSONString(integralItem));
        model.addAttribute("goodsName",goodsName);
        model.addAttribute("integralItem",integralItem);
        return "integralOrder";
    }
    @RequestMapping("integralOrder")
    public String integralOrder(IntegralItem integralItem,@RequestParam String site1,@RequestParam String site2,
                                @RequestParam String site3,@RequestParam String site4){
        String site = site1+site2+site3+site4;
        TbUser user = (TbUser) SecurityUtils.getSubject().getPrincipal();
        String integralItem2 = (String) redisTemplate.opsForValue().get(RedisKeys.UNFINNISHED_ORDER + user.getUserId());
        IntegralItem integralItem1 = JSONObject.parseObject(integralItem2, IntegralItem.class);
        integralItem1.setIntemName(integralItem.getIntemName());
        integralItem1.setIntemPhone(integralItem.getIntemPhone());
        integralItem1.setIntegralSite(site);
        orderService.addOrderIntegral(integralItem1);
        if (integralItem1.getIntegralNum() != null){
            BigDecimal userPoints = user.getUserPoints();
            BigDecimal integralTotalPrice = integralItem1.getIntegralTotalPrice();
            BigDecimal subtract = userPoints.subtract(integralTotalPrice);
            user.setUserPoints(subtract);
            userService.updateTbUser(user);
        }
        return "index";
    }



}
