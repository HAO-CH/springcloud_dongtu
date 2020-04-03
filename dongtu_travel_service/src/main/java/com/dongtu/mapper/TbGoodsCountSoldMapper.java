package com.dongtu.mapper;

import com.dongtu.pojo.TbGoodsCountSold;
import com.dongtu.pojo.TbGoodsCountSoldExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbGoodsCountSoldMapper {
    int countByExample(TbGoodsCountSoldExample example);

    int deleteByExample(TbGoodsCountSoldExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbGoodsCountSold record);

    int insertSelective(TbGoodsCountSold record);

    List<TbGoodsCountSold> selectByExample(TbGoodsCountSoldExample example);

    TbGoodsCountSold selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbGoodsCountSold record, @Param("example") TbGoodsCountSoldExample example);

    int updateByExample(@Param("record") TbGoodsCountSold record, @Param("example") TbGoodsCountSoldExample example);

    int updateByPrimaryKeySelective(TbGoodsCountSold record);

    int updateByPrimaryKey(TbGoodsCountSold record);

    List<TbGoodsCountSold> findByHours(@Param("date") Date date,@Param("date1") Date date1, @Param("sellerId")Long sellerId);
}