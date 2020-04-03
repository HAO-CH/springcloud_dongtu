package com.dongtu.mapper;

import com.dongtu.pojo.TbSeckillOrder;
import com.dongtu.pojo.TbSeckillOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSeckillOrderMapper {
    int countByExample(TbSeckillOrderExample example);

    int deleteByExample(TbSeckillOrderExample example);

    int deleteByPrimaryKey(Long seckillOrderId);

    int insert(TbSeckillOrder record);

    int insertSelective(TbSeckillOrder record);

    List<TbSeckillOrder> selectByExample(TbSeckillOrderExample example);

    TbSeckillOrder selectByPrimaryKey(Long seckillOrderId);

    int updateByExampleSelective(@Param("record") TbSeckillOrder record, @Param("example") TbSeckillOrderExample example);

    int updateByExample(@Param("record") TbSeckillOrder record, @Param("example") TbSeckillOrderExample example);

    int updateByPrimaryKeySelective(TbSeckillOrder record);

    int updateByPrimaryKey(TbSeckillOrder record);

    List<TbSeckillOrder> findUnpaidOrPaidOrderSeckill(@Param("status") Integer status);

    TbSeckillOrder getOrderIsPaidFormSekillOrder(@Param("orderId") Long orderId);

    List<TbSeckillOrder> getSeckillId(@Param("userId") Long userId,@Param("status") Integer status);
}