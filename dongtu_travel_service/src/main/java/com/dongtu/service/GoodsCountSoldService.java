package com.dongtu.service;

import com.dongtu.pojo.TbGoodsCountSold;

import java.util.Date;
import java.util.List;

public interface GoodsCountSoldService {
    void addCountSold(TbGoodsCountSold countSold);

    List<TbGoodsCountSold> findByHours(Date date, Date date1, Long sellerId);
}
