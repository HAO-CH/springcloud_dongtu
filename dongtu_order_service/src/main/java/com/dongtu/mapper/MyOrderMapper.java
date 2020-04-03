package com.dongtu.mapper;

import com.dongtu.pojo.TbSeckillOrder;
import com.dongtu.pojo.TbTravelOrder;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MyOrderMapper {

    @Select("select * from tb_travel_order where tr_status = #{status} and tr_user_id = #{userId}")
    List<TbTravelOrder> findUnpaidOrPaid(@Param("userId") Long userId, @Param("status") Integer status);

    @Select("select * from tb_seckill_order where seckill_order_status = #{status} and user_id = #{userId}")
    List<TbSeckillOrder> findUnpaidOrPaidOrderSeckill(@Param("userId") Long userId, @Param("status") Integer status);
}
