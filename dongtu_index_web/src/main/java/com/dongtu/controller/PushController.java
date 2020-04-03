package com.dongtu.controller;

import com.alibaba.fastjson.JSONObject;
import com.dongtu.consts.RedisKeys;
import com.dongtu.consts.Result;
import com.dongtu.pojo.TagProducys;
import com.dongtu.pojo.TbTravelProducts;
import com.dongtu.pojo.TbUser;
import com.dongtu.service.TravelServiceI;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * shy
 * 推送
 */
@Controller
@RequestMapping("pushController")
public class PushController {

    @Autowired
    private TravelServiceI travelServiceI;

    Logger logger = LoggerFactory.getLogger(PushController.class);

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("findPushAll")
    @ResponseBody
    public List<TbTravelProducts> findPushAll(){
        TbUser user = (TbUser) SecurityUtils.getSubject().getPrincipal();
        //如果用户没有登录,给客户推送最新旅游产品
        if (user==null){
            Result<List<TbTravelProducts>> newsTravelAll = travelServiceI.findNewsTravelAll();
            List<TbTravelProducts> newList = newsTravelAll.getData();
            if (newList.size()>8){
                newList = newList.subList(0, 8);
            }
            return newList;
        }
        //创建set集合,用来存储旅游商品Id
        Set set = new HashSet();
        if (redisTemplate.hasKey(user.getUserId() + RedisKeys.LAST_VALUE)){
            String list = (String) redisTemplate.opsForValue().get(user.getUserId() + RedisKeys.LAST_VALUE);
            List<Integer> tagIds = JSONObject.parseObject(list, List.class);
            for (Integer tagId : tagIds) {
                //根据商品id查询
                Result<List<TagProducys>> tag = travelServiceI.findTag(tagId.longValue());
                List<TagProducys> tpIdsList = tag.getData();
                //tagProducys标签的对象
                for (TagProducys tagProducys : tpIdsList) {
                    set.add(tagProducys.getTpId());
                }
            }
        }
            List<TbTravelProducts> pushList = new ArrayList<>();
//        方法3 增强型for循环遍历
        Iterator it1 = set.iterator();
        while(it1.hasNext()){
            Result<TbTravelProducts> byProductById = travelServiceI.findByProductById((Long) it1.next());
            TbTravelProducts travelProducts = byProductById.getData();
            pushList.add(travelProducts);
        }
        for (TbTravelProducts tbTravelProducts : pushList) {
            //把获取到的图片地址进行替换,然后把地址set进去
            tbTravelProducts.setTpImg(tbTravelProducts.getTpImg().replace('[',' ').replace(']',' '));
            //进行字符串的分割
            String[] split = tbTravelProducts.getTpImg().split(",");
            //分割之后把引号去掉
            tbTravelProducts.setTpImg(split[0].replace("\"", ""));
            if (tbTravelProducts.getTpTitle().length() >= 15){
                tbTravelProducts.setTpTitle(tbTravelProducts.getTpTitle().substring(0,10)+"...");
            }
        }
        if (pushList.size()>8){
            pushList = pushList.subList(0, 8);
        }
        return pushList;
    }
}
