package com.dongtu.mapper;

import com.dongtu.pojo.TbSellerPayLog;
import com.dongtu.pojo.TbSellerPayLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSellerPayLogMapper {
    int countByExample(TbSellerPayLogExample example);

    int deleteByExample(TbSellerPayLogExample example);

    int insert(TbSellerPayLog record);

    int insertSelective(TbSellerPayLog record);

    List<TbSellerPayLog> selectByExample(TbSellerPayLogExample example);

    int updateByExampleSelective(@Param("record") TbSellerPayLog record, @Param("example") TbSellerPayLogExample example);

    int updateByExample(@Param("record") TbSellerPayLog record, @Param("example") TbSellerPayLogExample example);

    List<TbSellerPayLog> findPayLogByOutTradeNo(@Param("out_trade_no") String out_trade_no);
}