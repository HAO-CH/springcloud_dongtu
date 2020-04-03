package com.dongtu.mapper;

import com.dongtu.pojo.TbInsureOrder;
import com.dongtu.pojo.TbInsureOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbInsureOrderMapper {
    int countByExample(TbInsureOrderExample example);

    int deleteByExample(TbInsureOrderExample example);

    int deleteByPrimaryKey(Long insureOrderId);

    int insert(TbInsureOrder record);

    int insertSelective(TbInsureOrder record);

    List<TbInsureOrder> selectByExample(TbInsureOrderExample example);

    TbInsureOrder selectByPrimaryKey(Long insureOrderId);

    int updateByExampleSelective(@Param("record") TbInsureOrder record, @Param("example") TbInsureOrderExample example);

    int updateByExample(@Param("record") TbInsureOrder record, @Param("example") TbInsureOrderExample example);

    int updateByPrimaryKeySelective(TbInsureOrder record);

    int updateByPrimaryKey(TbInsureOrder record);
}