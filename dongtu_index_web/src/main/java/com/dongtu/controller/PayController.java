package com.dongtu.controller;

import com.dongtu.consts.RedisKeys;
import com.dongtu.pojo.TbInsureOrder;
import com.dongtu.pojo.TbPubOrder;
import com.dongtu.pojo.TbSeckillOrder;
import com.dongtu.pojo.TbTravelOrder;
import com.dongtu.service.OrderServiceI;
import com.dongtu.service.PayServiceI;
import com.dongtu.util.IdWorker;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @Author: HAO
 * @Date: 2020-01-07 22:14
 * @Desc:
 */
@Controller
@RequestMapping("pay")
public class PayController {

    @Resource
    private PayServiceI payService;

    @Resource
    private OrderServiceI orderService;

    @Resource
    private RedisTemplate redisTemplate;

    /**
     * 调用支付接口
     *
     * @param out_trade_no 订单号
     * @param total_amount 订单金额
     * @param subject      订单名称
     * @param response
     */
    @RequestMapping("goPay")
    public void goPay(String out_trade_no, String total_amount, String subject, HttpServletResponse response) {
        String result = payService.goPay(out_trade_no, total_amount, subject);
        try {
            response.getWriter().println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 退款
     *
     * @param trade_no      支付宝流水号
     * @param refund_amount 退款金额
     * @param out_trade_no  订单号
     * @return
     */
    @RequestMapping("refund")
    public String refund(String trade_no, String refund_amount, String out_trade_no) {
        // 修改订单状态
        String orderType = (String)redisTemplate.opsForValue().get(RedisKeys.ORDER_TYPE + out_trade_no);
        updateOrderAll(orderType, out_trade_no, trade_no, new Date(), 5);
        redisTemplate.opsForValue().set(RedisKeys.ORDER_PAY_REFUND + out_trade_no, "2", 30, TimeUnit.MINUTES);
        long out_request_no = new IdWorker().nextId();
        String tui = payService.tui(trade_no, refund_amount, String.valueOf(out_request_no));
        return "refund-success";
    }

    /**
     * 更新订单状态
     *
     * @param out_trade_no
     * @param trade_no
     * @param date
     * @param status
     */
    public void updateOrderAll(String orderType, String out_trade_no, String trade_no, Date date, Integer status) {
        if ("1".equals(orderType)) {
            TbTravelOrder travelOrder = new TbTravelOrder();
            travelOrder.setTrOrderId(Long.valueOf(out_trade_no));
            travelOrder.setTrTransactionId(trade_no);
            travelOrder.setTrStatus(status);
            travelOrder.setTrPayTime(date);
            orderService.updateTravelOrder(travelOrder);
        } else {
            TbSeckillOrder seckillOrder = new TbSeckillOrder();
            seckillOrder.setSeckillOrderId(Long.valueOf(out_trade_no));
            seckillOrder.setTransactionId(trade_no);
            seckillOrder.setSeckillOrderPayTime(date);
            seckillOrder.setSeckillOrderStatus(status);
            orderService.updateSeckillOrder(seckillOrder);
        }

        TbPubOrder pubOrder = new TbPubOrder();
        pubOrder.setPoOrderId(Long.valueOf(out_trade_no));
        pubOrder.setPoStatus(status);
        pubOrder.setPoPayTime(date);
        pubOrder.setPoTransactionId(trade_no);

        TbInsureOrder insureOrder = new TbInsureOrder();
        insureOrder.setInsureOrderId(Long.valueOf(out_trade_no));
        insureOrder.setTransactionId(trade_no);
        insureOrder.setInsureStatus(status);
        insureOrder.setPayTime(date);

        orderService.updatePubOrder(pubOrder);
        orderService.updateInsureOrder(insureOrder);
    }

    /**
     * 跳转首页
     *
     * @return
     */
    @RequestMapping("index")
    public String index() {

        return "index";
    }

    /**
     * 跳转我的订单页
     *
     * @return
     */
    @RequestMapping("nopay")
    public String nopay() {

        return "no-pay";
    }

}
