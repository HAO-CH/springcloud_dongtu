package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.TagProducys;
import com.dongtu.pojo.TbTravelProducts;
import com.dongtu.pojo.TbTravelSeller;
import com.dongtu.service.TravelProductService;
import org.apache.shiro.SecurityUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: HAO
 * @Date: 2019-12-27 20:02
 * @Desc:
 */
@RestController
@RequestMapping("travelProduct")
public class TravelProductController {

    @Resource
    private TravelProductService travelProductService;

    /**
     * 增加
     *
     * @return
     */
    @PostMapping("addTravelProducts")
    public Result addTravelProducts(@RequestBody TbTravelProducts travelProducts,@RequestParam("tagName[]") Long[] tagName) {
        travelProducts.setIsDelete(0);
        travelProducts.setTpStatus(0);
        travelProductService.addTravelProducts(travelProducts);
        List<TagProducys> list = new ArrayList<>();
        for (Long rm : tagName) {
            TagProducys tagProducys = new TagProducys();
            tagProducys.setTpId(travelProducts.getTpId());
            tagProducys.setTagId(rm);
            list.add(tagProducys);
        }
        travelProductService.insertBatch(list);
        return new Result<>(ResultEnum.SUCCESS.getCode(), ResultEnum.INSERT_SUCCESS.getMessage());
    }

    /**
     * 根据id查询
     *
     * @return
     */
    @GetMapping("findById/{tpId}")
    public Result<TbTravelProducts> findByTravelProductsId(@PathVariable("tpId") Long tpId) {
        TbTravelProducts travelProducts = travelProductService.findById(tpId);
        return new Result<>(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), travelProducts);
    }
    @GetMapping("findByProductById")
    public Result<TbTravelProducts> findByProductById(@RequestParam Long trTravelId){
        TbTravelProducts travelProducts = travelProductService.findByProductById(trTravelId);
        return new Result<>(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), travelProducts);
    }

    /**
     * 修改
     *
     * @return
     */
    @PutMapping("updateTravelProducts")
    public Result updateTravelProducts(@RequestBody TbTravelProducts travelProducts) {
        travelProductService.updateTravelProducts(travelProducts);
        return new Result<>(ResultEnum.SUCCESS.getCode(), ResultEnum.UPDATE_SUCCESS.getMessage());
    }

    /**
     * 根据id删除
     *
     * @return
     */
    @DeleteMapping("deleteTravelProductsById/{tpId}")
    public Result deleteTravelProductsById(@PathVariable("tpId") Long tpId) {
        travelProductService.deleteTravelProductsById(tpId);
        return new Result<>(ResultEnum.SUCCESS.getCode(), ResultEnum.DELETE_SUCCESS.getMessage());
    }

    /**
     * 根据当前商家id查询商品
     *
     * @return
     */
    @GetMapping("findTravelProductsBySellerId")
    public Result<List<TbTravelProducts>> findTravelProductsBySellerId(@RequestParam Long tpSellerId) {
        List<TbTravelProducts> list = travelProductService.findTravelProductsBySellerId(tpSellerId);
        return new Result<>(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), list);
    }

    /**
     * 根据当前地区id查询商品
     *
     * @return
     */
    @GetMapping("findProductsByAreaId")
    public Result<List<TbTravelProducts>> findProductsByAreaId(@RequestParam Long areaId) {
        List<TbTravelProducts> list = travelProductService.findProductsByAreaId(areaId);
        return new Result<>(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), list);
    }

    /**
     * @Author shideyu
     * @Description //TODO S63401
     * 功能描述:查询最新旅游商品,以时间降序排序
     * @Date 22:19 2020/1/6
     * @Param []
     * @return com.dongtu.consts.Result<java.util.List<com.dongtu.pojo.TbTravelProducts>>
     **/
    @GetMapping("findNewsTravelAll")
    public Result<List<TbTravelProducts>> findNewsTravelAll() {
        List<TbTravelProducts> list = travelProductService.findNewsTravelAll();
        return new Result<>(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), list);
    }
}
