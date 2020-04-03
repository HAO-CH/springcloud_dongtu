package com.dongtu.controller;

import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.IntegralItem;
import com.dongtu.service.IntegralService;
import com.dongtu.util.IdWorker;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import com.dongtu.consts.Result;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.controller
 * @ClassName: integralController
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2020/1/10 17:36
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/10 17:36
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@RestController
@RequestMapping("integralController")
public class IntegralController {
    @Resource
    private IntegralService integralService;


    @PostMapping("addOrderIntegral")
    @ApiOperation(value = "积分订单的增加")
    public Result addOrderIntegral(@RequestBody IntegralItem integralItem){
        integralService.addOrderIntegral(integralItem);
        return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.INSERT_SUCCESS.getMessage(),integralItem);
    }
    @GetMapping("findByUserIdOrder")
    @ApiOperation(value = "用户订积分订单查询")
    public Result<List<IntegralItem>> findByUserIdOrder(@RequestParam Long userId){
        List<IntegralItem> list= integralService.findByUserIdOrder(userId);
        return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.FIND_SUCCESS.getMessage(),list);
    }
}
