package com.dongtu.controller;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradeFastpayRefundQueryRequest;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.request.AlipayTradeQueryRequest;
import com.alipay.api.request.AlipayTradeRefundRequest;
import com.dongtu.config.AlipayConfig;
import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: HAO
 * @Date: 2019-12-18 12:43
 * @Desc:
 */
@Controller
@RequestMapping("alipay")
public class AlipayController {

    @Resource
    private AlipayConfig alipayConfig;

    /**
     * 请求跳转支付页面
     *
     * @param out_trade_no 商户支付订单号，商户网站订单系统中唯一订单号，支付宝通过过滤该类单号 避免重复付款，必填
     * @param total_amount 付款金额，必填
     * @param subject      订单名称，必填
     * @param body         商品描述，可空
     * @param response
     * @throws Exception
     */
    @RequestMapping("goPay")
    @ResponseBody
    public String goPay(@RequestParam String out_trade_no, @RequestParam String total_amount, @RequestParam String subject,
                        String body, HttpServletResponse response) throws Exception {
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(alipayConfig.getGatewayUrl(), alipayConfig.getApp_id(), alipayConfig.getMerchant_private_key(), "json", alipayConfig.getCharset(), alipayConfig.getAlipay_public_key(), alipayConfig.getSign_type());
        //创建Alipay请求对象，设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(alipayConfig.getReturn_url());
        alipayRequest.setNotifyUrl(alipayConfig.getNotify_url());
        //请求文本中的中文有的需要转码如：
        //new String(subject.getBytes("ISO-8859-1"), "utf-8")
        alipayRequest.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\","
                + "\"total_amount\":\"" + total_amount + "\","
                + "\"subject\":\"" + subject + "\","
                + "\"body\":\"" + body + "\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        //请求
        String head = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"></head>";
        String result = alipayClient.pageExecute(alipayRequest).getBody();
        String buttom = "<body></body></html>";
        //输出
//        response.getWriter().println(head + result + buttom);
        return head + result + buttom;
    }


    /**
     * 交易查询
     *
     * @param trade_no 支付宝交易号
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("query")
    public String query(String trade_no) throws Exception {
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(alipayConfig.getGatewayUrl(), alipayConfig.getApp_id(), alipayConfig.getMerchant_private_key(), "json", alipayConfig.getCharset(), alipayConfig.getAlipay_public_key(), alipayConfig.getSign_type());
        //设置请求参数
        AlipayTradeQueryRequest alipayRequest = new AlipayTradeQueryRequest();
        alipayRequest.setBizContent("{\"\"trade_no\":\"" + trade_no + "\"}");
        //请求
        String result = alipayClient.execute(alipayRequest).getBody();
        return result;
    }


    /**
     * 退款
     *
     * @param trade_no       支付宝交易号
     * @param out_trade_no   商户订单号，商户网站订单系统中唯一订单号  必填：否
     * @param refund_amount  需要退款的金额，该金额不能大于订单金额，必填
     * @param out_request_no 标识一次退款请求，同一笔交易多次退款需要保证唯一，如需部分退款，必填！
     * @param refund_reason  退款的原因说明 必填：否
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("refund")
    public String tui(String out_trade_no, String trade_no, String refund_amount,
                      String refund_reason, String out_request_no) throws Exception {
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(alipayConfig.getGatewayUrl(), alipayConfig.getApp_id(), alipayConfig.getMerchant_private_key(), "json", alipayConfig.getCharset(), alipayConfig.getAlipay_public_key(), alipayConfig.getSign_type());
        //设置请求参数
        AlipayTradeRefundRequest alipayRequest = new AlipayTradeRefundRequest();
        //请求文本中的中文必须要转码如：new String(refund_reason.getBytes("ISO-8859-1"), "utf-8")
        alipayRequest.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\","
                + "\"trade_no\":\"" + trade_no + "\","
                + "\"refund_amount\":\"" + refund_amount + "\","
                + "\"refund_reason\":\"" + refund_reason + "\","
                + "\"out_request_no\":\"" + out_request_no + "\"}");
        //请求
        String result = alipayClient.execute(alipayRequest).getBody();
        return result;
    }

    /**
     * 退款交易查询
     *
     * @param
     * @param trade_no       支付宝交易号
     * @param out_request_no 请求退款接口时，传入的退款请求号，如果在退款请求时未传入，则该值为创建交易时的外部交易号，必填
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("Tkquery")
    public String Tkquery(String trade_no, String out_request_no) throws Exception {
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(alipayConfig.getGatewayUrl(), alipayConfig.getApp_id(), alipayConfig.getMerchant_private_key(), "json", alipayConfig.getCharset(), alipayConfig.getAlipay_public_key(), alipayConfig.getSign_type());
        //设置请求参数
        AlipayTradeFastpayRefundQueryRequest alipayRequest = new AlipayTradeFastpayRefundQueryRequest();
        alipayRequest.setBizContent("{\"trade_no\":\"" + trade_no + "\","
                + "\"out_request_no\":\"" + out_request_no + "\"}");
        //请求
        String result = alipayClient.execute(alipayRequest).getBody();
        //输出
        return result;
    }
}
