package com.dongtu.mapper;

import com.dongtu.pojo.TbPermissions;
import com.dongtu.pojo.TbPermissionsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbPermissionsMapper {
    int countByExample(TbPermissionsExample example);

    int deleteByExample(TbPermissionsExample example);

    int deleteByPrimaryKey(Long permissionsId);

    int insert(TbPermissions record);

    int insertSelective(TbPermissions record);

    List<TbPermissions> selectByExample(TbPermissionsExample example);

    TbPermissions selectByPrimaryKey(Long permissionsId);

    int updateByExampleSelective(@Param("record") TbPermissions record, @Param("example") TbPermissionsExample example);

    int updateByExample(@Param("record") TbPermissions record, @Param("example") TbPermissionsExample example);

    int updateByPrimaryKeySelective(TbPermissions record);

    int updateByPrimaryKey(TbPermissions record);
}