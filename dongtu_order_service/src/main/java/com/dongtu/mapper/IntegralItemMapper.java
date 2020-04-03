package com.dongtu.mapper;

import com.dongtu.pojo.IntegralItem;
import com.dongtu.pojo.IntegralItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IntegralItemMapper {
    int countByExample(IntegralItemExample example);

    int deleteByExample(IntegralItemExample example);

    int insert(IntegralItem record);

    int insertSelective(IntegralItem record);

    List<IntegralItem> selectByExample(IntegralItemExample example);

    int updateByExampleSelective(@Param("record") IntegralItem record, @Param("example") IntegralItemExample example);

    int updateByExample(@Param("record") IntegralItem record, @Param("example") IntegralItemExample example);

    List<IntegralItem> findByUserIdOrder(@Param("userId")Long userId);
}