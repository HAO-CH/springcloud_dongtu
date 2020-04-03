package com.dongtu.controller;

import com.alibaba.fastjson.JSONObject;
import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.TbTravelSeller;
import com.dongtu.service.TbTravelSellerService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("travelSeller")
public class TbTravelSellerController {
    @Autowired
    private TbTravelSellerService tbTravelSellerService;
    Logger logger = LoggerFactory.getLogger(TbTravelSellerController.class);

    @ApiOperation("旅游商家审核")
    @PutMapping("updateTravelSellerStatus")
    public Result updateTravelSellerStatus(@RequestBody TbTravelSeller tbTravelSeller) {
        try {
            logger.debug("商家审核传入的参数为{}", JSONObject.toJSONString(tbTravelSeller));
            //根据传入的实体类对象进行修改（实体类对象主要是id和status的值）
            tbTravelSellerService.updateTravelSellerStatus(tbTravelSeller);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.UPDATE_SUCCESS.getMessage());
        } catch (Exception e) {
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.UPDATE_FAILED.getMessage());
        }
    }

    @ApiOperation("旅游商家查询")
    @GetMapping("findTravelSeller")
    public Result findTravelSeller() {
        try {
            //查询所有的商家信息
            List<TbTravelSeller> tbTravelSellerList = tbTravelSellerService.findTravelSeller();
            logger.debug("商家查询到的参数为{}", JSONObject.toJSONString(tbTravelSellerList));
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), tbTravelSellerList);
        } catch (Exception e) {
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.FIND_FAILED.getMessage(), e);
        }
    }
}
