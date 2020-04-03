package com.dongtu.service;

import org.apache.rocketmq.spring.annotation.MessageModel;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Map;

/**
 * @Author: HAO
 * @Date: 2020-01-02 11:13
 * @Desc:
 */
@Component
@RocketMQMessageListener(topic = "points-group", consumerGroup = "consumer-group", messageModel = MessageModel.BROADCASTING)
public class PointsServcie implements RocketMQListener<Map> {

    @Resource
    private PointsServiceI pointsService;

    @Override
    public void onMessage(Map map) {
        Integer userId1 = (Integer) map.get("userId");
        Long userId = Long.valueOf(userId1);
        Object total_amount = map.get("total_amount");
        Long points = new BigDecimal(String.valueOf(total_amount)).longValue();
        pointsService.updatePoints(userId, points);
    }
}
