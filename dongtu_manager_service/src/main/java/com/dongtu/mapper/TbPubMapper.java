package com.dongtu.mapper;

import com.dongtu.pojo.TbPub;
import com.dongtu.pojo.TbPubExample;
import java.util.List;

import com.dongtu.pojo.TbPubProductVO;
import org.apache.ibatis.annotations.Param;

public interface TbPubMapper {
    int countByExample(TbPubExample example);

    int deleteByExample(TbPubExample example);

    int deleteByPrimaryKey(Long pubsId);

    int insert(TbPub record);

    int insertSelective(TbPub record);

    List<TbPub> selectByExample(TbPubExample example);

    TbPub selectByPrimaryKey(Long pubsId);

    int updateByExampleSelective(@Param("record") TbPub record, @Param("example") TbPubExample example);

    int updateByExample(@Param("record") TbPub record, @Param("example") TbPubExample example);

    int updateByPrimaryKeySelective(TbPub record);

    int updateByPrimaryKey(TbPub record);

    List<TbPubProductVO> notAuditPubAll();
}