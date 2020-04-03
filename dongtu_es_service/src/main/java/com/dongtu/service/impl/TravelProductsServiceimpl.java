package com.dongtu.service.impl;

import com.dongtu.mapper.TbTravelProductsMapper;
import com.dongtu.pojo.TbTravelProducts;
import com.dongtu.service.TravelProductsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.service.impl
 * @ClassName: TravelProductsServiceimpl
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2020/1/2 10:08
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/2 10:08
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Service
public class TravelProductsServiceimpl implements TravelProductsService {
    @Resource
    private TbTravelProductsMapper tbTravelProductsMapper;

    @Override
    public TbTravelProducts findByTravelTypeId(Long tpId) {
        return tbTravelProductsMapper.selectByPrimaryKey(tpId);
    }
}
