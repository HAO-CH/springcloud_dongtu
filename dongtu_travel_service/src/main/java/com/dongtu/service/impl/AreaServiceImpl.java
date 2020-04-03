package com.dongtu.service.impl;

import com.dongtu.mapper.TbAreaMapper;
import com.dongtu.pojo.TbArea;
import com.dongtu.pojo.TbAreaExample;
import com.dongtu.service.AreaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: HAO
 * @Date: 2019-12-28 11:59
 * @Desc:
 */
@Service
public class AreaServiceImpl implements AreaService {

    @Resource
    private TbAreaMapper areaMapper;

    @Override
    public List<TbArea> findArea(Long areaPid) {
        return areaMapper.findArea(areaPid);
    }

    @Override
    public TbArea findAreaByAreaPid(Long areaPid) {
        return areaMapper.selectByPrimaryKey(areaPid);
    }

    @Override
    public TbArea findAreaByAreaId(Long areaId) {
        return areaMapper.selectByPrimaryKey(areaId);
    }
}
