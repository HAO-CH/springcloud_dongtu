package com.dongtu.service;

import com.dongtu.pojo.TagProducys;

import java.util.List;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.service
 * @ClassName: TbTagService
 * @Description: java类作用描述
 * @Author: DengQing
 * @CreateDate: 2020/1/14 10:51
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/14 10:51
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface TbTagService {
    List<TagProducys> findTag(Long tpId);
}
