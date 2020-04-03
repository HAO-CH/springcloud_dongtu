package com.dongtu.mapper;

import com.dongtu.pojo.TbMediaType;
import com.dongtu.pojo.TbMediaTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbMediaTypeMapper {
    int countByExample(TbMediaTypeExample example);

    int deleteByExample(TbMediaTypeExample example);

    int deleteByPrimaryKey(Long mediaId);

    int insert(TbMediaType record);

    int insertSelective(TbMediaType record);

    List<TbMediaType> selectByExample(TbMediaTypeExample example);

    TbMediaType selectByPrimaryKey(Long mediaId);

    int updateByExampleSelective(@Param("record") TbMediaType record, @Param("example") TbMediaTypeExample example);

    int updateByExample(@Param("record") TbMediaType record, @Param("example") TbMediaTypeExample example);

    int updateByPrimaryKeySelective(TbMediaType record);

    int updateByPrimaryKey(TbMediaType record);
}