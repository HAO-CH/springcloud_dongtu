package com.dongtu.controller;

import com.dongtu.consts.RedisKeys;
import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.TbSellerPayOrder;
import com.dongtu.pojo.TbTravelSeller;
import com.dongtu.service.OrderServiceI;
import com.dongtu.service.PayServiceI;
import com.dongtu.service.TravelServiceI;
import com.dongtu.util.IdWorker;
import org.apache.shiro.SecurityUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * @Author: HAO
 * @Date: 2019-12-28 17:56
 * @Desc:
 */
@Controller
@RequestMapping("seller")
public class SellerController {

    @Resource
    private TravelServiceI sellerService;

    @Resource
    private OrderServiceI orderService;

    @Resource
    private PayServiceI payService;

    @Resource
    private RedisTemplate redisTemplate;

    @RequestMapping("toUpdate")
    public String toUpdate(Model model) {
        TbTravelSeller seller = (TbTravelSeller) SecurityUtils.getSubject().getPrincipal();
        Result<TbTravelSeller> result = sellerService.findById(seller.getTravelSellerId());
        model.addAttribute("seller", result.getData());
        return "seller/update";
    }

    @RequestMapping("updateSeller")
    @ResponseBody
    public boolean updateSeller(TbTravelSeller seller) {
        sellerService.updateTravelSeller(seller);
        return true;
    }

    @RequestMapping("toPay")
    public String toPay() {

        return "seller/pay";
    }

    /**
     * 生成商家支付订单
     *
     * @return
     */
    @RequestMapping("createOrder")
    @ResponseBody
    public Result createOrder(Integer payAmount) {
        TbTravelSeller seller = (TbTravelSeller) SecurityUtils.getSubject().getPrincipal();
        TbSellerPayOrder sellerPayOrder = orderService.createSellerOrder(seller, BigDecimal.valueOf(payAmount)).getData();
        return new Result<>(ResultEnum.SUCCESS.getCode(), ResultEnum.CREATE_ORDER_SUCCESS.getMessage(), sellerPayOrder.getOrderId().toString());
    }

    /**
     * 调用支付宝接口支付
     *
     * @return
     */
    @RequestMapping("goPay")
    public void goPay(String out_trade_no, String total_amount, HttpServletResponse response) {
        String result = payService.goPay(out_trade_no, total_amount, "topUp");
        try {
            response.getWriter().println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("refund")
    @ResponseBody
    public String refund(String trade_no, String refund_amount, String out_trade_no) {
        redisTemplate.opsForValue().set(RedisKeys.ORDER_PAY_REFUND + out_trade_no, "2", 30, TimeUnit.MINUTES);
        long out_request_no = new IdWorker().nextId();
        String tui = payService.tui(trade_no, refund_amount, String.valueOf(out_request_no));
        return tui;
    }

}
