package com.dongtu.mq;

import com.dongtu.pojo.EsPojo;
import com.dongtu.pojo.TbArea;
import com.dongtu.pojo.TbTravelProducts;
import com.dongtu.service.AreaService;
import com.dongtu.service.EsService;
import com.dongtu.service.TravelProductsService;
import org.apache.rocketmq.spring.annotation.MessageModel;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.mq
 * @ClassName: EsMq
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2020/1/1 18:59
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/1 18:59
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Service
//广播模式接收
@RocketMQMessageListener(topic = "travel-products", messageModel = MessageModel.BROADCASTING, consumerGroup = "manager-group")
public class EsMq  implements RocketMQListener<TbTravelProducts> {
    @Resource
    private EsService esService;
    @Resource
    private AreaService areaService;
    @Resource
    private TravelProductsService travelProductsService;

    @Override
    public void onMessage(TbTravelProducts tbTravelProducts) {
        //获取es对象  往对象中赋值
        EsPojo esPojo = new EsPojo();
        //商品的Id查询
        Long tpId = tbTravelProducts.getTpId();
        TbTravelProducts tbTravelProducts1 = travelProductsService.findByTravelTypeId(tpId);
        esPojo.setTpId(tbTravelProducts1.getTpId());
        esPojo.setTpTitle(tbTravelProducts1.getTpTitle());
        esPojo.setTpNum(tbTravelProducts1.getTpNum());
        esPojo.setTpAdultPrice(tbTravelProducts1.getTpAdultPrice());
        esPojo.setTpChildPrice(tbTravelProducts1.getTpChildPrice());
        esPojo.setTpImg(tbTravelProducts1.getTpImg());
        esPojo.setTpGoTime(tbTravelProducts1.getTpGoTime());
        esPojo.setMinPrice(tbTravelProducts1.getMinPrice());
        esPojo.setMaxPrice(tbTravelProducts1.getMaxPrice());
        esPojo.setTpSellerName(tbTravelProducts1.getTpSellerName());
        //地区Id查询
        Long tpAreaId = tbTravelProducts1.getTpAreaId();
        TbArea tbArea= areaService.findByAreaId(tpAreaId);
        esPojo.setTpAreaName(tbArea.getAreaName());

        esService.save(esPojo);
    }
}
