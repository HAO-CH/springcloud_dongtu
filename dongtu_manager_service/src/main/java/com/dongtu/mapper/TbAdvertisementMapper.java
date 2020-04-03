package com.dongtu.mapper;

import java.util.List;

import com.dongtu.pojo.TbAdvertisement;
import com.dongtu.pojo.TbAdvertisementExample;
import com.dongtu.pojo.TbAdvertisementVO;
import org.apache.ibatis.annotations.Param;

public interface TbAdvertisementMapper {
    int countByExample(TbAdvertisementExample example);

    int deleteByExample(TbAdvertisementExample example);

    int deleteByPrimaryKey(Long adId);

    int insert(TbAdvertisement record);

    int insertSelective(TbAdvertisement record);

    List<TbAdvertisement> selectByExample(TbAdvertisementExample example);

    TbAdvertisement selectByPrimaryKey(Long adId);

    int updateByExampleSelective(@Param("record") TbAdvertisement record, @Param("example") TbAdvertisementExample example);

    int updateByExample(@Param("record") TbAdvertisement record, @Param("example") TbAdvertisementExample example);

    int updateByPrimaryKeySelective(TbAdvertisement record);

    int updateByPrimaryKey(TbAdvertisement record);
	
	List<TbAdvertisementVO> findAdvertisementAll();

    List<TbAdvertisement> getContentsInfosPlanting();

    List<TbAdvertisement> TodayRecommend();
}