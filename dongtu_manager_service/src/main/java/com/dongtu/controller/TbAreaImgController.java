package com.dongtu.controller;

import com.alibaba.fastjson.JSONObject;
import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.TbAreaImg;
import com.dongtu.service.TbAreaImgService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("tbAreaImgController")
@Api(value = "品牌地区接口" )
public class TbAreaImgController {

    @Autowired
    private TbAreaImgService tbAreaImgService;

    Logger logger = LoggerFactory.getLogger(TbInsureController.class);

    //查询所有品牌地区
    @ApiOperation(value = "查询所有品牌地区")
    @GetMapping("findAreaImgAll")
    public Result<List<TbAreaImg>> findAreaImgAll(){
        try {
            List<TbAreaImg> areaList = tbAreaImgService.findAreaImgAll();
            logger.info("查询所有品牌地区信息成功,参数为: {}"+ JSONObject.toJSONString(areaList));
            return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.FIND_SUCCESS.getMessage(),areaList);
        }catch (Exception e){
            logger.error("查询所有品牌地区信息失败",e);
            return new Result(ResultEnum.FAILED.getCode(),ResultEnum.FIND_FAILED.getMessage(),e);
        }
    }
    //根据地区Id查询品牌地区
    @ApiOperation(value = "根据地区Id查询品牌地区")
    @GetMapping("findAreaImgById/{areaId}")
    public Result<TbAreaImg> findAreaImgById(@PathVariable("areaId")Long areaId){
        try {
            TbAreaImg tbAreaImg = tbAreaImgService.findAreaImgById(areaId);
            logger.info("根据地区Id查询品牌地区信息成功,参数为: {}"+ JSONObject.toJSONString(tbAreaImg));
            return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.FIND_SUCCESS.getMessage(),tbAreaImg);
        }catch (Exception e){
            logger.error("根据地区Id查询品牌地区信息失败",e);
            return new Result(ResultEnum.FAILED.getCode(),ResultEnum.FIND_FAILED.getMessage(),e);
        }
    }

}