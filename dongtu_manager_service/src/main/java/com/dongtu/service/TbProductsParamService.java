package com.dongtu.service;

import com.dongtu.pojo.TbProductsParam;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.service
 * @ClassName: TbProductsParamService
 * @Description: java类作用描述
 * @Author: DengQing
 * @CreateDate: 2020/1/7 20:42
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/7 20:42
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface TbProductsParamService {
    TbProductsParam findProductParamByTpId(Long tpId);
}
