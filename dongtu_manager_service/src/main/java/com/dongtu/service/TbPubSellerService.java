package com.dongtu.service;

import com.dongtu.pojo.TbPubSeller;

import java.util.List;

public interface TbPubSellerService {
    List<TbPubSeller> notAuditPubSellerAll();

    void updatePubSellerStatus(TbPubSeller tbPubSeller);
}
