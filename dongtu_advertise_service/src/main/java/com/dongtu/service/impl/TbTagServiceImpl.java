package com.dongtu.service.impl;

import com.dongtu.mapper.TagProducysMapper;
import com.dongtu.mapper.TbTagMapper;
import com.dongtu.pojo.TagProducys;
import com.dongtu.pojo.TagProducysExample;
import com.dongtu.service.TbTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.service.impl
 * @ClassName: TbTagServiceImpl
 * @Description: java类作用描述
 * @Author: DengQing
 * @CreateDate: 2020/1/14 10:51
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/14 10:51
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Service
public class TbTagServiceImpl implements TbTagService {
    @Autowired
    private TagProducysMapper tagProducysMapper;

    @Override
    public List<TagProducys> findTag(Long tpId) {
        TagProducysExample example = new TagProducysExample();
        TagProducysExample.Criteria criteria = example.createCriteria();
        criteria.andTpIdEqualTo(tpId);
        return tagProducysMapper.selectByExample(example);
    }
}
