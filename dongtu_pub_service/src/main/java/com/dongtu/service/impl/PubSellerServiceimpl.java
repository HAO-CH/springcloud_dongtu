package com.dongtu.service.impl;

import com.dongtu.consts.Result;
import com.dongtu.mapper.TbPubSellerMapper;
import com.dongtu.pojo.TbPub;
import com.dongtu.pojo.TbPubSeller;
import com.dongtu.service.PubSellerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.service.impl
 * @ClassName: PubSellerServiceimpl
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2019/12/28 11:16
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/12/28 11:16
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Service
public class PubSellerServiceimpl implements PubSellerService {
    @Resource
    private TbPubSellerMapper tbPubSellerMapper;
    @Override
    public void addPubSeller(TbPubSeller tbPubSeller) {
        tbPubSellerMapper.insertSelective(tbPubSeller);
    }

    @Override
    public Result findByName(String pubName) {
        return tbPubSellerMapper.findByName(pubName);
    }

    @Override
    public TbPubSeller findByNameLogin(String username) {
        return tbPubSellerMapper.findByNameLogin(username);
    }

}
