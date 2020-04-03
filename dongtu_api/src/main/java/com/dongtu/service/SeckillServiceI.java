package com.dongtu.service;

import com.dongtu.consts.Result;
import com.dongtu.pojo.TbSeckillProduct;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * 秒杀服务接口
 */
@FeignClient(value = "DONGTU-SECKILL-SERVICE")
public interface SeckillServiceI {

    //秒杀 查询在秒杀时间内的商品
    @GetMapping("/seckillController/findSeckillProductAll")
    public Result<List<TbSeckillProduct>> findSeckillProductAll();

}
