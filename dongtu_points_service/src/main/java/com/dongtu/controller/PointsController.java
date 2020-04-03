package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.logaop.LogAspect;
import com.dongtu.pojo.TbUser;
import com.dongtu.service.TravelServiceI;
import com.dongtu.service.UserServiceI;
import org.apache.rocketmq.spring.annotation.MessageModel;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @Author: HAO
 * @Date: 2019-12-30 09:39
 * @Desc:
 */
@RestController
public class PointsController {

    @Resource
    private UserServiceI userService;

    Logger logger = LoggerFactory.getLogger(PointsController.class);

    /**
     * 修改积分
     *
     * @param userId
     * @param points
     * @return
     */
    @PutMapping("updatePoints")
    public Result updatePoints(@RequestParam Long userId, @RequestParam Long points) {
        logger.info("进入积分方法userId:{},points:{}", userId, points);
        TbUser user = userService.findById(userId).getData();
        if (user.getUserPoints().intValue() + points.intValue() < 0) {
            return new Result(ResultEnum.FAILED.getCode(), "您的积分不够了，刷新后重试>>>");
        }
        user.setUserPoints(BigDecimal.valueOf(user.getUserPoints().intValue() + points.intValue()));
        try {
            userService.updateTbUser(user);
            logger.info("修改积分成功");
        } catch (Exception e) {
            logger.error("修改积分失败，exception：{}", e);
        }
        return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.UPDATE_SUCCESS.getMessage());
    }
}
