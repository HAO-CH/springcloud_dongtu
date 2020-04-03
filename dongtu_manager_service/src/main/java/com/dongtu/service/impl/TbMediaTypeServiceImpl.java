package com.dongtu.service.impl;

import com.dongtu.mapper.TbMediaTypeMapper;
import com.dongtu.pojo.TbMediaType;
import com.dongtu.pojo.TbMediaTypeExample;
import com.dongtu.service.TbMediaTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbMediaTypeServiceImpl implements TbMediaTypeService {

    @Resource
    private TbMediaTypeMapper tbMediaTypeMapper;

    @Override
    public List<TbMediaType> findMediaTypeAll() {
        return tbMediaTypeMapper.selectByExample(new TbMediaTypeExample());
    }
}
