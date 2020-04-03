package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.pojo.TbCollect;
import com.dongtu.pojo.TbTravelProducts;
import com.dongtu.pojo.TbUser;
import com.dongtu.service.CollectServiceI;
import com.dongtu.service.ManagerServiceI;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.controller
 * @ClassName: CollectController
 * @Description: java类作用描述
 * @Author: DengQing
 * @CreateDate: 2020/1/9 11:54
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/9 11:54
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Controller
@CrossOrigin("*")
@RequestMapping("collect")
public class CollectController {
    @Autowired
    private CollectServiceI collectServiceI;
    @Autowired
    private RocketMQTemplate rocketMQTemplate;
    @Autowired
    private ManagerServiceI managerServiceI;
    Logger logger = LoggerFactory.getLogger(CollectController.class);

    /**
     * 查询该商品的收藏数
     *
     * @param tpId
     * @return
     */
    @RequestMapping("findCollectNum")
    @ResponseBody
    public Map findCollectNum(Long tpId) {
        logger.debug("查询该商品收藏数参数{}", tpId);
        Map map = new HashMap();
        Result result = collectServiceI.findCollectNum(tpId);
        //收藏次数
        String num = (String) result.getData();
        map.put("num", num);
        TbUser user = (TbUser) SecurityUtils.getSubject().getPrincipal();
        //没登录
        if (user == null) {
            map.put("user", 0);
            return map;
        }
        //登录查询该用户是否已收藏该商品
        TbCollect collect = new TbCollect();
        collect.setTpId(tpId);
        collect.setUserName(user.getUserName());
        Result<TbCollect> result1 = collectServiceI.findCollectByTpIdAndUserName(collect);
        TbCollect collect1 = result1.getData();
        //没收藏
        if (collect1 == null) {
            map.put("user", 0);
            return map;
        }
        map.put("user", 1);
        return map;
    }

    /**
     * 首先获取登录态 0为未登录1为登录
     * 若未登录则返回提示登录
     * 若登录则进行发送mq进行收藏
     *
     * @param tpId
     * @return
     */
    @RequestMapping("saveCollectProduct")
    @ResponseBody
    public Map saveCollectProduct(Long tpId) {
        logger.debug("点击收藏参数{}", tpId);
        TbUser user = (TbUser) SecurityUtils.getSubject().getPrincipal();
        Map map = new HashMap();
        if (user == null) {
            map.put("user", 0);
            return map;
        }
        map.put("user", 1);
        //发送mq
        TbCollect tbCollect = new TbCollect();
        tbCollect.setTpId(tpId);
        tbCollect.setUserName(user.getUserName());
        tbCollect.setCollectDate(new Date());
        rocketMQTemplate.convertAndSend("collect-product", tbCollect);
        logger.debug("收藏mq发送成功{}", tbCollect.toString());
        return map;
    }

    //收藏查询
    @RequestMapping("toCollect")
    public String collectList() {
        return "my-collect";
    }

    /**
     * 查询用户收藏的商品
     */
    @RequestMapping("myCollectProduct")
    @ResponseBody
    public List<TbTravelProducts> myCollectProduct() {
        //取出登录用户
        TbUser user = (TbUser) SecurityUtils.getSubject().getPrincipal();
        //查询用户收藏的商品
        Result<List<TbCollect>> result = collectServiceI.findMyCollect(user);
        List<TbTravelProducts> list = new ArrayList<>();
        if (result.getCode() == 10000) {
            List<TbCollect> myCollectList = result.getData();
            for (TbCollect tbCollect : myCollectList) {
                //根据用户收藏查询商品信息
                Result<TbTravelProducts> result1 = managerServiceI.findTravelProductsByTpId(tbCollect.getTpId());
                TbTravelProducts travelProducts = result1.getData();
                //将商品信息封装到list中进行页面展示
                list.add(travelProducts);
            }
        }
        return list;
    }
}
