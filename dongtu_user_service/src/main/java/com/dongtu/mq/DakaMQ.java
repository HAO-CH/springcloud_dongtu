package com.dongtu.mq;

import com.alibaba.fastjson.JSON;
import com.dongtu.mapper.TbUserMapper;
import com.dongtu.pojo.TbUser;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * 项目名称：springcloud_dongtu
 * 类名称：DakaMQ
 * 所在包:  com.dongtu.mq
 * 类描述：
 * 创建人：史德雨
 * 创建时间：2020年01月09日 22:08
 * 修改人：史德雨
 * 修改时间：2020年01月09日 22:08
 * 修改备注：
 * 版本号: 1.0v
 */
@Service
@RocketMQMessageListener(topic = "daka-topic", consumerGroup = "user-service-group")
public class DakaMQ implements RocketMQListener<TbUser> {

    @Resource
    private TbUserMapper tbUserMapper;

    Logger logger = LoggerFactory.getLogger(DakaMQ.class);

    @Override
    public void onMessage(TbUser user) {
        logger.info("打卡接受消息成功,参数为:{}"+ JSON.toJSONString(user));
        try {
            BigDecimal userPoints = user.getUserPoints();
            long longValue = userPoints.longValue();
            user.setUserPoints(BigDecimal.valueOf(longValue +  10L));
            tbUserMapper.updateByPrimaryKeySelective(user);
            logger.info("打卡添加积分成功,参数为:{}",JSON.toJSONString(user.getUserPoints()+"积分"));
        }catch (Exception e){
            logger.debug("打卡添加积分失败",e);
        }
    }

}
