package com.dongtu.service.impl;

import com.dongtu.mapper.TbSeckillProductMapper;
import com.dongtu.pojo.TbSeckillProduct;
import com.dongtu.pojo.TbSeckillProductVO;
import com.dongtu.service.TbSeckillProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbSeckillProductServiceImpl implements TbSeckillProductService {
    @Autowired
    private TbSeckillProductMapper tbSeckillProductMapper;

    @Override
    public void updateSeckillProduct(TbSeckillProduct tbSeckillProduct) {
        tbSeckillProductMapper.updateByPrimaryKeySelective(tbSeckillProduct);
    }

    @Override
    public List<TbSeckillProductVO> findSeckillProduct() {
        return tbSeckillProductMapper.findSeckillProduct();
    }
}
