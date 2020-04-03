package com.dongtu.service;

import com.dongtu.pojo.TbTravelSeller;

import java.util.List;

public interface TbTravelSellerService {
    void updateTravelSellerStatus(TbTravelSeller tbTravelSeller);

    List<TbTravelSeller> findTravelSeller();
}
