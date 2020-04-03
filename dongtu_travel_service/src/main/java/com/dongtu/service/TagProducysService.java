package com.dongtu.service;

import com.dongtu.pojo.TagProducys;
import com.dongtu.pojo.TbTag;

import java.util.List;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.service
 * @ClassName: TagProducysService
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2020/1/14 14:41
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/14 14:41
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface TagProducysService {
    List<TbTag> findAll();

    List<TagProducys> findTag(Long tabId);
}
