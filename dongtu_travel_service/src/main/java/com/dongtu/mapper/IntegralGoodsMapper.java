package com.dongtu.mapper;


import com.dongtu.pojo.IntegralGoods;
import com.dongtu.pojo.IntegralGoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IntegralGoodsMapper {
    int countByExample(IntegralGoodsExample example);

    int deleteByExample(IntegralGoodsExample example);

    int deleteByPrimaryKey(Long goodsId);

    int insert(IntegralGoods record);

    int insertSelective(IntegralGoods record);

    List<IntegralGoods> selectByExample(IntegralGoodsExample example);

    IntegralGoods selectByPrimaryKey(Long goodsId);

    int updateByExampleSelective(@Param("record") IntegralGoods record, @Param("example") IntegralGoodsExample example);

    int updateByExample(@Param("record") IntegralGoods record, @Param("example") IntegralGoodsExample example);

    int updateByPrimaryKeySelective(IntegralGoods record);

    int updateByPrimaryKey(IntegralGoods record);
}