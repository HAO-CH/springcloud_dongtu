package com.dongtu.service;

import com.dongtu.consts.Result;
import com.dongtu.pojo.TbUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * 用户服务接口
 */
@FeignClient("USER-SERVICE") //微服务名称
public interface UserServiceI {
    //用户id查询
    @GetMapping("/userController/findById")
    Result<TbUser> findById(@RequestParam Long id);

    //用户修改信息
    @PutMapping("/userController/updateTbUser")
    Result updateTbUser(@RequestBody TbUser tbUser);

    //用户增加
    @PostMapping("/userController/saveTbUser")
    Result saveTbUser(@RequestBody TbUser tbUser);

    //用户名称查询
    @GetMapping("/userController/findByUserName")
    Result<TbUser> findByUserName(@RequestParam String userName);

    //抽奖扣库存加库存
    @PutMapping("/userController/integralProcessing")
    Result integralProcessing(@RequestParam("score") String score, @RequestBody TbUser user);

    //查询中奖信息
    @GetMapping("/userController/findWinning")
    Result findWinning();
}
