package com.dongtu.service;

import com.dongtu.pojo.*;

import java.util.List;

public interface OrderService {
    void createTravelOrder(TbTravelOrder travelOrder);

    void createSeckillOrder(TbSeckillOrder seckillOrder);

    void createPubOrder(TbPubOrder pubOrder);

    void createInsureOrder(TbInsureOrder insureOrder);

    void updateTravelOrder(TbTravelOrder travelOrder);

    void updateSeckillOrder(TbSeckillOrder seckillOrder);

    void updatePubOrder(TbPubOrder pubOrder);

    void updateInsureOrder(TbInsureOrder insureOrder);

    List<TbTravelOrder> findUnpaidOrderOrPaid(Long userId, Integer status);

    List<TbSeckillOrder> findUnpaidOrPaidOrderSeckill(Long userId, Integer status);

    void createSellerOrder(TbSellerPayOrder sellerPayOrder);

    void updateSellerOrder(TbSellerPayOrder sellerPayOrder);

    TbTravelOrder getOrderIsPaid(Long orderId);

    TbSeckillOrder getOrderIsPaidFormSekillOrder(Long orderId);

    List<TbSeckillOrder> getSeckillId(Long userId, Integer status);
}
