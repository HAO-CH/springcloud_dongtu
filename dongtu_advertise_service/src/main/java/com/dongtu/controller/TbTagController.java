package com.dongtu.controller;

import com.dongtu.consts.RedisKeys;
import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.TagProducys;
import com.dongtu.pojo.TbUser;
import com.dongtu.service.TbTagService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.controller
 * @ClassName: TbTagController
 * @Description: java类作用描述
 * @Author: DengQing
 * @CreateDate: 2020/1/14 10:45
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/14 10:45
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@RestController
@RequestMapping("tag")
public class TbTagController {
    @Autowired
    private TbTagService tbTagService;
    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    Logger logger = LoggerFactory.getLogger(TbTagController.class);

    @ApiOperation("查询商品对应标签")
    @GetMapping("findTag")
    public Result findTag(@RequestParam("tpId") Long tpId) {
        try {
            logger.info("查询商品标签参数{}", tpId);
            List<TagProducys> list = tbTagService.findTag(tpId);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), list);
        } catch (Exception e) {
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.FIND_FAILED.getMessage(), e);
        }
    }

    @ApiOperation("存放标签的缓存")
    @PostMapping("StatisticaLabel")
    public Result StatisticaLabel(@RequestParam("label[]") Long[] label, @RequestBody TbUser user, @RequestParam("tpId") Long tpId) {
        try {
            logger.info("存放缓存参数{}", label);
            Date now = new Date();
            long time = now.getTime();
            //存放时间
            redisTemplate.opsForZSet().add(user.getUserName() + RedisKeys.NOW_TIME, tpId, time);
            //统计标签出现的次数
            for (Long tag : label) {
                stringRedisTemplate.boundValueOps(user.getUserName() + tag + RedisKeys.LABLE_NUM).increment(1);
            }
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.INSERT_SUCCESS.getMessage());
        } catch (Exception e) {
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.INSERT_FAILED.getMessage(), e);
        }
    }
}
