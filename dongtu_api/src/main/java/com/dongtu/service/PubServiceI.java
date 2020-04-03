package com.dongtu.service;

import com.dongtu.consts.Result;
import com.dongtu.pojo.TbPub;
import com.dongtu.pojo.TbPubSeller;
import com.dongtu.pojo.TbPubVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 酒店商后台接口
 */
@FeignClient("PUB-SERVICE")
public interface PubServiceI {
    //酒店商品查询
    @GetMapping("/pubController/findAll")
    Result<List<TbPubVO>> findAll();
    //增加酒店商家
    @PostMapping("/pubSellerController/addPubSeller")
    Result addPubSeller (@RequestBody TbPubSeller tbPubSeller);
    //地区id商品查询
    @GetMapping("/pubController/findByArea")
    Result<List<TbPub>> findByArea(@RequestParam(value = "pubsAreaId") Long pubsAreaId);
    //酒店商家用户登录
    @GetMapping("/pubSellerController/findByName")
    Result findByName(@RequestParam String pubName);
    //商家登录
    @GetMapping("/pubSellerController/findByNameLogin")
    Result<TbPubSeller> findByNameLogin(@RequestParam String username);
    //酒店商品查询
    @GetMapping("/pubController/findById")
    Result<TbPub> findById(@RequestParam Long pubsId);
    //酒店商品删除
    @PutMapping("/pubController/deleteBatch")
    Result deleteBatch(@RequestBody TbPub tbPub);
    //商品增加
    @PostMapping("/pubController/addTbPub")
    Result addTbPub(@RequestBody TbPub tbPub);
}
