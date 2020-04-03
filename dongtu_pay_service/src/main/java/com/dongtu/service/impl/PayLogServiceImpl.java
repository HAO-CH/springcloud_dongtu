package com.dongtu.service.impl;

import com.dongtu.mapper.TbPayLogMapper;
import com.dongtu.pojo.TbPayLog;
import com.dongtu.service.PayLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: HAO
 * @Date: 2019-12-30 10:56
 * @Desc:
 */
@Service
public class PayLogServiceImpl implements PayLogService {

    @Resource
    private TbPayLogMapper payLogMapper;

    @Override
    public void insertPayLog(TbPayLog payLog) {
        payLogMapper.insertSelective(payLog);
    }

    @Override
    public TbPayLog findPayLogByOutTradeNo(String out_trade_no) {
        return payLogMapper.findPayLogByOutTradeNo(out_trade_no);
    }
}
