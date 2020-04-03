package com.dongtu.mapper;

import com.dongtu.pojo.TbPubOrder;
import com.dongtu.pojo.TbPubOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPubOrderMapper {
    int countByExample(TbPubOrderExample example);

    int deleteByExample(TbPubOrderExample example);

    int deleteByPrimaryKey(Long poOrderId);

    int insert(TbPubOrder record);

    int insertSelective(TbPubOrder record);

    List<TbPubOrder> selectByExample(TbPubOrderExample example);

    TbPubOrder selectByPrimaryKey(Long poOrderId);

    int updateByExampleSelective(@Param("record") TbPubOrder record, @Param("example") TbPubOrderExample example);

    int updateByExample(@Param("record") TbPubOrder record, @Param("example") TbPubOrderExample example);

    int updateByPrimaryKeySelective(TbPubOrder record);

    int updateByPrimaryKey(TbPubOrder record);
}