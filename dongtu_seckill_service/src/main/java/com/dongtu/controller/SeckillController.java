package com.dongtu.controller;

import com.alibaba.fastjson.JSONObject;
import com.dongtu.consts.RedisKeys;
import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.TbAdveField;
import com.dongtu.pojo.TbSeckillProduct;
import com.dongtu.service.SeckillService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("seckillController")
@Api(value = "秒杀接口" )
public class SeckillController {

    @Autowired
    private SeckillService seckillService;

    @Autowired
    private RedisTemplate redisTemplate;

    @Resource
    private StringRedisTemplate stringRedisTemplate;


    Logger logger = LoggerFactory.getLogger(SeckillController.class);

    //查询在秒杀时间内的商品
    @ApiOperation(value = "查询在秒杀时间内的商品")
    @GetMapping("findSeckillProductAll")
    public Result<List<TbSeckillProduct>> findSeckillProductAll(){
        try {
            List<TbSeckillProduct> mediaTypeList =null;
            if (redisTemplate.hasKey("tbSeckillProduct")){
                mediaTypeList =redisTemplate.boundHashOps("tbSeckillProduct").values();
            }else {
                mediaTypeList = seckillService.findSeckillProductAll(new Date());
                for (TbSeckillProduct tbSeckillProduct : mediaTypeList){
                    redisTemplate.boundHashOps("tbSeckillProduct").put(tbSeckillProduct.getId(),tbSeckillProduct);
                    redisTemplate.boundValueOps(tbSeckillProduct.getId()).set(tbSeckillProduct);
                    stringRedisTemplate.opsForValue().set(RedisKeys.NUM_ORDER+tbSeckillProduct.getId(),JSONObject.toJSONString(tbSeckillProduct.getSeckillStockCount()));
                }
            }
            logger.info("查询在秒杀时间内的商品成功");
            return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.FIND_SUCCESS.getMessage(),mediaTypeList);
        }catch (Exception e){
            logger.error("查询在秒杀时间内的商品失败",e);
            return new Result(ResultEnum.FAILED.getCode(),ResultEnum.FIND_FAILED.getMessage(),e);
        }
    }

}
