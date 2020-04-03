package com.dongtu.service;

import com.dongtu.pojo.TbSeckillProduct;

import java.util.List;

public interface SeckillProductService {
    List<TbSeckillProduct> findAll();

    void addSeckillProduct(TbSeckillProduct seckillProduct);

    TbSeckillProduct findById(Long id);

    void updateSeckillProduct(TbSeckillProduct seckillProduct);

    void deleteSeckillProductById(Long id);

    List<TbSeckillProduct> findSeckillProductBySellerId(Long seckillTravelSellerId);
}
