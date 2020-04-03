package com.dongtu.controller;

import com.alibaba.fastjson.JSONObject;
import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.TbAdveField;
import com.dongtu.pojo.TbAdvertisement;
import com.dongtu.pojo.TbAdvertisementVO;
import com.dongtu.pojo.TbMediaType;
import com.dongtu.service.TbAdveFieldService;
import com.dongtu.service.TbAdvertisementService;
import com.dongtu.service.TbMediaTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("advertisementController")
@Api(value = "广告管理接口" )
public class TbAdvertisementController {

    @Autowired
    private TbAdvertisementService tbAdvertisementService;
    @Autowired
    private TbMediaTypeService tbMediaTypeService;
    @Autowired
    private TbAdveFieldService tbAdveFieldService;

    Logger logger = LoggerFactory.getLogger(TbInsureController.class);

    //查询媒介分类
    @ApiOperation(value = "查询媒介分类")
    @GetMapping("findMediaTypeAll")
    public Result<List<TbMediaType>> findMediaTypeAll(){
        try {
            List<TbMediaType> mediaTypeList = tbMediaTypeService.findMediaTypeAll();
            logger.info("查询媒介分类成功");
            return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.FIND_SUCCESS.getMessage(),mediaTypeList);
        }catch (Exception e){
            logger.error("查询媒介分类失败",e);
            return new Result(ResultEnum.FAILED.getCode(),ResultEnum.FIND_FAILED.getMessage(),e);
        }
    }

    //查询广告栏位分类
    @ApiOperation(value = "查询广告栏位分类")
    @GetMapping("findTbAdveFieldAll")
    public Result<List<TbAdveField>> findTbAdveFieldAll(){
        try {
            List<TbAdveField> mediaTypeList = tbAdveFieldService.findTbAdveFieldAll();
            logger.info("查询广告栏位分类成功");
            return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.FIND_SUCCESS.getMessage(),mediaTypeList);
        }catch (Exception e){
            logger.error("查询广告栏位分类失败",e);
            return new Result(ResultEnum.FAILED.getCode(),ResultEnum.FIND_FAILED.getMessage(),e);
        }
    }

    //查询所有广告信息
    @ApiOperation(value = "查询所有广告信息")
    @GetMapping("findAdvertisementAll")
    public Result<List<TbAdvertisementVO>> findAdvertisementAll(){
        try {
            List<TbAdvertisementVO> advertisementList = tbAdvertisementService.findAdvertisementAll();
            logger.info("查询广告信息成功,参数为: {}"+ JSONObject.toJSONString(advertisementList));
            return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.FIND_SUCCESS.getMessage(),advertisementList);
        }catch (Exception e){
            logger.error("查询广告信息失败",e);
            return new Result(ResultEnum.FAILED.getCode(),ResultEnum.FIND_FAILED.getMessage(),e);
        }
    }

    //添加广告信息
    @ApiOperation(value = "添加广告信息")
    @PostMapping("saveAdvertisement")
    public Result saveAdvertisement(@RequestBody TbAdvertisement tbAdvertisement){
        try {
            logger.info("添加广告信息成功，参数：{}", JSONObject.toJSONString(tbAdvertisement));
            tbAdvertisementService.saveAdvertisement(tbAdvertisement);
            return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.INSERT_SUCCESS.getMessage(),null);
        }catch (Exception e){
            logger.error("添加广告信息失败",e);
            return new Result(ResultEnum.FAILED.getCode(),ResultEnum.INSERT_FAILED.getMessage(),e);
        }
    }
    //修改广告信息回显
    @ApiOperation(value = "修改广告信息回显")
    @GetMapping("toUpdateAdvertisementById/{id}")
    public Result<TbAdvertisement> toUpdateAdvertisementById(@PathVariable("id")Long id){
        try {
            TbAdvertisement advertisement = tbAdvertisementService.toUpdateAdvertisementById(id);
            logger.info("回显广告信息成功，结果为：{}", JSONObject.toJSONString(advertisement));
            return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.FIND_SUCCESS.getMessage(),advertisement);
        }catch (Exception e){
            logger.error("回显广告信息失败",e);
            return new Result(ResultEnum.FAILED.getCode(),ResultEnum.FIND_FAILED.getMessage(),e);
        }
    }
    //修改广告信息回显
    @ApiOperation(value = "根据广告Id查询")
    @GetMapping("findAdvertisementById/{adId}")
    public Result<TbAdvertisement> findAdvertisementById(@PathVariable("adId")Long adId){
        try {
            TbAdvertisement advertisement = tbAdvertisementService.findAdvertisementById(adId);
            logger.info("根据广告Id查询信息成功，结果为：{}", JSONObject.toJSONString(advertisement));
            return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.FIND_SUCCESS.getMessage(),advertisement);
        }catch (Exception e){
            logger.error("根据广告Id查询失败",e);
            return new Result(ResultEnum.FAILED.getCode(),ResultEnum.FIND_FAILED.getMessage(),e);
        }
    }
    //确认修改广告信息
    @ApiOperation(value = "确认修改广告信息")
    @PutMapping("updateAdvertisementInfo")
    public Result updateAdvertisementInfo(@RequestBody TbAdvertisement advertisement){
        try {
            tbAdvertisementService.updateAdvertisementInfo(advertisement);
            logger.info("修改广告信息成功，参数：{}", JSONObject.toJSONString(advertisement));
            return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.UPDATE_SUCCESS.getMessage());
        }catch (Exception e){
            logger.error("修改广告信息失败",e);
            return new Result(ResultEnum.FAILED.getCode(),ResultEnum.UPDATE_FAILED.getMessage(),e);
        }
    }
    //确认删除广告信息
    @ApiOperation(value = "确认删除广告信息")
    @DeleteMapping("deleteAdvertisementById/{id}")
    public Result deleteAdvertisementById(@PathVariable Long id){
        try {
            tbAdvertisementService.deleteAdvertisementById(id);
            logger.info("删除广告信息成功");
            return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.DELETE_SUCCESS.getMessage());
        }catch (Exception e){
            logger.error("删除广告信息失败",e);
            return new Result(ResultEnum.FAILED.getCode(),ResultEnum.DELETE_FAILED.getMessage(),e);
        }
    }

    //查询所有轮播图广告信息
    @ApiOperation(value = "查询所有轮播图广告信息")
    @GetMapping("/getContentsInfosPlanting")
    public Result<List<TbAdvertisement>> getContentsInfosPlanting(){
        try {
            List<TbAdvertisement> plist = tbAdvertisementService.getContentsInfosPlanting();
            logger.info("查询轮播图广告信息成功，{}", JSONObject.toJSONString(plist));
            return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.FIND_SUCCESS.getMessage(),plist);
        }catch (Exception e){
            logger.error("查询轮播图广告信息失败",e);
            return new Result(ResultEnum.FAILED.getCode(),ResultEnum.FIND_FAILED.getMessage(),e);
        }
    }

    //查询今日推荐广告信息
    @ApiOperation(value = "查询今日推荐广告信息")
    @GetMapping("/TodayRecommend")
    public Result<List<TbAdvertisement>> TodayRecommend(){
        try {
            List<TbAdvertisement> tlist = tbAdvertisementService.TodayRecommend();
            logger.info("查询今日推荐广告信息成功，{}", JSONObject.toJSONString(tlist));
            return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.FIND_SUCCESS.getMessage(),tlist);
        }catch (Exception e){
            logger.error("查询今日推荐广告信息失败",e);
            return new Result(ResultEnum.FAILED.getCode(),ResultEnum.FIND_FAILED.getMessage(),e);
        }
    }
}
