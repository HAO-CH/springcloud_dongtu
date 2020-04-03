package com.dongtu.service;

import com.dongtu.pojo.TbArea;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.service
 * @ClassName: AreaService
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2020/1/2 10:06
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/2 10:06
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface AreaService {
    TbArea findByAreaId(Long tpAreaId);
}
