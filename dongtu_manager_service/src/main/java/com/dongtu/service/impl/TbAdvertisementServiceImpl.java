package com.dongtu.service.impl;

import com.dongtu.consts.RedisKeys;
import com.dongtu.mapper.TbAdvertisementMapper;
import com.dongtu.pojo.TbAdvertisement;
import com.dongtu.pojo.TbAdvertisementVO;
import com.dongtu.service.TbAdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class TbAdvertisementServiceImpl implements TbAdvertisementService {

    @Resource
    private TbAdvertisementMapper tbAdvertisementMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Override
    public List<TbAdvertisementVO> findAdvertisementAll() {
        List<TbAdvertisementVO> advertisementVOList = null;
        if (redisTemplate.hasKey(RedisKeys.ADV_DEDUCTION)){
            advertisementVOList = (List<TbAdvertisementVO>) redisTemplate.boundValueOps(RedisKeys.ADV_DEDUCTION).get();
            return advertisementVOList;
        }else {
            advertisementVOList = tbAdvertisementMapper.findAdvertisementAll();
            redisTemplate.boundValueOps(RedisKeys.ADV_DEDUCTION).set(advertisementVOList);
            return advertisementVOList;
        }
    }

    @Override
    public void saveAdvertisement(TbAdvertisement tbAdvertisement) {
        tbAdvertisementMapper.insertSelective(tbAdvertisement);
    }

    @Override
    public TbAdvertisement toUpdateAdvertisementById(Long id) {
        return tbAdvertisementMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateAdvertisementInfo(TbAdvertisement advertisement) {
        tbAdvertisementMapper.updateByPrimaryKeySelective(advertisement);
    }

    @Override
    public void deleteAdvertisementById(Long id) {
        tbAdvertisementMapper.deleteByPrimaryKey(id);
    }

    //轮播图广告
//    @Override
//    public List<TbAdvertisement> getContentsInfosPlanting() {
//        List<TbAdvertisement> values = null;
//        if (redisTemplate.hasKey("轮播图广告栏位")){
//            values = redisTemplate.boundHashOps("轮播图广告栏位").values();
//            return values;
//        }else{
//            values = tbAdvertisementMapper.getContentsInfosPlanting();
//            for (int j=0; j<values.size(); j++){
//                redisTemplate.boundHashOps("轮播图广告栏位").put(values.get(j).getAdId(),values.get(j));
//            }
//            return values;
//        }
//    }

    //轮播图广告
    @Override
    public List<TbAdvertisement> getContentsInfosPlanting() {
        List<TbAdvertisement> values = null;
        //            轮播图 取出list的前3条数据
        if (redisTemplate.hasKey("轮播图广告栏位")){
//                如果redis中有轮播图信息的话，获取轮播图广告的前3条数据
            values = redisTemplate.opsForList().range("轮播图广告栏位", 0, 2);
//                删除前3条数据,remove(key,-1,"值")，-1代表从左边开始
            for (TbAdvertisement advertisement : values){
                redisTemplate.opsForList().remove("轮播图广告栏位", -2, advertisement);
//                Date createTime = advertisement.getAdStartTime();
//                Date date = new Date();
//                Date endTime = advertisement.getAdEndTime();
//                    开始时间在当前时间之前，结束时间在当前时间之后，将这条数据放在轮播图广告list之后
//                if (date.after(createTime) && date.before(endTime)){
                    redisTemplate.opsForList().rightPush("轮播图广告栏位",advertisement);
  //              }
            }
            return values;

        }else{
//                如果redis中没有轮播图信息的话，就从数据库中查询，广告类型为首页轮播广告，开始时间在当前时间之前，结束时间在当前时间之后，
//                状态在开启之后，审核通过的。
            values = tbAdvertisementMapper.getContentsInfosPlanting();
//                将取出的数据放在redis中，以轮播图的key
            if (values != null){
                for (TbAdvertisement advertisement : values) {
//                        String string = JSONObject.toJSONString(tbContentVO);
                    redisTemplate.opsForList().leftPush("轮播图广告栏位",advertisement);
                }
            }
            values = redisTemplate.opsForList().range("轮播图广告栏位", 0, 2);
            return values;
        }
    }

//    @Override
//    public List<TbAdvertisement> TodayRecommend() {
//        List<TbAdvertisement> values = null;
//        if (redisTemplate.hasKey("今日推荐栏位")){
//            values = redisTemplate.boundHashOps("今日推荐栏位").values();
//            return values;
//        }else{
//            values = tbAdvertisementMapper.TodayRecommend();
//            for (int j=0; j<values.size(); j++){
//                redisTemplate.boundHashOps("今日推荐栏位").put(values.get(j).getAdId(),values.get(j));
//            }
//            return values;
//        }
//    }

    @Override
    public List<TbAdvertisement> TodayRecommend() {
        List<TbAdvertisement> values = null;
        //            轮播图 取出list的前3条数据
        if (redisTemplate.hasKey("今日推荐栏位")){
//                如果redis中有轮播图信息的话，获取轮播图广告的前3条数据
            values = redisTemplate.opsForList().range("今日推荐栏位", 0, 5);
//                删除前3条数据,remove(key,-1,"值")，-1代表从左边开始
            for (TbAdvertisement advertisement : values){
                redisTemplate.opsForList().remove("今日推荐栏位", -5, advertisement);
//                Date createTime = advertisement.getAdStartTime();
//                Date date = new Date();
//                Date endTime = advertisement.getAdEndTime();
//                   开始时间在当前时间之前，结束时间在当前时间之后，将这条数据放在轮播图广告list之后
//                if (date.after(createTime) && date.before(endTime)){
                    redisTemplate.opsForList().rightPush("今日推荐栏位",advertisement);
//                }
            }
            return values;

        }else{
//                如果redis中没有轮播图信息的话，就从数据库中查询，广告类型为首页轮播广告，开始时间在当前时间之前，结束时间在当前时间之后，
//                状态在开启之后，审核通过的。
            values = tbAdvertisementMapper.TodayRecommend();
//                将取出的数据放在redis中，以轮播图的key
            if (values != null){
                for (TbAdvertisement advertisement : values) {
//                        String string = JSONObject.toJSONString(tbContentVO);
                    redisTemplate.opsForList().leftPush("今日推荐栏位",advertisement);
                }
            }
            values = redisTemplate.opsForList().range("今日推荐栏位", 0, 5);
            return values;
        }
    }

    @Override
    public TbAdvertisement findAdvertisementById(Long adId) {
        return tbAdvertisementMapper.selectByPrimaryKey(adId);
    }
}
