package com.dongtu.quartz;

import com.alibaba.fastjson.JSONObject;
import com.dongtu.consts.RedisKeys;
import com.dongtu.pojo.TagProducys;
import com.dongtu.pojo.TbUser;
import com.dongtu.service.TbTagService;
import org.apache.shiro.SecurityUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.*;

/**
 * @Author: HAO
 * @Date: 2020-01-14 09:54
 * @Desc:
 */
@Component
public class CountTagQuartz {

    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private TbTagService tagService;

    /**
     * 每5分钟，统计用户可能喜欢的标签
     */
    @Scheduled(cron = "0 0/2 * * * ?")
    public void countTagQuartz() {
        String userStr = (String) redisTemplate.opsForValue().get(RedisKeys.LOGIN_USER);
        TbUser user = JSONObject.parseObject(userStr, TbUser.class);
        if (user == null) {
            return;
        }
        // 取出最近点击商品的id
        Set<Long> prodIds = redisTemplate.opsForZSet().reverseRange(user.getUserName() + RedisKeys.NOW_TIME, 0, 4);
        if (prodIds != null && !prodIds.isEmpty()) {
            for (Long prodId : prodIds) {
                // 根据商品id 到数据库查询 拿到商品标签的list
                List<TagProducys> tagList = tagService.findTag(prodId);
                // 遍历标签的list 把标签放到set中
                Set<Long> set = new HashSet<>();
                for (TagProducys tag : tagList) {
                    set.add(tag.getTagId());
                }
                // 遍历set 直接取点击量 标签缓存   值add
                Map<String, Long> map = new HashMap<>();
                for (Long tagId : set) {
                    String score = stringRedisTemplate.boundValueOps(user.getUserName() + tagId + RedisKeys.LABLE_NUM).get();
                    // 取出来两个redis都有的tagId
                    map.put(tagId.toString(), Long.valueOf(score));
                    // 删除这个临时存储标签的key
                    redisTemplate.delete(user.getUserName() + tagId + RedisKeys.LABLE_NUM);
                }
                // 遍历map 取出score >= 3 的tagId
                List<Long> list = new ArrayList<>();
                for (String tagId : map.keySet()) {
                    if (map.get(tagId) >= 3) {
                        list.add(Long.valueOf(tagId));
                    }
                }
                // 取出score>=3 用户真正意向标签放到redis
                if (list.size() > 0) {
                    redisTemplate.opsForValue().set(user.getUserId() + RedisKeys.LAST_VALUE, JSONObject.toJSONString(list));
                }
            }
            // 删除redis 标签存放时间的key
            redisTemplate.delete(user.getUserName() + RedisKeys.NOW_TIME);
        }
    }

}
