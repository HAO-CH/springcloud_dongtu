package com.dongtu.service.impl;

import com.dongtu.mapper.TbAdveFieldMapper;
import com.dongtu.pojo.TbAdveField;
import com.dongtu.pojo.TbAdveFieldExample;
import com.dongtu.service.TbAdveFieldService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbAdveFieldServiceImpl implements TbAdveFieldService {

    @Resource
    private TbAdveFieldMapper tbAdveFieldMapper;

    @Override
    public List<TbAdveField> findTbAdveFieldAll() {
        return tbAdveFieldMapper.selectByExample(new TbAdveFieldExample());
    }
}
