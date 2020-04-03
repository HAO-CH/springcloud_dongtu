package com.dongtu.mq;

import com.dongtu.consts.RedisKeys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 项目名称：springcloud_dongtu
 * 类名称：ClearDaka
 * 所在包:  com.dongtu.mq
 * 类描述：用来清楚打卡成功的所有用户的缓存
 * 创建人：史德雨
 * 创建时间：2020年01月10日 9:49
 * 修改人：史德雨
 * 修改时间：2020年01月10日 9:49
 * 修改备注：
 * 版本号: 1.0v
 */
@Component
public class ClearDaka {

    private static final Logger log = LoggerFactory.getLogger(ClearDaka.class);

    @Resource
    private RedisTemplate redisTemplate;

    /**
     * @Author shideyu
     * @Description S63401
     * 功能描述:任务调度器:用来定时每天凌晨0点清楚所有打卡成功的用户记录
     * @Date 9:16 2020/1/10
     * @Param
     * @return
     **/
    @Scheduled(cron = "0 0 0 * * ? ")    //定时每天零点准时清楚打卡记录
    public void ClearDakaRecord(){
        //先查询出需要删除的指定key,然后再进行删除
        redisTemplate.delete(redisTemplate.keys(RedisKeys.DA_KA + "*"));
        log.info("清楚所有用户打卡记录成功");
    }
}


