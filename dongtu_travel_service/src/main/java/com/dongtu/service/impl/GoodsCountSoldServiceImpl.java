package com.dongtu.service.impl;

import com.dongtu.mapper.TbGoodsCountSoldMapper;
import com.dongtu.pojo.TbGoodsCountSold;
import com.dongtu.service.GoodsCountSoldService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @Author: HAO
 * @Date: 2020-01-10 14:12
 * @Desc:
 */
@Service
public class GoodsCountSoldServiceImpl implements GoodsCountSoldService {

    @Resource
    private TbGoodsCountSoldMapper goodsCountSoldMapper;

    @Override
    public void addCountSold(TbGoodsCountSold countSold) {
        goodsCountSoldMapper.insertSelective(countSold);
    }

    @Override
    public List<TbGoodsCountSold> findByHours(Date date, Date date1, Long sellerId) {
        return goodsCountSoldMapper.findByHours(date, date1, sellerId);
    }
}
