package com.dongtu.service.impl;

import com.dongtu.consts.RedisKeys;
import com.dongtu.mapper.TbCollectMapper;
import com.dongtu.pojo.TbCollect;
import com.dongtu.pojo.TbCollectExample;
import com.dongtu.pojo.TbUser;
import com.dongtu.service.TbCollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.service.impl
 * @ClassName: TbCollectServiceImpl
 * @Description: java类作用描述
 * @Author: DengQing
 * @CreateDate: 2020/1/9 11:38
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/9 11:38
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Service
public class TbCollectServiceImpl implements TbCollectService {
    @Autowired
    private TbCollectMapper tbCollectMapper;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    //收藏商品入库
    //存放reids收藏数量
    @Override
    public void insertCollect(TbCollect tbCollect) {
        tbCollectMapper.insertSelective(tbCollect);
        stringRedisTemplate.opsForValue().increment(tbCollect.getTpId() + RedisKeys.COLLECT_NUM, 1);
    }

    //查询用户收藏了该商品
    @Override
    public TbCollect findCollectByTpIdAndUserName(TbCollect tbCollect) {
        TbCollectExample example = new TbCollectExample();
        TbCollectExample.Criteria criteria = example.createCriteria();
        criteria.andTpIdEqualTo(tbCollect.getTpId());
        criteria.andUserNameEqualTo(tbCollect.getUserName());
        List<TbCollect> list = tbCollectMapper.selectByExample(example);
        return list.size() == 0 ? null : list.get(0);
    }

    //查询用户收藏
    @Override
    public List<TbCollect> findMyCollect(TbUser user) {
        TbCollectExample example = new TbCollectExample();
        TbCollectExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(user.getUserName());
        return tbCollectMapper.selectByExample(example);
    }
}
