package com.dongtu.service;

import com.dongtu.consts.Result;
import com.dongtu.pojo.TbPayLog;
import com.dongtu.pojo.TbSellerPayLog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * 支付服务接口
 */
@FeignClient("PAY-SERVICE")
public interface PayServiceI {

    @PostMapping("payLog/insertPayLog")
    Result insertPayLog(@RequestBody TbPayLog payLog);

    @PostMapping("payLog/insertSellerPayLog")
    Result insertSellerPayLog(@RequestBody TbSellerPayLog sellerPayLog);

    @RequestMapping(value = "alipay/goPay")
    String goPay(@RequestParam String out_trade_no, @RequestParam String total_amount, @RequestParam String subject);

    @RequestMapping(value = "alipay/query")
    String query(@RequestParam String trade_no);

    @RequestMapping(value = "alipay/refund")
    String tui(@RequestParam String trade_no, @RequestParam String refund_amount, @RequestParam String out_request_no);

}
