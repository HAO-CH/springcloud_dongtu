package com.dongtu.service;

import com.dongtu.consts.Result;
import com.dongtu.pojo.TbPubSeller;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.service
 * @ClassName: PubSellerService
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2019/12/28 11:15
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/12/28 11:15
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface PubSellerService {
    void addPubSeller(TbPubSeller tbPubSeller);

    Result findByName(String pubName);

    TbPubSeller findByNameLogin(String username);
}
