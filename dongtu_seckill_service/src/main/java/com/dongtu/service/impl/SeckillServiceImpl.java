package com.dongtu.service.impl;

import com.dongtu.mapper.TbSeckillProductMapper;
import com.dongtu.pojo.TbSeckillProduct;
import com.dongtu.service.SeckillService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class SeckillServiceImpl implements SeckillService {

    @Resource
    private TbSeckillProductMapper tbSeckillProductMapper;

    @Override
    public List<TbSeckillProduct> findSeckillProductAll(Date presentTime) {
        return tbSeckillProductMapper.findSeckillProductAll(presentTime);
    }
}
