package com.dongtu.service;

import com.dongtu.pojo.TbSellerPayLog;

import java.util.List;

public interface SellerPayLogService {
    void insertPayLog(TbSellerPayLog sellerPayLog);

    List<TbSellerPayLog> findPayLogByOutTradeNo(String out_trade_no);
}
