package com.dongtu.service;

import com.dongtu.consts.Result;
import com.dongtu.pojo.EsPojo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 搜索服务接口
 */
@FeignClient("ES-SERVICE")
public interface EsServiceI {
    @GetMapping("esController/findByEs")
    Result<List<EsPojo>> findByEs(@RequestParam String str);
}
