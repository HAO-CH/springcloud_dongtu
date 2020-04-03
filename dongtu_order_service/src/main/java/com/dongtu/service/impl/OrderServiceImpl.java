package com.dongtu.service.impl;

import com.dongtu.mapper.*;
import com.dongtu.pojo.*;
import com.dongtu.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: HAO
 * @Date: 2019-12-29 20:31
 * @Desc:
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private TbTravelOrderMapper travelOrderMapper;

    @Resource
    private TbSeckillOrderMapper seckillOrderMapper;

    @Resource
    private TbPubOrderMapper pubOrderMapper;

    @Resource
    private TbInsureOrderMapper insureOrderMapper;

    @Resource
    private MyOrderMapper myOrderMapper;

    @Resource
    private TbSellerPayOrderMapper sellerPayOrderMapper;

    @Override
    public void createTravelOrder(TbTravelOrder travelOrder) {
        travelOrderMapper.insertSelective(travelOrder);
    }

    @Override
    public void createSeckillOrder(TbSeckillOrder seckillOrder) {
        seckillOrderMapper.insertSelective(seckillOrder);
    }

    @Override
    public void createPubOrder(TbPubOrder pubOrder) {
        pubOrderMapper.insertSelective(pubOrder);
    }

    @Override
    public void createInsureOrder(TbInsureOrder insureOrder) {
        insureOrderMapper.insertSelective(insureOrder);
    }

    @Override
    public void updateTravelOrder(TbTravelOrder travelOrder) {
        travelOrderMapper.updateByPrimaryKeySelective(travelOrder);
    }

    @Override
    public void updateSeckillOrder(TbSeckillOrder seckillOrder) {
        seckillOrderMapper.updateByPrimaryKeySelective(seckillOrder);
    }

    @Override
    public void updatePubOrder(TbPubOrder pubOrder) {
        pubOrderMapper.updateByPrimaryKeySelective(pubOrder);
    }

    @Override
    public void updateInsureOrder(TbInsureOrder insureOrder) {
        insureOrderMapper.updateByPrimaryKeySelective(insureOrder);
    }

    @Override
    public List<TbTravelOrder> findUnpaidOrderOrPaid(Long userId, Integer status) {
        return travelOrderMapper.findUnpaidOrPaid(userId, status);
    }

    @Override
    public List<TbSeckillOrder> findUnpaidOrPaidOrderSeckill(Long userId, Integer status) {
        return myOrderMapper.findUnpaidOrPaidOrderSeckill(userId, status);
    }

    @Override
    public void createSellerOrder(TbSellerPayOrder sellerPayOrder) {
        sellerPayOrderMapper.insertSelective(sellerPayOrder);
    }

    @Override
    public void updateSellerOrder(TbSellerPayOrder sellerPayOrder) {
        sellerPayOrderMapper.updateByPrimaryKeySelective(sellerPayOrder);
    }

    @Override
    public TbTravelOrder getOrderIsPaid(Long orderId) {
        return travelOrderMapper.getOrderIsPaid(orderId);
    }

    @Override
    public TbSeckillOrder getOrderIsPaidFormSekillOrder(Long orderId) {
        return seckillOrderMapper.getOrderIsPaidFormSekillOrder(orderId);
    }

    @Override
    public List<TbSeckillOrder> getSeckillId(Long userId, Integer status) {
        return seckillOrderMapper.getSeckillId(userId,status);
    }
}
