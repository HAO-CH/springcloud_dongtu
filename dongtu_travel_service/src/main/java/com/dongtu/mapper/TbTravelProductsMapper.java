package com.dongtu.mapper;

import java.util.List;

import com.dongtu.pojo.TbTravelProducts;
import com.dongtu.pojo.TbTravelProductsExample;
import org.apache.ibatis.annotations.Param;

public interface TbTravelProductsMapper {
    int countByExample(TbTravelProductsExample example);

    int deleteByExample(TbTravelProductsExample example);

    int deleteByPrimaryKey(Long tpId);

    int insert(TbTravelProducts record);

    int insertSelective(TbTravelProducts record);

    List<TbTravelProducts> selectByExample(TbTravelProductsExample example);

    TbTravelProducts selectByPrimaryKey(Long tpId);

    int updateByExampleSelective(@Param("record") TbTravelProducts record, @Param("example") TbTravelProductsExample example);

    int updateByExample(@Param("record") TbTravelProducts record, @Param("example") TbTravelProductsExample example);

    int updateByPrimaryKeySelective(TbTravelProducts record);

    int updateByPrimaryKey(TbTravelProducts record);

    List<TbTravelProducts> findTravelProductsBySellerId(@Param("tpSellerId") Long tpSellerId);

    List<TbTravelProducts> findProductsByAreaId(@Param("areaId") Long areaId);

    List<TbTravelProducts> findNewsTravelAll();

    void addTravelProductsId(TbTravelProducts travelProducts);
}