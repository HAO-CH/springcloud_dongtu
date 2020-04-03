package com.dongtu.mapper;

import com.dongtu.pojo.TbNavbar;
import com.dongtu.pojo.TbNavbarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbNavbarMapper {
    int countByExample(TbNavbarExample example);

    int deleteByExample(TbNavbarExample example);

    int deleteByPrimaryKey(Long nid);

    int insert(TbNavbar record);

    int insertSelective(TbNavbar record);

    List<TbNavbar> selectByExample(TbNavbarExample example);

    TbNavbar selectByPrimaryKey(Long nid);

    int updateByExampleSelective(@Param("record") TbNavbar record, @Param("example") TbNavbarExample example);

    int updateByExample(@Param("record") TbNavbar record, @Param("example") TbNavbarExample example);

    int updateByPrimaryKeySelective(TbNavbar record);

    int updateByPrimaryKey(TbNavbar record);
}