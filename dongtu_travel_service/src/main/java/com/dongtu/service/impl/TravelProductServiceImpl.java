package com.dongtu.service.impl;

import com.dongtu.mapper.TagProducysMapper;
import com.dongtu.mapper.TbTravelProductsMapper;
import com.dongtu.pojo.TagProducys;
import com.dongtu.pojo.TbTravelProducts;
import com.dongtu.pojo.TbTravelProductsExample;
import com.dongtu.service.TravelProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: HAO
 * @Date: 2019-12-27 20:03
 * @Desc:
 */
@Service
public class TravelProductServiceImpl implements TravelProductService {

    @Resource
    private TbTravelProductsMapper travelProductsMapper;

    @Resource
    private TagProducysMapper tagProducysMapper;

    @Override
    public List<TbTravelProducts> findAll() {
        return travelProductsMapper.selectByExample(new TbTravelProductsExample());
    }

    @Override
    public void addTravelProducts(TbTravelProducts travelProducts) {
        travelProductsMapper.addTravelProductsId(travelProducts);
    }

    @Override
    public TbTravelProducts findById(Long tpId) {
        return travelProductsMapper.selectByPrimaryKey(tpId);
    }

    @Override
    public void updateTravelProducts(TbTravelProducts travelProducts) {
        travelProductsMapper.updateByPrimaryKeySelective(travelProducts);
    }

    @Override
    public void deleteTravelProductsById(Long tpId) {
        travelProductsMapper.deleteByPrimaryKey(tpId);
    }

    @Override
    public List<TbTravelProducts> findTravelProductsBySellerId(Long tpSellerId) {
        return travelProductsMapper.findTravelProductsBySellerId(tpSellerId);
    }

    @Override
    public List<TbTravelProducts> findProductsByAreaId(Long areaId) {
        return travelProductsMapper.findProductsByAreaId(areaId);
    }

    @Override
    public TbTravelProducts findByProductById(Long trTravelId) {
        return travelProductsMapper.selectByPrimaryKey(trTravelId);
    }

    @Override
    public List<TbTravelProducts> findNewsTravelAll() {
        return travelProductsMapper.findNewsTravelAll();
    }

    @Override
    public void insertBatch(List<TagProducys> list) {
        tagProducysMapper.insertBatch(list);
    }
}
