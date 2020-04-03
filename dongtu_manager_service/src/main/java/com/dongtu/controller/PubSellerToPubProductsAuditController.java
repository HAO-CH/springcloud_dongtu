package com.dongtu.controller;

import com.alibaba.fastjson.JSONObject;
import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.TbPub;
import com.dongtu.pojo.TbPubProductVO;
import com.dongtu.pojo.TbPubSeller;
import com.dongtu.service.TbPubSellerService;
import com.dongtu.service.TbPubService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pubSellerToPubProductsAuditController")
@Api(value = "酒店商家审核和酒店商品审核管理接口" )
public class PubSellerToPubProductsAuditController {

    @Autowired
    private TbPubService tbPubService;
    @Autowired
    private TbPubSellerService tbPubSellerService;

    Logger logger = LoggerFactory.getLogger(TbInsureController.class);

    //查询未审核的所有酒店商家
    @ApiOperation(value = "查询未审核的所有酒店商家信息成功")
    @GetMapping("notAuditPubSellerAll")
    public Result<List<TbPubSeller>> notAuditPubSellerAll() {
        try {
            List<TbPubSeller> pubSellerList = tbPubSellerService.notAuditPubSellerAll();
            logger.info("查询未审核的所有酒店商家信息成功,参数为: {}" + JSONObject.toJSONString(pubSellerList));
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(),pubSellerList);
        } catch (Exception e) {
            logger.error("查询未审核的所有酒店商家信息失败", e);
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.FIND_FAILED.getMessage(), e);
        }
    }

    //审核修改酒店商家的状态
    @ApiOperation(value = "审核修改酒店商家的状态")
    @PutMapping("updatePubSellerStatus")
    public Result updatePubSellerStatus(@RequestBody TbPubSeller tbPubSeller){
        try {
            //根据传入的实体类对象进行修改（实体类对象主要是id和status的值）
            tbPubSellerService.updatePubSellerStatus(tbPubSeller);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.UPDATE_SUCCESS.getMessage());
        } catch (Exception e) {
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.UPDATE_FAILED.getMessage());
        }
    }
    //查询所有酒店商品的未审核状态 和没有删除的
    @ApiOperation(value = "查询所有酒店商品的未审核状态信息成功")
    @GetMapping("notAuditPubAll")
    public Result<List<TbPubProductVO>> notAuditPubAll() {
        try {
            List<TbPubProductVO> pubrList = tbPubService.notAuditPubAll();
            logger.info("查询所有酒店商品的未审核状态信息成功,参数为: {}" + JSONObject.toJSONString(pubrList));
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(),pubrList);
        } catch (Exception e) {
            logger.error("查询所有酒店商品的未审核状态信息失败", e);
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.FIND_FAILED.getMessage(), e);
        }
    }
    //审核修改商品的状态
    @ApiOperation(value = "审核修改商品的状态")
    @PutMapping("updatePubStatus")
    public Result updatePubStatus(@RequestBody TbPub pub){
        try {
            logger.info("审核修改商品的状态,传入参数为: {}" + JSONObject.toJSONString(pub));
            //根据传入的实体类对象进行修改（实体类对象主要是id和status的值）
            tbPubService.updatePubStatus(pub);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.UPDATE_SUCCESS.getMessage());
        } catch (Exception e) {
            logger.error("审核修改商品的状态信息失败", e);
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.UPDATE_FAILED.getMessage());
        }
    }
}
