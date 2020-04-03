package com.dongtu.service;

import com.dongtu.consts.Result;
import com.dongtu.pojo.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 旅游商后台
 */
@FeignClient("TRAVEL-SERVICE") //微服务名称
public interface TravelServiceI {

    // 查询所有seller
    @GetMapping("travel/findAll")
    Result<List<TbTravelSeller>> findAll();

    // 增加seller
    @PostMapping("travel/addTbTravelSeller")
    Result addTravelSeller(@RequestBody TbTravelSeller travelSeller);

    // findBySellerId
    @GetMapping("travel/findById/{travelSellerId}")
    Result<TbTravelSeller> findById(@PathVariable("travelSellerId") Long travelSellerId);

    // updateSeller
    @PutMapping("travel/updateTravelSeller")
    Result updateTravelSeller(@RequestBody TbTravelSeller travelSeller);

    // 根据商家id 删除商家
    @DeleteMapping("travel/deleteTravelSellerById/{travelSellerId}")
    Result deleteTravelSellerById(@PathVariable("travelSellerId") Long travelSellerId);

    // 根据商家名查询商家
    @GetMapping("travel/findSellerByName")
    Result<TbTravelSeller> findSellerByName(@RequestParam("travelName") String travelName);

    // 秒杀商品
    // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    // 查询所有秒杀商品
    @GetMapping("seckillProduct/findAll")
    Result<List<TbSeckillProduct>> findSeckillProductAll();

    // 添加秒杀商品
    @PostMapping("seckillProduct/addSeckillProduct")
    Result addSeckillProduct(@RequestBody TbSeckillProduct seckillProduct);

    // 根据商品id 查询秒杀商品
    @GetMapping("seckillProduct/findById/{id}")
    Result<TbSeckillProduct> findSeckillProductById(@PathVariable("id") Long id);

    // 修改
    @PutMapping("seckillProduct/updateSeckillProduct")
    Result updateSeckillProduct(@RequestBody TbSeckillProduct seckillProduct);

    // 根据id删除
    @DeleteMapping("seckillProduct/deleteSeckillProductById/{id}")
    Result deleteSeckillProductById(@PathVariable("id") Long id);

    // 根据商家id 查询商品
    @GetMapping("seckillProduct/findSeckillProductBySellerId")
    Result<List<TbSeckillProduct>> findSeckillProductBySellerId(@RequestParam("seckillTravelSellerId") Long seckillTravelSellerId);

    // travelProducts
    // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    // 根据AreaId查询TbTravelProducts
    @GetMapping("travelProduct/findProductsByAreaId")
    Result<List<TbTravelProducts>> findProductsByAreaId(@RequestParam Long areaId);

    // 根据商家id 查询商品
    @GetMapping("travelProduct/findTravelProductsBySellerId")
    Result<List<TbTravelProducts>> findTravelProductsBySellerId(@RequestParam Long tpSellerId);

    // 增加
    @PostMapping("travelProduct/addTravelProducts")
    Result addTravelProducts(@RequestBody TbTravelProducts travelProducts,@RequestParam("tagName[]") Long[] tagName);

    // 根据商品id查询
    @GetMapping("travelProduct/findById/{tpId}")
    Result<TbTravelProducts> findByTravelProductsId(@PathVariable("tpId") Long tpId);

    // 修改
    @PutMapping("travelProduct/updateTravelProducts")
    Result updateTravelProducts(@RequestBody TbTravelProducts travelProducts);

    // 根据商品id删除
    @DeleteMapping("travelProduct/deleteTravelProductsById/{tpId}")
    Result deleteTravelProductsById(@PathVariable("tpId") Long tpId);

    // Area
    // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    // 查询商品类型
    @GetMapping("navbar/findNavbar")
    Result<List<TbNavbar>> findNavbar();

    // 根据pid查询地区
    @GetMapping("area/findArea")
    Result<List<TbArea>> findArea(@RequestParam Long areaPid);

    //根据地区pid查询上一级地区
    @GetMapping("area/findAreaByAreaPid/{areaPid}")
    Result<TbArea> findAreaByAreaPid(@PathVariable("areaPid") Long areaPid);

    //根据id查询地区
    @GetMapping("area/findAreaByAreaId/{areaId}")
    Result<TbArea> findAreaByAreaId(@PathVariable("areaId") Long areaId);

    @GetMapping("travelProduct/findByProductById")
    Result<TbTravelProducts> findByProductById(@RequestParam Long trTravelId);

    //查询最新的旅游产品,以id降序
    @GetMapping("/travelProduct/findNewsTravelAll")
    public Result<List<TbTravelProducts>> findNewsTravelAll();

    //积分商品的查询
    @GetMapping("/integralController/findByAll")
    public Result<List<IntegralGoods>> findByAll();

    //积分的增加
    @PostMapping("/integralController/addIntegralGoods")
    public Result addIntegralGoods(@RequestBody IntegralGoods integralGoods);
    //修改积分
    @PutMapping("/integralController/updateIntegralGoods")
    public Result updateIntegralGoods(@RequestBody IntegralGoods integralGoods);
    //id查询积分
    @GetMapping("/integralController/findByGoodsId")
    public Result<IntegralGoods> findByGoodsId(@RequestParam Long goodsId);

    @GetMapping("countGoods/findByTimeUnit")
    List findByHours(@RequestParam Long sellerId);

    //查询所有标签
    @GetMapping("tagProducysController/findAll")
    public Result<List<TbTag>> findAlll();

    //标签id查商品
    @GetMapping("tagProducysController/findTagId")
    public Result<List<TagProducys>> findTag(@RequestParam("tpId") Long tabId);
}
