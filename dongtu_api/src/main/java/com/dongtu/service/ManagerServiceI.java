package com.dongtu.service;

import com.dongtu.consts.Result;
import com.dongtu.pojo.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 运营商后台接口
 */
//运营商管理的接口
@FeignClient(value = "DONGTU-MANAGER-SERVICE")
public interface ManagerServiceI {
    //保险==================================================================================================
    //查询所有保险
    @GetMapping("/insureController/findInsureAll")
    public Result<List<TbInsure>> findInsureAll();

    //添加保险信息
    @PostMapping("/insureController/saveInsurenfo")
    public Result saveContentInfo(@RequestBody TbInsure tbInsure);

    //修改保险信息回显
    @GetMapping("/insureController/toUpdateInsureById/{id}")
    public Result<TbInsure> toUpdateContentInfo(@PathVariable("id") Integer id);

    //确认修改广告信息
    @PutMapping("/insureController/updateInsureInfo")
    public Result updateInsureInfo(@RequestBody TbInsure tbInsure);

    //确认删除广告信息
    @DeleteMapping("/insureController/deleteInsureInfo/{id}")
    public Result deleteInsureInfo(@PathVariable Integer id);

    //广告==========================================================================================
    //查询广告分类
    @GetMapping("/advertisementController/findMediaTypeAll")
    public Result<List<TbMediaType>> findMediaTypeAll();

    //查询所有广告信息
    @GetMapping("/advertisementController/findAdvertisementAll")
    public Result<List<TbAdvertisementVO>> findAdvertisementAll();

    //添加广告信息
    @PostMapping("/advertisementController/saveAdvertisement")
    public Result saveAdvertisement(@RequestBody TbAdvertisement tbAdvertisement);

    //修改保险信息回显
    @GetMapping("/advertisementController/toUpdateAdvertisementById/{id}")
    public Result<TbAdvertisement> toUpdateAdvertisementById(@PathVariable("id") Long id);

    //根据广告id查询
    @GetMapping("/advertisementController/findAdvertisementById/{adId}")
    public Result<TbAdvertisement> findAdvertisementById(@PathVariable("adId")Long adId);

    //确认修改广告信息
    @PutMapping("/advertisementController/updateAdvertisementInfo")
    public Result updateAdvertisementInfo(@RequestBody TbAdvertisement advertisement);

    //确认删除广告信息
    @DeleteMapping("/advertisementController/deleteAdvertisementById/{id}")
    public Result deleteAdvertisementById(@PathVariable Long id);

    //酒店商家和酒店商品审核接口=====================================================================================================
    //查询未审核的所有酒店商家
    @GetMapping("/pubSellerToPubProductsAuditController/notAuditPubSellerAll")
    public Result<List<TbPubSeller>> notAuditPubSellerAll();

    //审核修改酒店商家的状态
    @PutMapping("/pubSellerToPubProductsAuditController/updatePubSellerStatus")
    public Result updatePubSellerStatus(@RequestBody TbPubSeller tbPubSeller);

    //查询所有酒店商品的未审核状态 和没有删除的
    @GetMapping("/pubSellerToPubProductsAuditController/notAuditPubAll")
    public Result<List<TbPubProductVO>> notAuditPubAll();

    //审核修改商品的状态
    @PutMapping("/pubSellerToPubProductsAuditController/updatePubStatus")
    public Result updatePubStatus(@RequestBody TbPub pub);

    //秒杀==============================================================
    //秒杀商品审核
    @PutMapping("/seckillProduct/updateSeckillProduct")
    Result updateSeckillProduct(@RequestBody TbSeckillProduct tbSeckillProduct);

    //秒杀商品查询
    @GetMapping("/seckillProduct/findSeckillProduct")
    Result findSeckillProduct();

    //旅游商品==============================================================
    //旅游商品审核
    @PutMapping("/travelProducts/updateTravelProductsStatus")
    Result updateTravelProductsStatus(@RequestBody TbTravelProducts tbTravelProducts);

    //自营商品增加
    @PostMapping("/travelProducts/insertTravelProducts")
    Result insertTravelProducts(@RequestBody TbTravelProducts tbTravelProducts);

    //旅游商品查询
    @GetMapping("/travelProducts/findTravelProducts/{operName}")
    Result findTravelProducts(@PathVariable("operName") String operName);

    //旅游商品的删除
    @PutMapping("/travelProducts/deleteTravelProducts")
    Result deleteTravelProducts(@RequestBody TbTravelProducts tbTravelProducts);

    //旅游商家===========================================================
    //旅游商家审核
    @PutMapping("/travelSeller/updateTravelSellerStatus")
    Result updateTravelSellerStatus(@RequestBody TbTravelSeller tbTravelSeller);

    //旅游商家查询
    @GetMapping("/travelSeller/findTravelSeller")
    Result findTravelSeller();

    //权限===============================================================
    //查询权限
    @GetMapping("/permissionsController/findPermissions/{permissionsPid}")
    Result findPermissions(@PathVariable("permissionsPid") Long permissionsPid);

    //旅游分类==========================================================
    //查询所有分类
    @GetMapping("/travelType/findTravelTypeAll")
    Result findTravelTypeAll();

    //广告栏位分类表===============================================================sdy
    @GetMapping("/advertisementController/findTbAdveFieldAll")
    public Result<List<TbAdveField>> findTbAdveFieldAll();

    //查询所有轮播图广告信息
    @GetMapping("/advertisementController/getContentsInfosPlanting")
    public Result<List<TbAdvertisement>> getContentsInfosPlanting();

    //查看今日推荐广告位
    @GetMapping("/advertisementController/TodayRecommend")
    public Result<List<TbAdvertisement>> TodayRecommend();

    //查询所有品牌地区==================================================================sdy
    @GetMapping("/tbAreaImgController/findAreaImgAll")
    public Result<List<TbAreaImg>> findAreaImgAll();

    //根据地区Id查询品牌地区
    @GetMapping("/tbAreaImgController/findAreaImgById/{areaId}")
    public Result<TbAreaImg> findAreaImgById(@PathVariable("areaId") Long areaId);

    //查询自由行或跟团游=======================================
    @GetMapping("/travelProducts/findTravelProductsByTravelTypeId/{travelTypeId}")
    Result<List<TbTravelProducts>> findTravelProductsByTravelTypeId(@PathVariable("travelTypeId") Long travelTypeId);

    //根据tpId查询旅游商品
    @GetMapping("/travelProducts/findTravelProductsByTpId/{tyId}")
    Result<TbTravelProducts> findTravelProductsByTpId(@PathVariable("tyId") Long tyId);

    //查询八条商品信息根据最小值排序============================
    @GetMapping("/travelProducts/findEightTravelProducts")
    Result findEightTravelProducts();

    //查询商品的注意事项根据商品id================================
    @GetMapping("/param/findProductParamByTpId/{tpId}")
    Result<TbProductsParam> findProductParamByTpId(@PathVariable("tpId") Long tpId);
}
