package com.dongtu.controller;

import com.alibaba.fastjson.JSONObject;
import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.TravelCommentary;
import com.dongtu.pojo.Travels;
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
 * @author 赵方
 * 游记服务层
 */
@RestController
@RequestMapping("travelnotesController")
public class TravelnotesController {

    Logger logger = LoggerFactory.getLogger(TravelnotesController.class);

    @Autowired
    private MongoTemplate mongoTemplate;

    @PostMapping("saveTravels")
    @ApiOperation("游记增加")
    public Result saveTravels(@RequestBody Travels travels) {
        logger.info("接收参数为:" + travels.toString());
        try {
            mongoTemplate.save(travels);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.INSERT_SUCCESS.getMessage());
        } catch (Exception e) {
            logger.error("异常信息:{}{}", e);
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.INSERT_FAILED.getMessage());
        }
    }

    @GetMapping("findTravelsAll")
    @ApiOperation("游记查询")
    public Result<List<Travels>> findTravelsAll() {
        List<Travels> list = mongoTemplate.findAll(Travels.class);
        logger.info("查询的数据为:" + JSONObject.toJSONString(list));
        return new Result<>(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), list);
    }

    @GetMapping("findTravelsById")
    @ApiOperation("根据id查询具体的信息")
    public Result<Travels> findTravelsById(@RequestParam String travelsId) {
        logger.info("接收的参数为:{}{}" + travelsId);
        List<Travels> travels = mongoTemplate.find(new Query(Criteria.where("travelsId").is(travelsId)), Travels.class);
        return new Result<>(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), travels.get(0));
    }

    @ApiOperation("查询游记的评论")
    @GetMapping("findTravelsCommentsByTravelsId/{travelsId}")
    public Result findTravelsCommentsByTravelsId(@PathVariable("travelsId") String travelsId) {
        logger.debug("查询游记评论参数{}", travelsId);
        try {
            List<TravelCommentary> list = mongoTemplate.find(new Query(Criteria.where("travelsId").is(travelsId)), TravelCommentary.class);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), list);
        } catch (Exception e) {
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.FIND_FAILED.getMessage(), e);
        }
    }

    @ApiOperation("增加游记评论")
    @PostMapping("saveTravelsComments")
    public Result saveTravelsComments(@RequestBody TravelCommentary travelCommentary) {
        logger.debug("增加评论参数{}", travelCommentary.toString());
        try {
            mongoTemplate.save(travelCommentary);
            return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.INSERT_SUCCESS.getMessage());
        } catch (Exception e) {
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.INSERT_FAILED.getMessage(), e);
        }
    }

    @GetMapping("findTravelsByIdAndUserId")
    @ApiOperation("用户id查询游记")
    public Result<List<Travels>> findTravelsByIdAndUserId(@RequestParam String userName){
        logger.info("接收的参数为:{}{}"+userName);
        List<Travels> travels = mongoTemplate.find(new Query(Criteria.where("userName").is(userName)), Travels.class);
        return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.FIND_SUCCESS.getMessage(),travels);
    }
}
