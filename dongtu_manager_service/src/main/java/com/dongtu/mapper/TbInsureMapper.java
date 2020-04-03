package com.dongtu.mapper;

import com.dongtu.pojo.TbInsure;
import com.dongtu.pojo.TbInsureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbInsureMapper {
    int countByExample(TbInsureExample example);

    int deleteByExample(TbInsureExample example);

    int deleteByPrimaryKey(Integer insureId);

    int insert(TbInsure record);

    int insertSelective(TbInsure record);

    List<TbInsure> selectByExample(TbInsureExample example);

    TbInsure selectByPrimaryKey(Integer insureId);

    int updateByExampleSelective(@Param("record") TbInsure record, @Param("example") TbInsureExample example);

    int updateByExample(@Param("record") TbInsure record, @Param("example") TbInsureExample example);

    int updateByPrimaryKeySelective(TbInsure record);

    int updateByPrimaryKey(TbInsure record);
}