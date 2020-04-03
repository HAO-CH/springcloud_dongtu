package com.dongtu.service;

import com.dongtu.consts.Result;
import com.dongtu.pojo.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

/**
 * 订单服务接口
 */
@FeignClient("ORDER-SERVICE")
public interface OrderServiceI {

    @PostMapping("createOrder")
    Result createOrder(@RequestBody OrderParams orderParams, @RequestParam Integer flag);

    @PostMapping("createSellerOrder")
    Result<TbSellerPayOrder> createSellerOrder(@RequestBody TbTravelSeller seller, @RequestParam BigDecimal price);

    @PostMapping("createTravelOrder")
    Result createTravelOrder(@RequestBody TbTravelOrder travelOrder);

    @PostMapping("createSeckillOrder")
    Result createSeckillOrder(@RequestBody TbSeckillOrder seckillOrder);

    @PostMapping("createPubOrder")
    Result createPubOrder(@RequestBody TbPubOrder pubOrder);

    @PostMapping("createInsureOrder")
    Result createInsureOrder(@RequestBody TbInsureOrder insureOrder);

    @PutMapping("updateTravelOrder")
    Result updateTravelOrder(@RequestBody TbTravelOrder travelOrder);

    @PutMapping("updateSeckillOrder")
    Result updateSeckillOrder(@RequestBody TbSeckillOrder seckillOrder);

    @PutMapping("updatePubOrder")
    Result updatePubOrder(@RequestBody TbPubOrder pubOrder);

    @PutMapping("updateInsureOrder")
    Result updateInsureOrder(@RequestBody TbInsureOrder insureOrder);

    @GetMapping("findUnpaidOrPaidOrder")
    Result<List<TbTravelOrder>> findUnpaidOrPaidOrder(@RequestParam Long userId, @RequestParam Integer status);

    @GetMapping("findUnpaidOrPaidOrderSeckill")
    Result<List<TbSeckillOrder>> findUnpaidOrPaidOrderSeckill(@RequestParam Long userId, @RequestParam Integer status);

    @PutMapping("updateSellerOrder")
    Result updateSellerOrder(@RequestBody TbSellerPayOrder sellerPayOrder);

    // 查询订单是否支付
    @GetMapping("getOrderIsPaid")
    boolean getOrderIsPaid(@RequestParam Long orderId);

    @GetMapping("getOrderIsPaidFormSekillOrder")
    boolean getOrderIsPaidFormSekillOrder(@RequestParam Long orderId);

    //积分订单增加
    @PostMapping("integralController/addOrderIntegral")
    public Result addOrderIntegral(@RequestBody IntegralItem integralItem);

    //秒杀订单查询
    @GetMapping("getSeckillId")
    public Result<List<TbSeckillOrder>> getSeckillId(@RequestParam Long userId, @RequestParam Integer status);

    //积分订单查询
    @GetMapping("integralController/findByUserIdOrder")
    public Result<List<IntegralItem>> findByUserIdOrder(@RequestParam Long userId);
}