package com.dongtu.service;

import com.dongtu.pojo.TbTravelSeller;

import java.util.List;

public interface TravelService {
    List<TbTravelSeller> findAll();

    TbTravelSeller findById(Long travelSellerId);

    void updateTravelSeller(TbTravelSeller travelSeller);

    void deleteTravelSellerById(Long travelSellerId);

    void addTravelSeller(TbTravelSeller travelSeller);

    TbTravelSeller findSellerByName(String travelName);
}
