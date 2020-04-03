package com.dongtu.service;

import com.dongtu.pojo.TbTravelProducts;
import com.dongtu.pojo.TbTravelProductsVo;

import java.util.List;

public interface TbTravelProductsService {
    void updateTravelProductsStatus(TbTravelProducts tbTravelProducts);

    void insertTravelProducts(TbTravelProducts tbTravelProducts);

    List<TbTravelProductsVo> findTravelProducts();

    void deleteTravelProducts(TbTravelProducts tbTravelProducts);

    List<TbTravelProducts> findTravelProductsByTravelTypeId(Long travelTypeId);

    TbTravelProducts findTravelProductsByTpId(Long tyId);

    List<TbTravelProducts> findEightTravelProducts();
}
