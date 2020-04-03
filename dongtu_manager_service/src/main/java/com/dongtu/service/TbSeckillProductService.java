package com.dongtu.service;

import com.dongtu.pojo.TbSeckillProduct;
import com.dongtu.pojo.TbSeckillProductVO;

import java.util.List;

public interface TbSeckillProductService {
    void updateSeckillProduct(TbSeckillProduct tbSeckillProduct);

    List<TbSeckillProductVO> findSeckillProduct();
}
