package com.dongtu.mapper;

import com.dongtu.pojo.TbTravelProducts;
import com.dongtu.pojo.TbTravelProductsExample;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface TbTravelProductsMapper {
    int countByExample(TbTravelProductsExample example);

    int deleteByExample(TbTravelProductsExample example);

    int deleteByPrimaryKey(Long tpId);

    int insert(TbTravelProducts record);

    int insertSelective(TbTravelProducts record);

    List<TbTravelProducts> selectByExample(TbTravelProductsExample example);

    TbTravelProducts selectByPrimaryKey(@Param("tpId") Long tpId);

    int updateByExampleSelective(@Param("record") TbTravelProducts record, @Param("example") TbTravelProductsExample example);

    int updateByExample(@Param("record") TbTravelProducts record, @Param("example") TbTravelProductsExample example);

    int updateByPrimaryKeySelective(TbTravelProducts record);

    int updateByPrimaryKey(TbTravelProducts record);

}