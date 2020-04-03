package com.dongtu.service;

import com.dongtu.consts.Result;
import com.dongtu.pojo.TbCollect;
import com.dongtu.pojo.TbUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.service
 * @ClassName: CollectServiceI
 * @Description: java类作用描述
 * @Author: DengQing
 * @CreateDate: 2020/1/9 11:54
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/9 11:54
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@FeignClient(value = "DONGTU-COLLECT-SERVICE")
public interface CollectServiceI {
    //查询收藏该商品的个数
    @GetMapping("/collect/findCollectNum/{tpId}")
    Result findCollectNum(@PathVariable("tpId") Long tpId);

    //查询用户是否已收藏该商品
    @GetMapping("/collect/findCollectByTpIdAndUserName")
    Result<TbCollect> findCollectByTpIdAndUserName(@RequestBody TbCollect tbCollect);

    //查询用户的收藏
    @PostMapping("/collect/findMyCollect")
    Result<List<TbCollect>> findMyCollect(@RequestBody TbUser user);
}
