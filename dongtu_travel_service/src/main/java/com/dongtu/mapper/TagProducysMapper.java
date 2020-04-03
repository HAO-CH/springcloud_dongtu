package com.dongtu.mapper;

import com.dongtu.pojo.TagProducys;
import com.dongtu.pojo.TagProducysExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TagProducysMapper {
    int countByExample(TagProducysExample example);

    int deleteByExample(TagProducysExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TagProducys record);

    int insertSelective(TagProducys record);

    List<TagProducys> selectByExample(TagProducysExample example);

    TagProducys selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TagProducys record, @Param("example") TagProducysExample example);

    int updateByExample(@Param("record") TagProducys record, @Param("example") TagProducysExample example);

    int updateByPrimaryKeySelective(TagProducys record);

    int updateByPrimaryKey(TagProducys record);

    void insertBatch(@Param("list") List<TagProducys> list);
}