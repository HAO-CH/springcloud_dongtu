package com.dongtu.service;

import com.dongtu.pojo.TbTravelProducts;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.service
 * @ClassName: TravelProductsService
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2020/1/2 10:08
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/2 10:08
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface TravelProductsService {
    TbTravelProducts findByTravelTypeId(Long tpId);
}
