package com.dongtu.mapper;

import com.dongtu.pojo.TbTravelSeller;
import com.dongtu.pojo.TbTravelSellerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTravelSellerMapper {
    int countByExample(TbTravelSellerExample example);

    int deleteByExample(TbTravelSellerExample example);

    int deleteByPrimaryKey(Long travelSellerId);

    int insert(TbTravelSeller record);

    int insertSelective(TbTravelSeller record);

    List<TbTravelSeller> selectByExample(TbTravelSellerExample example);

    TbTravelSeller selectByPrimaryKey(Long travelSellerId);

    int updateByExampleSelective(@Param("record") TbTravelSeller record, @Param("example") TbTravelSellerExample example);

    int updateByExample(@Param("record") TbTravelSeller record, @Param("example") TbTravelSellerExample example);

    int updateByPrimaryKeySelective(TbTravelSeller record);

    int updateByPrimaryKey(TbTravelSeller record);
}