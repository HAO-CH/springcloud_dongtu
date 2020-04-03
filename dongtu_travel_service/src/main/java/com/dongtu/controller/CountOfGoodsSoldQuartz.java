package com.dongtu.controller;

import com.dongtu.consts.RedisKeys;
import com.dongtu.pojo.TbGoodsCountSold;
import com.dongtu.pojo.TbTravelSeller;
import com.dongtu.service.GoodsCountSoldService;
import com.dongtu.service.TravelService;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @Author: HAO
 * @Date: 2020-01-10 11:10
 * @Desc: 统计某个商家某个时间段 交易单数
 */
@Component
public class CountOfGoodsSoldQuartz {

    @Resource
    private TravelService travelService;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private GoodsCountSoldService goodsCountSoldService;

    /**
     * 每5分钟，记录某个商家 交易单数
     */
    @Scheduled(cron = "0 0/5 * * * ?")
    public void CountOfGoodsSold() {
        List<TbTravelSeller> sellers = travelService.findAll();
        for (TbTravelSeller seller : sellers) {
            Long count = (Long) stringRedisTemplate.opsForHash().get(RedisKeys.COUNT_GOODS_SOLD, seller.getTravelSellerId().toString());
            // 如果count != 0 ,存入数据库
            if (count != null && count != 0) {
                TbGoodsCountSold countSold = new TbGoodsCountSold();
                countSold.setSellerId(seller.getTravelSellerId());
                countSold.setCount(count);
                countSold.setTime(new Date());
                goodsCountSoldService.addCountSold(countSold);
                // 清空卖出数量
                stringRedisTemplate.opsForHash().put(RedisKeys.COUNT_GOODS_SOLD,seller.getTravelSellerId().toString(),0);
            }
            continue;
        }
    }
}
