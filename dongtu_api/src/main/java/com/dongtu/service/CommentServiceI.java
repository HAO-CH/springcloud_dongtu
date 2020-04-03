package com.dongtu.service;

import com.dongtu.consts.Result;
import com.dongtu.pojo.TbComments;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * 评论服务接口
 */
@FeignClient(value = "DONGTU-COMMENT-SERVICE")
public interface CommentServiceI {
    //评论的增加
    @PostMapping("/comments/saveComments")
    Result saveComments(@RequestBody TbComments tbComments);

    //查询商品的评论
    @GetMapping("/comments/findComments/{tpId}")
    Result<List<TbComments>> findComments(@PathVariable("tpId") Long tpId);
}
