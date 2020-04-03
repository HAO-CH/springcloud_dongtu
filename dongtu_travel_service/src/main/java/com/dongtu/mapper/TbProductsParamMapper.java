package com.dongtu.mapper;

import com.dongtu.pojo.TbProductsParam;
import com.dongtu.pojo.TbProductsParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbProductsParamMapper {
    int countByExample(TbProductsParamExample example);

    int deleteByExample(TbProductsParamExample example);

    int deleteByPrimaryKey(Long tpId);

    int insert(TbProductsParam record);

    int insertSelective(TbProductsParam record);

    List<TbProductsParam> selectByExample(TbProductsParamExample example);

    TbProductsParam selectByPrimaryKey(Long tpId);

    int updateByExampleSelective(@Param("record") TbProductsParam record, @Param("example") TbProductsParamExample example);

    int updateByExample(@Param("record") TbProductsParam record, @Param("example") TbProductsParamExample example);

    int updateByPrimaryKeySelective(TbProductsParam record);

    int updateByPrimaryKey(TbProductsParam record);
}