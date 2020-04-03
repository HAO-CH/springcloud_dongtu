package com.dongtu.service;

import com.dongtu.pojo.TbSeckillProduct;

import java.util.Date;
import java.util.List;

public interface SeckillService {
    List<TbSeckillProduct> findSeckillProductAll(Date atdate);
}
