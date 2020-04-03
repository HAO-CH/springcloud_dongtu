package com.dongtu.controller;

import com.alibaba.fastjson.JSONObject;
import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.TbPayLog;
import com.dongtu.pojo.TbSellerPayLog;
import com.dongtu.service.PayLogService;
import com.dongtu.service.SellerPayLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: HAO
 * @Date: 2019-12-30 10:55
 * @Desc:
 */
@RestController
@RequestMapping("payLog")
public class PayLogController {

    @Resource
    private PayLogService payLogService;

    @Resource
    private SellerPayLogService sellerPayLogService;

    Logger logger = LoggerFactory.getLogger(getClass());

    @PostMapping("insertPayLog")
    public Result insertPayLog(@RequestBody TbPayLog payLog) {
        logger.info("进入增加payLog方法，payLog：{}", JSONObject.toJSONString(payLog));
        try {
            payLogService.insertPayLog(payLog);
            logger.info("插入payLog成功");
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.INSERT_SUCCESS.getMessage());
        } catch (Exception e) {
            logger.error("插入payLog失败", e);
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.INSERT_FAILED.getMessage());
        }
    }

    @PostMapping("insertSellerPayLog")
    public Result insertSellerPayLog(@RequestBody TbSellerPayLog sellerPayLog) {
        logger.info("进入增加sellerPayLog方法，sellerPayLog：{}", JSONObject.toJSONString(sellerPayLog));
        try {
            sellerPayLogService.insertPayLog(sellerPayLog);
            logger.info("插入sellerPayLog成功");
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.INSERT_SUCCESS.getMessage());
        } catch (Exception e) {
            logger.error("插入sellerPayLog失败", e);
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.INSERT_FAILED.getMessage());
        }
    }
}
