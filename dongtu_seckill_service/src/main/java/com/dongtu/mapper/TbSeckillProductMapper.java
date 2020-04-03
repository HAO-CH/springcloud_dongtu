package com.dongtu.mapper;

import com.dongtu.pojo.TbSeckillProduct;
import com.dongtu.pojo.TbSeckillProductExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSeckillProductMapper {
    int countByExample(TbSeckillProductExample example);

    int deleteByExample(TbSeckillProductExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSeckillProduct record);

    int insertSelective(TbSeckillProduct record);

    List<TbSeckillProduct> selectByExample(TbSeckillProductExample example);

    TbSeckillProduct selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSeckillProduct record, @Param("example") TbSeckillProductExample example);

    int updateByExample(@Param("record") TbSeckillProduct record, @Param("example") TbSeckillProductExample example);

    int updateByPrimaryKeySelective(TbSeckillProduct record);

    int updateByPrimaryKey(TbSeckillProduct record);

    List<TbSeckillProduct> findSeckillProductAll(@Param("presentTime") Date presentTime);
}