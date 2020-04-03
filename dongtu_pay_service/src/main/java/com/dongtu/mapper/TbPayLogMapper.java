package com.dongtu.mapper;

import com.dongtu.pojo.TbPayLog;
import com.dongtu.pojo.TbPayLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPayLogMapper {
    int countByExample(TbPayLogExample example);

    int deleteByExample(TbPayLogExample example);

    int deleteByPrimaryKey(Long moOrderNum);

    int insert(TbPayLog record);

    int insertSelective(TbPayLog record);

    List<TbPayLog> selectByExample(TbPayLogExample example);

    TbPayLog selectByPrimaryKey(Long moOrderNum);

    int updateByExampleSelective(@Param("record") TbPayLog record, @Param("example") TbPayLogExample example);

    int updateByExample(@Param("record") TbPayLog record, @Param("example") TbPayLogExample example);

    int updateByPrimaryKeySelective(TbPayLog record);

    int updateByPrimaryKey(TbPayLog record);

    TbPayLog findPayLogByOutTradeNo(String out_trade_no);
}