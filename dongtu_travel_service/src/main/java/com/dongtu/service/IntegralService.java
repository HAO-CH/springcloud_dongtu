package com.dongtu.service;

import com.dongtu.pojo.IntegralGoods;

import java.util.List;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.service
 * @ClassName: IntegralService
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2020/1/9 21:13
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/9 21:13
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface IntegralService {
    List<IntegralGoods> findAll();

    void addIntegralGoods(IntegralGoods integralGoods);

    void updateIntegralGoods(IntegralGoods integralGoods);

    IntegralGoods findByGoodsId(Long goodsId);
}
