package com.dongtu.service.impl;

import com.dongtu.mapper.TbAreaImgMapper;
import com.dongtu.pojo.TbAreaImg;
import com.dongtu.pojo.TbAreaImgExample;
import com.dongtu.service.TbAreaImgService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbAreaImgServiceImpl implements TbAreaImgService {

    @Resource
    private TbAreaImgMapper imgMapper;

    @Override
    public List<TbAreaImg> findAreaImgAll() {
        return imgMapper.selectByExample(new TbAreaImgExample());
    }

    @Override
    public TbAreaImg findAreaImgById(Long areaId) {
        return imgMapper.selectByPrimaryKey(areaId);
    }
}
