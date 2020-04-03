package com.dongtu.mapper;

import com.dongtu.pojo.TbSeckillOrder;
import com.dongtu.pojo.TbTravelOrder;
import com.dongtu.pojo.TbTravelOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTravelOrderMapper {
    int countByExample(TbTravelOrderExample example);

    int deleteByExample(TbTravelOrderExample example);

    int deleteByPrimaryKey(Long trOrderId);

    int insert(TbTravelOrder record);

    int insertSelective(TbTravelOrder record);

    List<TbTravelOrder> selectByExample(TbTravelOrderExample example);

    TbTravelOrder selectByPrimaryKey(Long trOrderId);

    int updateByExampleSelective(@Param("record") TbTravelOrder record, @Param("example") TbTravelOrderExample example);

    int updateByExample(@Param("record") TbTravelOrder record, @Param("example") TbTravelOrderExample example);

    int updateByPrimaryKeySelective(TbTravelOrder record);

    int updateByPrimaryKey(TbTravelOrder record);

    List<TbTravelOrder> findUnpaidOrPaid(@Param("userId")Long userId, @Param("status") Integer status);

    TbTravelOrder getOrderIsPaid(@Param("orderId") Long orderId);
}