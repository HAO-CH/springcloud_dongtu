package com.dongtu.controller;

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.AlipaySignature;
import com.dongtu.config.AlipayConfig;
import com.dongtu.consts.RedisKeys;
import com.dongtu.pojo.*;
import com.dongtu.service.OrderServiceI;
import com.dongtu.service.PayLogService;
import com.dongtu.service.SellerPayLogService;
import com.dongtu.service.TravelServiceI;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * @Author: HAO
 * @Date: 2019-12-18 12:38
 * @Desc:
 */
@RequestMapping("/callback")
@Controller
public class CallBackController {

    @Resource
    private AlipayConfig alipayConfig;

    @Resource
    private PayLogService payLogService;

    @Resource
    private SellerPayLogService sellerPayLogService;

    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private OrderServiceI orderService;

    @Resource
    private TravelServiceI travelService;

    @Resource
    private RocketMQTemplate rocketMQTemplate;

    Logger logger = LoggerFactory.getLogger(CallBackController.class);

    /**
     * 同步回调，只是告诉你调用成功了，不是支付成功
     *
     * @param request 获取回调参数
     * @return
     * @throws Exception
     */
    @RequestMapping("/return")
    public String returnUrl(HttpServletRequest request) throws Exception {
        Map mv = new HashMap();
        //——请在这里编写您的程序（以下代码仅作参考）——
        if (getSignVerified(request)) {
            System.out.println("Return 验签成功");
            //收款支付宝账号对应的支付宝唯一用户号
            String seller_id = new String(request.getParameter("seller_id"));
            //商户支付订单号
            String out_trade_no = new String(request.getParameter("out_trade_no"));
            //支付宝交易号
            String trade_no = new String(request.getParameter("trade_no"));
            //付款金额
            String total_amount = new String(request.getParameter("total_amount"));
            Map resultMap = new HashMap();
            resultMap.put("trade_no", trade_no);
            resultMap.put("out_trade_no", out_trade_no);
            resultMap.put("total_amount", total_amount);
            resultMap.put("seller_id", seller_id);

            mv.put("data", resultMap);
            mv.put("msg", "验签成功");
            return "pay-success";
        } else {
            System.out.println("验签失败");
            return "pay-failed";
        }

    }


    /**
     * 异步回调,交易成功时回调
     * 异步接口有延迟
     *
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping("/notify")
    public void notifyUrl(HttpServletRequest request, HttpServletResponse response) throws Exception {

       /* 实际验证过程建议商户务必添加以下校验：
       1、需要验证该通知数据中的out_trade_no是否为商户系统中创建的订单号，
       2、判断total_amount是否确实为该订单的实际金额（即商户订单创建时的金额），
       3、校验通知中的seller_id（或者seller_email) 是否为out_trade_no这笔单据的对应的操作方（有的时候，一个商户可能有多个seller_id/seller_email）
       4、验证app_id是否为该商户本身。
          在上述验证通过后商户必须根据支付宝不同类型的业务通知，正确的进行不同的业务处理，并且过滤重复的通知结果数据。
          在支付宝的业务通知中，只有交易通知状态为TRADE_SUCCESS或TRADE_FINISHED时，支付宝才会认定为买家付款成功。
       */
        if (getSignVerified(request)) {//验证成功
            System.out.println("Notify 验签成功");
            //支付宝分配给开发者的应用ID
            String app_id = request.getParameter("app_id");
            //卖家支付宝用户号
            String seller_id = request.getParameter("seller_id");
            //商户订单号
            String out_trade_no = request.getParameter("out_trade_no");
            //本次交易支付的订单金额，单位为人民币（元），精确到小数点后2位
            String total_amount = request.getParameter("total_amount");
            //支付宝交易号
            String trade_no = request.getParameter("trade_no");
            //交易状态
            String trade_status = request.getParameter("trade_status");
            if (trade_status.equals("TRADE_FINISHED")) {
                //注意：
                //退款日期超过可退款期限后（如三个月可退款），支付宝系统发送该交易状态通知
                //例如在高级即时到帐接口里面，支付成功之后返回的是TRADE_SUCCESS，此时三个月之内可以操作退款，
                //三个月之后不允许对该笔交易操作，支付宝会返回TRADE_FINISHED，所以必须要在TRADE_SUCCESS下执行你网站业务逻辑代码，
                //TRADE_FINISHED不做任何业务逻辑处理，避免一笔交易重复执行业务逻辑而给您带来不必要的损失。
            } else if (trade_status.equals("TRADE_SUCCESS")) {
                logger.info("进入支付异步回调,参数：seller_id：{},out_trade_no:{},total_amount:{}", seller_id, out_trade_no, total_amount);
                // 判断是商家还是用户 1：用户  2：商家
                String userType = (String) redisTemplate.opsForValue().get(RedisKeys.ORDER_USER_TYPE + out_trade_no);
                Date date = new Date();
                if ("1".equals(userType)) {
                    String payRefund = (String) redisTemplate.opsForValue().get(RedisKeys.ORDER_PAY_REFUND + out_trade_no);
                    String orderType = (String)redisTemplate.opsForValue().get(RedisKeys.ORDER_TYPE + out_trade_no);
                    // 判断支付还是退款
                    if ("1".equals(payRefund)) {
                        // 判断该笔订单是否在商户网站中已经做过处理
                        TbPayLog payLog = payLogService.findPayLogByOutTradeNo(out_trade_no);
                        // 如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
                        if (payLog == null) {
                            String o = (String) redisTemplate.opsForValue().get(RedisKeys.ORDER_USER + out_trade_no);
                            OrderParams orderParams = JSONObject.parseObject(o, OrderParams.class);

                            // 记录到paylog日志表
                            insertPayLog(out_trade_no, trade_no, date, orderParams, 1);

                            // 发送MQ消息增加积分
                            Long userId = orderParams.getUserId();
                            Map<String, Object> map = new HashMap<>();
                            map.put("total_amount", total_amount);
                            map.put("userId", userId);
                            rocketMQTemplate.convertAndSend("points-group", map);
                            logger.info("MQ消息发送成功,total_amount：{}, userId:{}", total_amount, userId);

                            // 更新订单表订单状态 支付成功
                            updateOrderAll(orderType, out_trade_no, trade_no, date, 2);

                            // 发送短信通知用户
                            rocketMQTemplate.convertAndSend("sms-group", orderParams.getUserPhone());
                            logger.info("MQ消息发送成功phoneNum:{}", orderParams.getUserPhone());

                            // 统计商品卖出数量放入redis
                            Integer orderNum = (Integer) redisTemplate.opsForValue().get(RedisKeys.PROD_SOLD_NUM + orderParams.getProdId());
                            int num = 0;
                            if (orderNum == null) {
                                num = Integer.parseInt(String.valueOf(orderParams.getTravelNum()));
                            } else {
                                num = orderNum + Integer.parseInt(String.valueOf(orderParams.getTravelNum()));
                            }
                            redisTemplate.opsForValue().set(RedisKeys.PROD_SOLD_NUM + orderParams.getProdId(), num);

                            // 统计某个商家某个时间段 交易单数
                            redisTemplate.opsForHash().increment(RedisKeys.COUNT_GOODS_SOLD, orderParams.getSellerId().toString(), 1);

                            // 删除缓存
                            redisTemplate.delete(RedisKeys.ORDER_IS_CREATED + orderParams.getUserId() + orderParams.getProdId());
                        }
                        //处理真实的业务

                        System.out.println(System.currentTimeMillis() + "-----===================--" + "TRADE_SUCCESS 执行" + out_trade_no);
                        //注意：
                        //付款完成后，支付宝系统发送该交易状态通知
                    } else {
                        // 执行退款逻辑
                        String o = (String) redisTemplate.opsForValue().get(RedisKeys.ORDER_USER + out_trade_no);
                        OrderParams orderParams = JSONObject.parseObject(o, OrderParams.class);
                        // 记录到日志表
                        insertPayLog(out_trade_no, trade_no, date, orderParams, 2);
                        // 更新订单表订单状态 5：退款
                    }
                } else if ("2".equals(userType)) { // 商家
                    String payOrRefund = (String) redisTemplate.opsForValue().get(RedisKeys.ORDER_PAY_REFUND + out_trade_no);
                    if ("1".equals(payOrRefund)) {
                        //判断该笔订单是否在商户网站中已经做过处理
                        List<TbSellerPayLog> list = sellerPayLogService.findPayLogByOutTradeNo(out_trade_no);
                        String o = (String) redisTemplate.opsForValue().get(RedisKeys.ORDER_USER + out_trade_no);
                        TbTravelSeller seller = JSONObject.parseObject(o, TbTravelSeller.class);
                        if (list == null || list.isEmpty()) {
                            // 记录到paylog日志表
                            insertSellerPayLog(out_trade_no, total_amount, trade_no, date, seller);
                            // 发送短信通知用户
                            rocketMQTemplate.convertAndSend("sms-group", seller.getTravelTelephone());
                            logger.info("MQ消息发送成功phoneNum:{}", seller.getTravelTelephone());
                        }
                        //如果有做过处理，不执行商户的业务程序
                        // 更新订单状态
                        updateSellerOrderStatus(out_trade_no, trade_no);
                        // 更新账户余额
                        seller.setTravelBalence(seller.getTravelBalence().add(new BigDecimal(total_amount)));
                        travelService.updateTravelSeller(seller);
                    } else {
                        //执行商家退款逻辑

                    }
                }
            }
            response.getWriter().println("success");
        } else {//验证失败
            response.getWriter().println("fail");
            System.out.println(System.currentTimeMillis() + "-----===================--" + "SignVerified_Fail ...");
            //调试用，写文本函数记录程序运行情况是否正常
            //String sWord = AlipaySignature.getSignCheckContentV1(params);
            //AlipayConfig.logResult(sWord);
        }

    }

    // 记录到paylog日志表
    public void insertPayLog(String out_trade_no, String trade_no, Date date, OrderParams orderParams, Integer status) {
        TbPayLog payLog = new TbPayLog();
        payLog.setMoOrderNum(Long.valueOf(out_trade_no));
        payLog.setCrateTime(date);
        payLog.setPayTime(date);
        payLog.setTotalFee(orderParams.getTotalFee());
        payLog.setTransactionId(trade_no);
        payLog.setUserId(orderParams.getUserId());
        payLog.setUserName(orderParams.getUesrName());
        payLog.setInsureOrderId(Long.valueOf(out_trade_no));
        payLog.setPubOrderId(Long.valueOf(out_trade_no));
        payLog.setTravelOrderId(Long.valueOf(out_trade_no));
        payLog.setLogStatus(status);
        payLogService.insertPayLog(payLog);
    }

    // 记录到sellerPayLog
    public void insertSellerPayLog(String out_trade_no, String total_amount, String trade_no, Date date, TbTravelSeller seller) {
        TbSellerPayLog sellerPayLog = new TbSellerPayLog();
        sellerPayLog.setPayOrderId(Long.valueOf(out_trade_no));
        sellerPayLog.setPayPrice(new BigDecimal(total_amount));
        sellerPayLog.setPayStatus(1);
        sellerPayLog.setPayTime(date);
        sellerPayLog.setSellerId(seller.getTravelSellerId());
        sellerPayLog.setSpOrderId(Long.valueOf(out_trade_no));
        sellerPayLog.setPayTransactionId(trade_no);
        sellerPayLogService.insertPayLog(sellerPayLog);
    }

    // 更新seller订单状态
    public void updateSellerOrderStatus(String out_trade_no, String trade_no) {
        TbSellerPayOrder sellerPayOrder = new TbSellerPayOrder();
        sellerPayOrder.setOrderId(Long.valueOf(out_trade_no));
        sellerPayOrder.setTransactionId(trade_no);
        orderService.updateSellerOrder(sellerPayOrder);
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
     * 对支付宝回调接口进行验签
     *
     * @param request
     * @return
     * @throws UnsupportedEncodingException
     */
    public boolean getSignVerified(HttpServletRequest request) throws UnsupportedEncodingException, AlipayApiException {
        //获取支付宝反馈信息
        Map<String, String> params = new HashMap<>();
        Map<String, String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i]
                        : valueStr + values[i] + ",";
            }
            //乱码解决，这段代码在出现乱码时使用
            valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
            params.put(name, valueStr);
        }
        boolean signVerified = AlipaySignature.rsaCheckV1(params, alipayConfig.getAlipay_public_key(), alipayConfig.getCharset(), alipayConfig.getSign_type()); //调用SDK验证签名
        return signVerified;
    }

}
