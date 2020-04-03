package com.dongtu.service;

import com.dongtu.consts.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 积分服务接口
 */
@FeignClient("POINTS-SERVICE")
public interface PointsServiceI {

    @PutMapping("updatePoints")
    Result updatePoints(@RequestParam Long userId, @RequestParam Long points);
}
