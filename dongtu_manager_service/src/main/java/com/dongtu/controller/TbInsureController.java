package com.dongtu.controller;

import com.alibaba.fastjson.JSONObject;
import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.TbInsure;
import com.dongtu.service.TbInsureService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("insureController")
@Api(value = "保险管理接口" )
public class TbInsureController {

    @Autowired
    private TbInsureService tbInsureService;

    Logger logger = LoggerFactory.getLogger(TbInsureController.class);

    //查询所有保险
    @ApiOperation(value = "查询保险信息成功")
    @GetMapping("findInsureAll")
    public Result<List<TbInsure>> findInsureAll(){
        try {
            List<TbInsure> insureList = tbInsureService.findInsureAll();
            logger.info("查询保险信息成功,参数为: {}"+ JSONObject.toJSONString(insureList));
            return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.FIND_SUCCESS.getMessage(),insureList);
        }catch (Exception e){
            logger.error("查询保险信息失败",e);
            return new Result(ResultEnum.FAILED.getCode(),ResultEnum.FIND_FAILED.getMessage(),e);
        }
    }
    //添加保险信息
    @ApiOperation(value = "添加保险信息")
    @PostMapping("saveInsurenfo")
    public Result saveContentInfo(@RequestBody TbInsure tbInsure){
        try {
            tbInsureService.saveContentInfo(tbInsure);
            logger.info("添加保险信息成功，参数：{}", JSONObject.toJSONString(tbInsure));
            return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.INSERT_SUCCESS.getMessage(),null);
        }catch (Exception e){
            logger.error("添加保险信息失败",e);
            return new Result(ResultEnum.FAILED.getCode(),ResultEnum.INSERT_FAILED.getMessage(),e);
        }
    }
    //修改保险信息回显
    @ApiOperation(value = "修改保险信息回显")
    @GetMapping("toUpdateInsureById/{id}")
    public Result<TbInsure> toUpdateContentInfo(@PathVariable("id")Integer id){
        try {
            TbInsure insure = tbInsureService.toUpdateInsureById(id);
            logger.info("回显保险信息成功，结果为：{}", JSONObject.toJSONString(insure));
            return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.FIND_SUCCESS.getMessage(),insure);
        }catch (Exception e){
            logger.error("回显保险信息失败",e);
            return new Result(ResultEnum.FAILED.getCode(),ResultEnum.FIND_FAILED.getMessage(),e);
        }
    }
    //确认修改广告信息
    @ApiOperation(value = "确认修改保险信息")
    @PutMapping("updateInsureInfo")
    public Result updateInsureInfo(@RequestBody TbInsure tbInsure){
        try {
            tbInsureService.updateInsureInfo(tbInsure);
            logger.info("修改保险信息成功，参数：{}", JSONObject.toJSONString(tbInsure));
            return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.UPDATE_SUCCESS.getMessage());
        }catch (Exception e){
            logger.error("修改保险信息失败",e);
            return new Result(ResultEnum.FAILED.getCode(),ResultEnum.UPDATE_FAILED.getMessage(),e);
        }
    }
    //确认删除广告信息
    @ApiOperation(value = "确认删除保险信息")
    @DeleteMapping("deleteInsureInfo/{id}")
    public Result deleteInsureInfo(@PathVariable Integer id){
        try {
            tbInsureService.deleteInsureInfo(id);
            logger.info("删除保险信息成功");
            return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.DELETE_SUCCESS.getMessage());
        }catch (Exception e){
            logger.error("删除保险信息失败",e);
            return new Result(ResultEnum.FAILED.getCode(),ResultEnum.DELETE_FAILED.getMessage(),e);
        }
    }
}
