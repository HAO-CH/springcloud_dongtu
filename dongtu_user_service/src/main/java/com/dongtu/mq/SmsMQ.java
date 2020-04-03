package com.dongtu.mq;

import com.aliyuncs.exceptions.ClientException;
import com.dongtu.util.SmsUtil;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ProjectName: dongdongshang_parent
 * @Package: com.dongdong.Mq
 * @ClassName: SmsMQ
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2019/11/22 22:16
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/11/22 22:16
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Service
@RocketMQMessageListener(topic = "my-group", consumerGroup = "consumer-group")
public class SmsMQ implements RocketMQListener<String> {
    @Resource
    private SmsUtil smsUtil;
    @Value("${aliyun.sms.template_code}")
    private String template_code;

    @Value("${aliyun.sms.sign_name}")
    private String sign_name;

    @Resource
    private RedisTemplate redisTemplate;


    @Override
    public void onMessage(String phone) {
        String ckeckcode = RandomStringUtils.randomNumeric(6);
        if (!redisTemplate.hasKey(phone)){
            redisTemplate.boundValueOps(phone).set(ckeckcode);
        }
        try {
            smsUtil.sendSms(phone,template_code,sign_name,"{\"ver_code\":\""+ ckeckcode+"\"}");
        } catch (ClientException e) {
            e.printStackTrace();
        }
        System.out.println("dux接收成功");

    }
}
