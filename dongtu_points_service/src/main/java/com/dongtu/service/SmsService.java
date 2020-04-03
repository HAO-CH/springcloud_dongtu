package com.dongtu.service;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.dongtu.config.SmsUtil;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@RocketMQMessageListener(topic = "sms-group", consumerGroup = "consumer-group")
public class SmsService implements RocketMQListener<String> {

    @Resource
    private SmsUtil smsUtil;

    @Value("${aliyun.sms.template_code}")
    private String template_code;

    @Value("${aliyun.sms.sign_name}")
    private String sign_name;

    @Override
    public void onMessage(String phone) {
        String checkCode = RandomStringUtils.randomNumeric(6);
        try {
            SendSmsResponse sendSmsResponse = smsUtil.sendSms(phone, template_code, sign_name, "{\"code\":\"" + checkCode + "\"}");
        } catch (ClientException e) {
            e.printStackTrace();
        }
//        redisTemplate.opsForValue().set(phone, checkCode);
        System.out.println("消息接收成功，验证码：" + checkCode);
    }

}
