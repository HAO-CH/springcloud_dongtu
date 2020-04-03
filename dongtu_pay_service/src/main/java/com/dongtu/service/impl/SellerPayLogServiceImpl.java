package com.dongtu.service.impl;

import com.dongtu.mapper.TbSellerPayLogMapper;
import com.dongtu.pojo.TbSellerPayLog;
import com.dongtu.service.SellerPayLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: HAO
 * @Date: 2019-12-30 11:27
 * @Desc:
 */
@Service
public class SellerPayLogServiceImpl implements SellerPayLogService {

    @Resource
    private TbSellerPayLogMapper sellerPayLogMapper;

    @Override
    public void insertPayLog(TbSellerPayLog sellerPayLog) {
        sellerPayLogMapper.insertSelective(sellerPayLog);
    }

    @Override
    public List<TbSellerPayLog> findPayLogByOutTradeNo(String out_trade_no) {
        return sellerPayLogMapper.findPayLogByOutTradeNo(out_trade_no);
    }
}
