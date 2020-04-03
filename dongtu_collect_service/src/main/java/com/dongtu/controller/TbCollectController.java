package com.dongtu.controller;

import com.dongtu.consts.RedisKeys;
import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.TbCollect;
import com.dongtu.pojo.TbUser;
import com.dongtu.service.TbCollectService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.controller
 * @ClassName: CollectController
 * @Description: java类作用描述
 * @Author: DengQing
 * @CreateDate: 2020/1/9 11:30
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/9 11:30
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@RestController
@RequestMapping("collect")
public class TbCollectController {
    @Autowired
    private TbCollectService tbCollectService;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    Logger logger = LoggerFactory.getLogger(TbCollectController.class);

    @ApiOperation("查询商品的收藏数量")
    @GetMapping("findCollectNum/{tpId}")
    public Result findCollectNum(@PathVariable("tpId") Long tpId) {
        try {
            logger.debug("查询商品收藏数参数{}", tpId);
            if (stringRedisTemplate.hasKey(tpId + RedisKeys.COLLECT_NUM)) {
                String num = stringRedisTemplate.opsForValue().get(tpId + RedisKeys.COLLECT_NUM);
                return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), num);
            }
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), "0");
        } catch (Exception e) {
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.FIND_FAILED.getMessage(), e);
        }
    }

    @ApiOperation("查询该用户是否已收藏该商品")
    @PostMapping("findCollectByTpIdAndUserName")
    public Result findCollectByTpIdAndUserName(@RequestBody TbCollect tbCollect) {
        try {
            logger.debug("查询是否收藏{}", tbCollect.toString());
            TbCollect collect = tbCollectService.findCollectByTpIdAndUserName(tbCollect);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), collect);
        } catch (Exception e) {
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.FIND_FAILED.getMessage(), e);
        }
    }

    @ApiOperation("根据商家查询收藏的商品")
    @PostMapping("findMyCollect")
    public Result findMyCollect(@RequestBody TbUser user) {
        try {
            logger.debug("查询用户收藏参数{}", user.toString());
            List<TbCollect> list = tbCollectService.findMyCollect(user);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), list);
        } catch (Exception e) {
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.FIND_FAILED.getMessage(), e);
        }
    }
}
