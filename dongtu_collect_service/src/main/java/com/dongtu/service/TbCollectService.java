package com.dongtu.service;

import com.dongtu.pojo.TbCollect;
import com.dongtu.pojo.TbUser;

import java.util.List;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.service
 * @ClassName: TbCollectService
 * @Description: java类作用描述
 * @Author: DengQing
 * @CreateDate: 2020/1/9 11:37
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/9 11:37
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface TbCollectService {
    void insertCollect(TbCollect tbCollect);

    TbCollect findCollectByTpIdAndUserName(TbCollect tbCollect);

    List<TbCollect> findMyCollect(TbUser user);
}
