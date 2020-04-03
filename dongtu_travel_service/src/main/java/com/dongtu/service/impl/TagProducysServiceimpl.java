package com.dongtu.service.impl;

import com.dongtu.mapper.TagProducysMapper;
import com.dongtu.mapper.TbTagMapper;
import com.dongtu.pojo.TagProducys;
import com.dongtu.pojo.TagProducysExample;
import com.dongtu.pojo.TbTag;
import com.dongtu.pojo.TbTagExample;
import com.dongtu.service.TagProducysService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.service.impl
 * @ClassName: TagProducysServiceimpl
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2020/1/14 14:42
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/14 14:42
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Service
public class TagProducysServiceimpl implements TagProducysService {
    @Resource
    private TagProducysMapper tagProducysMapper;

    @Resource
    private TbTagMapper tbTagMapper;

    @Override
    public List<TbTag> findAll() {
        return tbTagMapper.selectByExample(new TbTagExample());
    }

    @Override
    public List<TagProducys> findTag(Long tabId) {
        TagProducysExample example = new TagProducysExample();
        TagProducysExample.Criteria criteria = example.createCriteria();
        criteria.andTagIdEqualTo(tabId);
        return tagProducysMapper.selectByExample(example);
    }
}
