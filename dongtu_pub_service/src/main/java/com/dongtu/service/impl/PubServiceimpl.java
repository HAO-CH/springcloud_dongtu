package com.dongtu.service.impl;

import com.dongtu.mapper.TbPubMapper;
import com.dongtu.pojo.TbPub;
import com.dongtu.pojo.TbPubVO;
import com.dongtu.service.PubService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.service.impl
 * @ClassName: PubServiceimpl
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2019/12/27 19:23
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/12/27 19:23
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Service
public class PubServiceimpl implements PubService {
    @Resource
    private TbPubMapper tbPubMapper;
    @Override
    public List<TbPubVO> findAll() {
        return tbPubMapper.findAll();
    }
    @Override
    public void addTbPub(TbPub tbPub) {
        tbPubMapper.insertSelective(tbPub);
    }



    @Override
    public List<TbPub> findByArea(Long pubsAreaId) {
        return tbPubMapper.findByArea(pubsAreaId);
    }

    @Override
    public void deleteBatch(TbPub tbPub) {
        tbPubMapper.updateByPrimaryKeySelective(tbPub);
    }

    @Override
    public TbPub findById(Long pubsId) {
        return tbPubMapper.selectByPrimaryKey(pubsId);
    }
}
