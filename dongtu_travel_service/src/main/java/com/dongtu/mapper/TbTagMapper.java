package com.dongtu.mapper;

import com.dongtu.pojo.TbTag;
import com.dongtu.pojo.TbTagExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbTagMapper {
    int countByExample(TbTagExample example);

    int deleteByExample(TbTagExample example);

    int deleteByPrimaryKey(Long tagId);

    int insert(TbTag record);

    int insertSelective(TbTag record);

    List<TbTag> selectByExample(TbTagExample example);

    TbTag selectByPrimaryKey(Long tagId);

    int updateByExampleSelective(@Param("record") TbTag record, @Param("example") TbTagExample example);

    int updateByExample(@Param("record") TbTag record, @Param("example") TbTagExample example);

    int updateByPrimaryKeySelective(TbTag record);

    int updateByPrimaryKey(TbTag record);
}