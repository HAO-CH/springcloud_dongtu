package com.dongtu.controller;

import com.alibaba.fastjson.JSONObject;
import com.dongtu.consts.RedisKeys;
import com.dongtu.consts.Result;
import com.dongtu.pojo.*;
import com.dongtu.service.CommentServiceI;
import com.dongtu.service.OrderServiceI;
import com.dongtu.service.PubServiceI;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.controller
 * @ClassName: CommentsController
 * @Description: java类作用描述
 * @Author: DengQing
 * @CreateDate: 2020/1/7 9:24
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/7 9:24
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Controller
@CrossOrigin("*")
@RequestMapping("comments")
public class CommentsController {
    @Autowired
    private CommentServiceI commentServiceI;
    @Autowired
    private OrderServiceI orderServiceI;
    @Autowired
    private PubServiceI pubServiceI;
    @Autowired
    private RedisTemplate redisTemplate;
    Logger logger = LoggerFactory.getLogger(CommentsController.class);

    /**
     * 增加评论信息
     *
     * @param tbComments
     * @param trOrderId
     * @return
     */
    @RequestMapping("addComments")
    @ResponseBody
    public Result addComments(TbComments tbComments, Long trOrderId) {
        logger.debug("增加订单，改变状态{},{}", tbComments.toString(), trOrderId);
        TbUser user = (TbUser) SecurityUtils.getSubject().getPrincipal();
        tbComments.setUserName(user.getUserName());
        tbComments.setHeadPic(user.getUserHeadPic());
        if (tbComments.getContent() == null || "".equals(tbComments.getContent())) {
            tbComments.setContent("此用户没有填写评论");
        }
        tbComments.setCommentTime(new Date());
        Result result = commentServiceI.saveComments(tbComments);
        if (result.getCode() == 10000) {
            TbTravelOrder tbTravelOrder = new TbTravelOrder();
            tbTravelOrder.setTrOrderId(trOrderId);
            tbTravelOrder.setTrStatus(8);
            Result result1 = orderServiceI.updateTravelOrder(tbTravelOrder);
            logger.debug("改变订单为已评论{}", result1);
        }
        return result;
    }

    /**
     * 查询此商品销售量
     * 查询此商品的评论数
     * 查询此商品的所有评论
     *
     * @param tbTravelProducts
     */
    @RequestMapping("findComments")
    @ResponseBody
    public Map findComments(TbTravelProducts tbTravelProducts) {
        logger.debug("查询评论参数{}", JSONObject.toJSONString(tbTravelProducts));
        Map map = new HashMap();
        //从mongodb中查询此商品所有评论
        Result<List<TbComments>> result = commentServiceI.findComments(tbTravelProducts.getTpId());
        List<TbComments> commentsList = result.getData();
        if (commentsList.size() == 0) {
            map.put("comments", 0);
        }
        Integer comments = commentsList.size();
        //放入评论数
        logger.debug("获得评论个数参数{}", comments);
        map.put("comments", comments);
        //放入评论
        logger.debug("获得评论参数{}", JSONObject.toJSONString(commentsList));
        map.put("commentsList", commentsList);
        //判断缓存中是否有商品的卖出数
        if (redisTemplate.hasKey(RedisKeys.PROD_SOLD_NUM + tbTravelProducts.getTpId())) {
            Integer num = (Integer) redisTemplate.boundValueOps(RedisKeys.PROD_SOLD_NUM + tbTravelProducts.getTpId()).get();
            logger.debug("获得已售数{}", num);
            map.put("ticketNumber", num);
        }
        map.put("ticketNumber", 0);
        return map;
    }

    /**
     * 查询酒店商品
     *
     * @param pubsId
     * @return
     */
    @RequestMapping("findPubByPubsId")
    @ResponseBody
    public TbPub findPubByPubsId(Long pubsId) {
        //调用酒店接口根据id查询酒店商品
        logger.debug("查询酒店参数{}", pubsId);
        Result<TbPub> result = pubServiceI.findById(pubsId);
        if (result.getCode() == 10000) {
            TbPub tbPub = result.getData();
            return tbPub;
        }
        return null;
    }
}
