package com.dongtu.service.impl;

import com.dongtu.mapper.TbSeckillProductMapper;
import com.dongtu.pojo.TbSeckillProduct;
import com.dongtu.pojo.TbSeckillProductExample;
import com.dongtu.service.SeckillProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: HAO
 * @Date: 2019-12-27 20:12
 * @Desc:
 */
@Service
public class SeckillProductServiceImpl implements SeckillProductService {

    @Resource
    private TbSeckillProductMapper seckillProductMapper;

    @Override
    public List<TbSeckillProduct> findAll() {
        return seckillProductMapper.selectByExample(new TbSeckillProductExample());
    }

    @Override
    public void addSeckillProduct(TbSeckillProduct seckillProduct) {
        seckillProductMapper.insertSelective(seckillProduct);
    }

    @Override
    public TbSeckillProduct findById(Long id) {
        return seckillProductMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateSeckillProduct(TbSeckillProduct seckillProduct) {
        seckillProductMapper.updateByPrimaryKeySelective(seckillProduct);
    }

    @Override
    public void deleteSeckillProductById(Long id) {
        seckillProductMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<TbSeckillProduct> findSeckillProductBySellerId(Long seckillTravelSellerId) {
        return seckillProductMapper.findSeckillProductBySellerId(seckillTravelSellerId);
    }
}
