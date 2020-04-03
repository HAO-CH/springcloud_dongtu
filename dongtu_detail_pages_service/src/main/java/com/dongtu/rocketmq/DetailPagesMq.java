package com.dongtu.rocketmq;

import com.alibaba.fastjson.JSONObject;
import com.dongtu.pojo.TbTravelProducts;
import com.dongtu.service.DetailPagesService;
import org.apache.rocketmq.spring.annotation.MessageModel;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//广播模式接收travel-products
@RocketMQMessageListener(topic = "travel-products", messageModel = MessageModel.BROADCASTING, consumerGroup = "manager-group")
public class DetailPagesMq implements RocketMQListener<TbTravelProducts> {
    @Autowired
    private DetailPagesService detailPagesService;
    Logger logger = LoggerFactory.getLogger(DetailPagesMq.class);

    //接收审核成功的旅游商品实体
    @Override
    public void onMessage(TbTravelProducts tbTravelProducts) {
        logger.debug("消息接收成功{}", JSONObject.toJSONString(tbTravelProducts));
        detailPagesService.BuildDetailPages(tbTravelProducts);
    }
}
