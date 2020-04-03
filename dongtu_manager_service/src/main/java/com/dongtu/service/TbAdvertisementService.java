package com.dongtu.service;

import com.dongtu.pojo.TbAdvertisement;
import com.dongtu.pojo.TbAdvertisementVO;

import java.util.List;

public interface TbAdvertisementService {
    List<TbAdvertisementVO> findAdvertisementAll();

    void saveAdvertisement(TbAdvertisement tbAdvertisement);

    TbAdvertisement toUpdateAdvertisementById(Long id);

    void updateAdvertisementInfo(TbAdvertisement advertisement);

    void deleteAdvertisementById(Long id);
    //轮播图广告
    List<TbAdvertisement> getContentsInfosPlanting();
    //查询今日推荐广告信息
    List<TbAdvertisement> TodayRecommend();

    TbAdvertisement findAdvertisementById(Long adId);
}
