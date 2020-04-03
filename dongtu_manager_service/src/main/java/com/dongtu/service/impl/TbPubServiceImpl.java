package com.dongtu.service.impl;

import com.dongtu.mapper.TbPubMapper;
import com.dongtu.pojo.TbPub;
import com.dongtu.pojo.TbPubProductVO;
import com.dongtu.service.TbPubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbPubServiceImpl implements TbPubService {

    @Resource
    private TbPubMapper pubMapper;

    @Override
    public void updatePubStatus(TbPub pub) {
        pubMapper.updateByPrimaryKeySelective(pub);
    }

    @Override
    public List<TbPubProductVO> notAuditPubAll() {
        return pubMapper.notAuditPubAll();
    }
}
