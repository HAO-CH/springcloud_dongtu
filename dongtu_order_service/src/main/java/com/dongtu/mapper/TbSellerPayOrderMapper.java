package com.dongtu.mapper;

import com.dongtu.pojo.TbSellerPayOrder;
import com.dongtu.pojo.TbSellerPayOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSellerPayOrderMapper {
    int countByExample(TbSellerPayOrderExample example);

    int deleteByExample(TbSellerPayOrderExample example);

    int deleteByPrimaryKey(Long orderId);

    int insert(TbSellerPayOrder record);

    int insertSelective(TbSellerPayOrder record);

    List<TbSellerPayOrder> selectByExample(TbSellerPayOrderExample example);

    TbSellerPayOrder selectByPrimaryKey(Long orderId);

    int updateByExampleSelective(@Param("record") TbSellerPayOrder record, @Param("example") TbSellerPayOrderExample example);

    int updateByExample(@Param("record") TbSellerPayOrder record, @Param("example") TbSellerPayOrderExample example);

    int updateByPrimaryKeySelective(TbSellerPayOrder record);

    int updateByPrimaryKey(TbSellerPayOrder record);
}