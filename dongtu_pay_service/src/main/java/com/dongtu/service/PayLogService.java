package com.dongtu.service;

import com.dongtu.pojo.TbPayLog;

public interface PayLogService {
    void insertPayLog(TbPayLog payLog);

    TbPayLog findPayLogByOutTradeNo(String out_trade_no);
}
