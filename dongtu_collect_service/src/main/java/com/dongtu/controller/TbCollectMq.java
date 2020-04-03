package com.dongtu.controller;

import com.dongtu.pojo.TbCollect;
import com.dongtu.service.TbCollectService;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.controller
 * @ClassName: TbCollectMq
 * @Description: java类作用描述
 * @Author: DengQing
 * @CreateDate: 2020/1/9 14:49
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/9 14:49
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Component
@RocketMQMessageListener(topic = "collect-product", consumerGroup = "collect-product")
public class TbCollectMq implements RocketMQListener<TbCollect> {
    @Autowired
    private TbCollectService tbCollectService;
    Logger logger = LoggerFactory.getLogger(TbCollectMq.class);

    //接收收藏mq进行入库
    @Override
    public void onMessage(TbCollect tbCollect) {
        logger.debug("mq接收成功{}", tbCollect.toString());
        tbCollectService.insertCollect(tbCollect);
    }
}
