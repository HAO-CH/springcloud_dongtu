package com.dongtu.mapper;

import com.dongtu.consts.Result;
import com.dongtu.pojo.TbPubSeller;
import com.dongtu.pojo.TbPubSellerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPubSellerMapper {
    int countByExample(TbPubSellerExample example);

    int deleteByExample(TbPubSellerExample example);

    int deleteByPrimaryKey(Long pubSellerId);

    int insert(TbPubSeller record);

    int insertSelective(TbPubSeller record);

    List<TbPubSeller> selectByExample(TbPubSellerExample example);

    TbPubSeller selectByPrimaryKey(Long pubSellerId);

    int updateByExampleSelective(@Param("record") TbPubSeller record, @Param("example") TbPubSellerExample example);

    int updateByExample(@Param("record") TbPubSeller record, @Param("example") TbPubSellerExample example);

    int updateByPrimaryKeySelective(TbPubSeller record);

    int updateByPrimaryKey(TbPubSeller record);

    Result findByName(@Param("pubName") String pubName);

    TbPubSeller findByNameLogin(@Param("username") String username);
}