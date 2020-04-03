package com.dongtu.service.impl;

import com.dongtu.mapper.TbPubSellerMapper;
import com.dongtu.pojo.TbPubSeller;
import com.dongtu.service.TbPubSellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbPubSellerServiceImpl implements TbPubSellerService {

    @Resource
    private TbPubSellerMapper tbPubSellerMapper;

    @Override
    public List<TbPubSeller> notAuditPubSellerAll() {
        return tbPubSellerMapper.notAuditPubSellerAll();
    }

    @Override
    public void updatePubSellerStatus(TbPubSeller tbPubSeller) {
        tbPubSellerMapper.updateByPrimaryKeySelective(tbPubSeller);
    }
}
