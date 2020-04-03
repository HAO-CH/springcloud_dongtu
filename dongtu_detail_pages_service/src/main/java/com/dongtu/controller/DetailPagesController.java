package com.dongtu.controller;

import com.alibaba.fastjson.JSONObject;
import com.dongtu.consts.RedisKeys;
import com.dongtu.consts.Result;
import com.dongtu.pojo.TbComments;
import com.dongtu.pojo.TbPub;
import com.dongtu.pojo.TbTravelProducts;
import com.dongtu.service.CollectServiceI;
import com.dongtu.service.CommentServiceI;
import com.dongtu.service.PubServiceI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Controller
//@CrossOrigin("*")
//@RequestMapping("detail")
//public class DetailPagesController {
//    @Autowired
//    private PubServiceI pubServiceI;
//    @Autowired
//    private RedisTemplate redisTemplate;
//    @Autowired
//    private CommentServiceI commentServiceI;
//    Logger logger = LoggerFactory.getLogger(DetailPagesController.class);
//
//
//
//
//
//}
