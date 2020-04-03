package com.dongtu.service;

import com.dongtu.pojo.IntegralItem;

import java.util.List;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.service
 * @ClassName: IntegralService
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2020/1/10 17:37
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/10 17:37
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface IntegralService {
    void addOrderIntegral(IntegralItem integralItem);

    List<IntegralItem> findByUserIdOrder(Long userId);
}
