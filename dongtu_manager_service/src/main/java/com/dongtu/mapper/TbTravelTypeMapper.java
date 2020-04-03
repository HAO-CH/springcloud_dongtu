package com.dongtu.mapper;

import com.dongtu.pojo.TbTravelType;
import com.dongtu.pojo.TbTravelTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTravelTypeMapper {
    int countByExample(TbTravelTypeExample example);

    int deleteByExample(TbTravelTypeExample example);

    int deleteByPrimaryKey(Long travelTypeId);

    int insert(TbTravelType record);

    int insertSelective(TbTravelType record);

    List<TbTravelType> selectByExample(TbTravelTypeExample example);

    TbTravelType selectByPrimaryKey(Long travelTypeId);

    int updateByExampleSelective(@Param("record") TbTravelType record, @Param("example") TbTravelTypeExample example);

    int updateByExample(@Param("record") TbTravelType record, @Param("example") TbTravelTypeExample example);

    int updateByPrimaryKeySelective(TbTravelType record);

    int updateByPrimaryKey(TbTravelType record);
}