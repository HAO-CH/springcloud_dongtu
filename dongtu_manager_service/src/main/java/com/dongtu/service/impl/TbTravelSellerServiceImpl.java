package com.dongtu.service.impl;

import com.dongtu.mapper.TbTravelSellerMapper;
import com.dongtu.pojo.TbTravelSeller;
import com.dongtu.pojo.TbTravelSellerExample;
import com.dongtu.service.TbTravelSellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbTravelSellerServiceImpl implements TbTravelSellerService {
    @Autowired
    private TbTravelSellerMapper tbTravelSellerMapper;

    @Override
    public void updateTravelSellerStatus(TbTravelSeller tbTravelSeller) {
        tbTravelSellerMapper.updateByPrimaryKeySelective(tbTravelSeller);
    }

    @Override
    public List<TbTravelSeller> findTravelSeller() {
        return tbTravelSellerMapper.selectByExample(new TbTravelSellerExample());
    }
}
