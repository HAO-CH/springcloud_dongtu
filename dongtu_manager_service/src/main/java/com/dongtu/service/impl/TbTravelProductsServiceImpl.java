package com.dongtu.service.impl;

import com.dongtu.mapper.TbTravelProductsMapper;
import com.dongtu.pojo.TbTravelProducts;
import com.dongtu.pojo.TbTravelProductsExample;
import com.dongtu.pojo.TbTravelProductsVo;
import com.dongtu.service.TbTravelProductsService;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbTravelProductsServiceImpl implements TbTravelProductsService {
    @Autowired
    private TbTravelProductsMapper tbTravelProductsMapper;

    @Override
    public void updateTravelProductsStatus(TbTravelProducts tbTravelProducts) {
        tbTravelProductsMapper.updateByPrimaryKeySelective(tbTravelProducts);
    }

    @Override
    public void insertTravelProducts(TbTravelProducts tbTravelProducts) {
        tbTravelProductsMapper.insertSelective(tbTravelProducts);
    }

    @Override
    public List<TbTravelProductsVo> findTravelProducts() {
        return tbTravelProductsMapper.findTravelProducts();
    }

    @Override
    public void deleteTravelProducts(TbTravelProducts tbTravelProducts) {
        tbTravelProductsMapper.updateByPrimaryKeySelective(tbTravelProducts);
    }

    @Override
    public List<TbTravelProducts> findTravelProductsByTravelTypeId(Long travelTypeId) {
        TbTravelProductsExample example = new TbTravelProductsExample();
        TbTravelProductsExample.Criteria criteria = example.createCriteria();
        //没删除的
        criteria.andIsDeleteEqualTo(0);
        //审核通过的
        criteria.andTpStatusEqualTo(1);
        //travelTypeId为1是出境自由行2是出境跟团游3境内自由行4境内跟团游
        criteria.andTravelTypeIdEqualTo(travelTypeId);
        //分页每次查询8条数据
        PageHelper.startPage(0, 8);
        return tbTravelProductsMapper.selectByExample(example);
    }

    @Override
    public TbTravelProducts findTravelProductsByTpId(Long tyId) {
        return tbTravelProductsMapper.selectByPrimaryKey(tyId);
    }

    @Override
    public List<TbTravelProducts> findEightTravelProducts() {
        TbTravelProductsExample example = new TbTravelProductsExample();
        TbTravelProductsExample.Criteria criteria = example.createCriteria();
        //按最小价格进行排序
        example.setOrderByClause("min_price");
        //没删除的
        criteria.andIsDeleteEqualTo(0);
        //审核通过的
        criteria.andTpStatusEqualTo(1);
        //分页八条
        PageHelper.startPage(0,8);
        return tbTravelProductsMapper.selectByExample(example);
    }
}
