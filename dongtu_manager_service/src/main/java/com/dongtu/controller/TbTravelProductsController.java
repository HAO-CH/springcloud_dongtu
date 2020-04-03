package com.dongtu.controller;

import com.alibaba.fastjson.JSONObject;
import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.TbTravelProducts;
import com.dongtu.pojo.TbTravelProductsVo;
import com.dongtu.service.TbTravelProductsService;
import io.swagger.annotations.ApiOperation;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("travelProducts")
public class TbTravelProductsController {
    @Autowired
    private TbTravelProductsService tbTravelProductsService;
    @Autowired
    private RocketMQTemplate rocketMQTemplate;
    Logger logger = LoggerFactory.getLogger(TbTravelProductsController.class);

    @ApiOperation("旅游商品审核")
    @PutMapping("updateTravelProductsStatus")
    public Result updateTravelProductsStatus(@RequestBody TbTravelProducts tbTravelProducts) {
        try {
            logger.debug("商品审核传入参数{}", JSONObject.toJSONString(tbTravelProducts));
            tbTravelProductsService.updateTravelProductsStatus(tbTravelProducts);
            //审核成功发送mq
            if (tbTravelProducts.getTpStatus() == 1) {
                rocketMQTemplate.convertAndSend("travel-products", tbTravelProducts);
                logger.debug("mq发送成功");
            }
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.UPDATE_SUCCESS.getMessage());
        } catch (Exception e) {
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.UPDATE_FAILED.getMessage(), e);
        }
    }

    @ApiOperation("自营商品添加")
    @PostMapping("insertTravelProducts")
    //自营商品的增加，用户信息前面获得实体类带过来
    public Result insertTravelProducts(@RequestBody TbTravelProducts tbTravelProducts) {
        try {
            logger.debug("商品增加传入参数{}", JSONObject.toJSONString(tbTravelProducts));
            tbTravelProductsService.insertTravelProducts(tbTravelProducts);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.INSERT_SUCCESS.getMessage());
        } catch (Exception e) {
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.INSERT_FAILED.getMessage(), e);
        }
    }

    @ApiOperation("旅游商品的查询")
    @GetMapping("findTravelProducts/{operName}")
    //需要查询多张表商家表，小导航表，类型表，通过vo表承载数据返回显示
    //判断商品的商家是否为自营返回不同的数据（自营商品还是商家商品）
    public Result findTravelProducts(@PathVariable(value = "operName") String operName) {
        try {
            List<TbTravelProductsVo> travelProductsVoList = tbTravelProductsService.findTravelProducts();
            logger.debug("商品查询数据{}", JSONObject.toJSONString(travelProductsVoList));
            List<TbTravelProductsVo> tbTravelProductsVos = new ArrayList<>();
            for (TbTravelProductsVo tbTravelProductsVo : travelProductsVoList) {
                //判断若商品的商家为自营的话单独放入一个list
                if (tbTravelProductsVo.getTpSellerName().equals(operName)) {
                    tbTravelProductsVos.add(tbTravelProductsVo);
                }
            }
            Map<String, Object> map = new HashMap<>();
            map.put("ZIYING", tbTravelProductsVos);
            map.put("QUANBU", travelProductsVoList);
            logger.debug("返回的商品数据{}", JSONObject.toJSONString(map));
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), map);
        } catch (Exception e) {
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.FIND_FAILED.getMessage(), e);
        }
    }

    @ApiOperation("旅游商品的删除")
    @PutMapping("deleteTravelProducts")
    public Result deleteTravelProducts(@RequestBody TbTravelProducts tbTravelProducts) {
        //传入id和删除字段确认删除，此删除为软删除
        try {
            logger.debug("商品的删除传入参数{}", JSONObject.toJSONString(tbTravelProducts));
            tbTravelProductsService.deleteTravelProducts(tbTravelProducts);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.DELETE_SUCCESS.getMessage());
        } catch (Exception e) {
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.DELETE_FAILED.getMessage(), e);
        }
    }

    //查询自由行或跟团游商品信息
    @ApiOperation("查询自由行或跟团游商品信息")
    @GetMapping("findTravelProductsByTravelTypeId/{travelTypeId}")
    public Result<List<TbTravelProducts>> findTravelProductsByTravelTypeId(@PathVariable("travelTypeId") Long travelTypeId) {
        try {
            logger.debug("查询自由行或跟团游传入参数{}", travelTypeId);
            List<TbTravelProducts> list = tbTravelProductsService.findTravelProductsByTravelTypeId(travelTypeId);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), list);
        } catch (Exception e) {
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.FIND_FAILED.getMessage(), e);
        }
    }

    //根据id查询旅游商品信息
    @ApiOperation("根据tpId查询旅游商品信息")
    @GetMapping("findTravelProductsByTpId/{tyId}")
    public Result findTravelProductsByTpId(@PathVariable("tyId") Long tyId) {
        try {
            logger.debug("根据id查询商品参数{}", tyId);
            TbTravelProducts travelProducts = tbTravelProductsService.findTravelProductsByTpId(tyId);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), travelProducts);
        } catch (Exception e) {
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.FIND_FAILED.getMessage(), e);
        }
    }

    /**
     * 查询八条商品信息
     *
     * @return
     */
    @ApiOperation("查询八条商品记录")
    @GetMapping("findEightTravelProducts")
    public Result findEightTravelProducts() {
        try {
            List<TbTravelProducts> list = tbTravelProductsService.findEightTravelProducts();
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), list);
        } catch (Exception e) {
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.FIND_FAILED.getMessage(), e);
        }
    }
}
