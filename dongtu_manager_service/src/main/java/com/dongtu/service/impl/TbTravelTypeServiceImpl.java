package com.dongtu.service.impl;

import com.dongtu.mapper.TbTravelTypeMapper;
import com.dongtu.pojo.TbTravelType;
import com.dongtu.pojo.TbTravelTypeExample;
import com.dongtu.service.TbTravelTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbTravelTypeServiceImpl implements TbTravelTypeService {
    @Autowired
    private TbTravelTypeMapper tbTravelTypeMapper;

    @Override
    public List<TbTravelType> findTravelTypeAll() {
        return tbTravelTypeMapper.selectByExample(new TbTravelTypeExample());
    }
}
