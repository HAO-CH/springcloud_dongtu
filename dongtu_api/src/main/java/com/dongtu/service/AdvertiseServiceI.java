package com.dongtu.service;

import com.dongtu.consts.Result;
import com.dongtu.pojo.TagProducys;
import com.dongtu.pojo.TbUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 广告服务接口
 */
@FeignClient(value = "DONGTU-ADVERTISE-SERVICE")
public interface AdvertiseServiceI {
    //查询商品对应标签
    @GetMapping("/tag/findTag")
    Result<List<TagProducys>> findTag(@RequestParam("tpId") Long tpId);

    //把标签的时间和次数存放redis
    @PostMapping("/tag/StatisticaLabel")
    Result StatisticaLabel(@RequestParam("label[]") Long[] label, @RequestBody TbUser user, @RequestParam("tpId") Long tpId);
}
