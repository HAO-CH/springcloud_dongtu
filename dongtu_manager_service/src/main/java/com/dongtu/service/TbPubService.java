package com.dongtu.service;

import com.dongtu.pojo.TbPub;
import com.dongtu.pojo.TbPubProductVO;

import java.util.List;

public interface TbPubService {
    void updatePubStatus(TbPub pub);

    List<TbPubProductVO> notAuditPubAll();
}
