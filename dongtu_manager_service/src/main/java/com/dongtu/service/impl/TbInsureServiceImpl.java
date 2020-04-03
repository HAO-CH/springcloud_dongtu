package com.dongtu.service.impl;

import com.dongtu.mapper.TbInsureMapper;
import com.dongtu.pojo.TbInsure;
import com.dongtu.pojo.TbInsureExample;
import com.dongtu.service.TbInsureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbInsureServiceImpl implements TbInsureService {

    @Resource
    private TbInsureMapper insureMapper;

    @Override
    public List<TbInsure> findInsureAll() {
        return insureMapper.selectByExample(new TbInsureExample());
    }

    @Override
    public void saveContentInfo(TbInsure tbInsure) {
        insureMapper.insertSelective(tbInsure);
    }

    @Override
    public TbInsure toUpdateInsureById(Integer id) {
        return insureMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateInsureInfo(TbInsure tbInsure) {
        insureMapper.updateByPrimaryKeySelective(tbInsure);
    }

    @Override
    public void deleteInsureInfo(Integer id) {
        insureMapper.deleteByPrimaryKey(id);
    }
}
