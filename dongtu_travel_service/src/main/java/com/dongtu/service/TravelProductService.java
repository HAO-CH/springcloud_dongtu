package com.dongtu.service;

import com.dongtu.pojo.TagProducys;
import com.dongtu.pojo.TbTravelProducts;

import java.util.List;

public interface TravelProductService {
    List<TbTravelProducts> findAll();

    void addTravelProducts(TbTravelProducts travelProducts);

    TbTravelProducts findById(Long tpId);

    void updateTravelProducts(TbTravelProducts travelProducts);

    void deleteTravelProductsById(Long tpId);

    List<TbTravelProducts> findTravelProductsBySellerId(Long tpSellerId);

    List<TbTravelProducts> findProductsByAreaId(Long areaId);

    TbTravelProducts findByProductById(Long trTravelId);

    List<TbTravelProducts> findNewsTravelAll();

    void insertBatch(List<TagProducys> list);
}
