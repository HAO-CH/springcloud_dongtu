package com.dongtu.service.impl;

import com.dongtu.mapper.TbTravelSellerMapper;
import com.dongtu.pojo.TbTravelSeller;
import com.dongtu.pojo.TbTravelSellerExample;
import com.dongtu.service.TravelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: HAO
 * @Date: 2019-12-27 17:30
 * @Desc:
 */

@Service
public class TravelServiceImpl implements TravelService {

    @Resource
    private TbTravelSellerMapper travelSellerMapper;

    @Override
    public List<TbTravelSeller> findAll() {
        return travelSellerMapper.selectByExample(new TbTravelSellerExample());
    }

    @Override
    public TbTravelSeller findById(Long travelSellerId) {
        return travelSellerMapper.selectByPrimaryKey(travelSellerId);
    }

    @Override
    public void updateTravelSeller(TbTravelSeller travelSeller) {
        travelSellerMapper.updateByPrimaryKeySelective(travelSeller);
    }

    @Override
    public void deleteTravelSellerById(Long travelSellerId) {
        travelSellerMapper.deleteByPrimaryKey(travelSellerId);
    }

    @Override
    public void addTravelSeller(TbTravelSeller travelSeller) {
        travelSellerMapper.insertSelective(travelSeller);
    }

    @Override
    public TbTravelSeller findSellerByName(String travelName) {
        return travelSellerMapper.findSellerByName(travelName);
    }
}
