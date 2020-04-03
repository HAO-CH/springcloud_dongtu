package com.dongtu.mapper;

import com.dongtu.pojo.TbAdveField;
import com.dongtu.pojo.TbAdveFieldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAdveFieldMapper {
    int countByExample(TbAdveFieldExample example);

    int deleteByExample(TbAdveFieldExample example);

    int deleteByPrimaryKey(Long fieldId);

    int insert(TbAdveField record);

    int insertSelective(TbAdveField record);

    List<TbAdveField> selectByExample(TbAdveFieldExample example);

    TbAdveField selectByPrimaryKey(Long fieldId);

    int updateByExampleSelective(@Param("record") TbAdveField record, @Param("example") TbAdveFieldExample example);

    int updateByExample(@Param("record") TbAdveField record, @Param("example") TbAdveFieldExample example);

    int updateByPrimaryKeySelective(TbAdveField record);

    int updateByPrimaryKey(TbAdveField record);
}