package com.dongtu.controller;

import com.alibaba.fastjson.JSONObject;
import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.TbSeckillProduct;
import com.dongtu.pojo.TbSeckillProductVO;
import com.dongtu.service.TbSeckillProductService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("seckillProduct")
public class TbSeckillProductController {
    @Autowired
    private TbSeckillProductService tbSeckillProductService;
    Logger logger = LoggerFactory.getLogger(TbSeckillProductController.class);

    @ApiOperation("秒杀商品审核")
    @PutMapping("updateSeckillProduct")
    //根据传来的id和status的实体类对象修改审核状态
    public Result updateSeckillProduct(@RequestBody TbSeckillProduct tbSeckillProduct) {
        try {
            logger.debug("秒杀商品审核传入数据{}", JSONObject.toJSONString(tbSeckillProduct));
            tbSeckillProductService.updateSeckillProduct(tbSeckillProduct);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.UPDATE_SUCCESS.getMessage());
        } catch (Exception e) {
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.UPDATE_FAILED.getMessage(), e);
        }
    }

    @ApiOperation("秒杀商品查询")
    @GetMapping("findSeckillProduct")
    public Result findSeckillProduct() {
        try {
            List<TbSeckillProductVO> seckillProductVOList = tbSeckillProductService.findSeckillProduct();
            logger.debug("秒杀商品查询数据{}", JSONObject.toJSONString(seckillProductVOList));
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), seckillProductVOList);
        } catch (Exception e) {
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.FIND_FAILED.getMessage(), e);
        }
    }
}
