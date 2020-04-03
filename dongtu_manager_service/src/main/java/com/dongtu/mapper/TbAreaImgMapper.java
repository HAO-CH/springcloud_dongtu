package com.dongtu.mapper;

import com.dongtu.pojo.TbAreaImg;
import com.dongtu.pojo.TbAreaImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAreaImgMapper {
    int countByExample(TbAreaImgExample example);

    int deleteByExample(TbAreaImgExample example);

    int deleteByPrimaryKey(Long areaId);

    int insert(TbAreaImg record);

    int insertSelective(TbAreaImg record);

    List<TbAreaImg> selectByExample(TbAreaImgExample example);

    TbAreaImg selectByPrimaryKey(Long areaId);

    int updateByExampleSelective(@Param("record") TbAreaImg record, @Param("example") TbAreaImgExample example);

    int updateByExample(@Param("record") TbAreaImg record, @Param("example") TbAreaImgExample example);

    int updateByPrimaryKeySelective(TbAreaImg record);

    int updateByPrimaryKey(TbAreaImg record);
}