package com.dongtu.controller;

import com.alibaba.fastjson.JSONObject;
import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.TbComments;
import com.dongtu.service.CommentsService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.controller
 * @ClassName: CommentsController
 * @Description: java类作用描述
 * @Author: DengQing
 * @CreateDate: 2020/1/7 14:01
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/7 14:01
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@RestController
@RequestMapping("comments")
public class CommentsController {
    @Autowired
    private CommentsService commentsService;
    @Autowired
    private MongoTemplate mongoTemplate;
    Logger logger = LoggerFactory.getLogger(CommentsController.class);

    /**
     * 评论增加
     *
     * @param tbComments
     * @return
     */
    @ApiOperation("评论增加")
    @PostMapping("saveComments")
    public Result saveComments(@RequestBody TbComments tbComments) {
        try {
            logger.debug("增加评论传入参数{}", JSONObject.toJSONString(tbComments));
            commentsService.saveComments(tbComments);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.COMMENT_SUCCESS.getMessage());
        } catch (Exception e) {
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.COMMENT_FAILED.getMessage(), e);
        }
    }

    /**
     * 查询商品下面的评论
     *
     * @param tpId
     * @return
     */
    @ApiOperation("查询评论")
    @GetMapping("findComments/{tpId}")
    public Result findComments(@PathVariable("tpId") Long tpId) {
        try {
            logger.debug("查询商品的评论{}", tpId);
            List<TbComments> commentsList = mongoTemplate.find(new Query(Criteria.where("tpId").is(String.valueOf(tpId))), TbComments.class);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), commentsList);
        } catch (Exception e) {
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.FIND_FAILED.getMessage(), e);
        }
    }
}
