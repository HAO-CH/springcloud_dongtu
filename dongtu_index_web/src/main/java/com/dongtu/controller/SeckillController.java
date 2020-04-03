package com.dongtu.controller;

import com.dongtu.consts.RedisKeys;
import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.TbPub;
import com.dongtu.pojo.TbSeckillProduct;
import com.dongtu.pojo.TbUser;
import com.dongtu.pojo.UserAndSeck;
import com.dongtu.service.OrderServiceI;
import com.dongtu.service.PubServiceI;
import com.dongtu.service.SeckillServiceI;
import com.dongtu.service.TravelServiceI;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;


@Controller
@RequestMapping("seckillController")
public class SeckillController {

    @Autowired
    private SeckillServiceI seckillServiceI;

    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private PubServiceI pubServiceI;

    @Resource
    private TravelServiceI travelServiceI;

    @Resource
    private StringRedisTemplate stringRedisTemplate;


    /**
     * @Author shideyu
     * @Description //TODO S63401
     * 功能描述:调用秒杀服务接口,查询出符合条件的秒杀商品.库存>0,审核通过,当前时间小于结束时间,大于开始时间.
     * 查询出符合条件的商品进行前台展示
     * @Date 20:08 2020/1/6
     * @Param [model]
     * @return java.util.List<com.dongtu.pojo.TbSeckillProduct>
     **/
    @RequestMapping("findSkinladyAll")
    @ResponseBody
    public List<TbSeckillProduct> findSkinladyAll(){
        Result<List<TbSeckillProduct>> seckillProductAll = seckillServiceI.findSeckillProductAll();
        List<TbSeckillProduct> data = seckillProductAll.getData();
        for (TbSeckillProduct datum : data) {
            //把获取到的图片地址进行替换,然后把地址set进去
            datum.setSeckillSmallPic(datum.getSeckillSmallPic().replace('[',' ').replace(']',' '));
            //进行字符串的分割
            String[] split = datum.getSeckillSmallPic().split(",");
            //分割之后把引号去掉
            datum.setSeckillSmallPic(split[0].replace("\"", ""));
            if (datum.getSeckillTitle().length() >= 15){
                datum.setSeckillTitle(datum.getSeckillTitle().substring(0,15)+"......");
            }
        }
        return data;
    }


    /**
     *
     * @param id
     * @param model
     * 秒杀的详情页面
     * @return
     */
    @RequestMapping("findById")
    public String findById(@RequestParam("id") Long id,Model model){
        TbSeckillProduct tbSeckillProduct1 = (TbSeckillProduct) redisTemplate.boundValueOps(id).get();
        //获取 库存
        Long num = Long.valueOf(stringRedisTemplate.boundValueOps(RedisKeys.NUM_ORDER + id).get());

        tbSeckillProduct1.setSeckillStockCount(num);
        tbSeckillProduct1.setSeckillSmallPic(tbSeckillProduct1.getSeckillSmallPic().replace('[', ' ').replace(']', ' '));
        //进行字符串的分割
        String[] split = tbSeckillProduct1.getSeckillSmallPic().split(",");
        tbSeckillProduct1.setSeckillSmallPic(split[0].replace("\"", ""));
        Result<TbPub> byId = pubServiceI.findById(tbSeckillProduct1.getSeckillPubId());
        TbPub tbPub = byId.getData();
        //价钱的相加减
        BigDecimal b1 = new BigDecimal(String.valueOf(tbPub.getPubsPrice()));
        BigDecimal b2 = new BigDecimal(String.valueOf(tbSeckillProduct1.getSeckillAdultPrice()));
        BigDecimal v = BigDecimal.valueOf(b1.add(b2).doubleValue());
        //酒店
        model.addAttribute("tbPub",tbPub);
        //合计
        model.addAttribute("tbPubandtbSeckillProduct", v);
        model.addAttribute("tbSeckillProduct", tbSeckillProduct1);
        return "seckill-item";

    }

    /**
     * 秒杀
     * @return
     */
    @RequestMapping("goPurchase")
    @ResponseBody
    public Result GoPurchase(@RequestParam Long tbId,@RequestParam BigDecimal tbPubandtbSeckillProduct){
        //获取登录态
        Subject subject = SecurityUtils.getSubject();
        TbUser getTbUser = (TbUser) subject.getPrincipal();
        //判断用户是否登录
        if (getTbUser == null){
            return new Result(ResultEnum.FAILED.getCode(),ResultEnum.PLEASE_LOG_IN.getMessage());
        }
        //取出秒杀商品信息
        TbSeckillProduct tbSeckillProduct = (TbSeckillProduct) redisTemplate.boundHashOps("tbSeckillProduct").get(tbId);
        //判断该商品不存在
        if (tbSeckillProduct == null){
            return new Result(ResultEnum.ORDER.getCode(),ResultEnum.GOODS_DO_NET_EXIST.getMessage());
        }
        //判断商品的库存是否<0
        if (tbSeckillProduct.getSeckillStockCount() <= 0){
            return new Result(ResultEnum.ORDER.getCode(),ResultEnum.HAS_BEEN_SOLD_OUT.getMessage());
        }
        //获取用户已经购买的秒杀商品 以用户的id 和商品id 做key 进行查询
        UserAndSeck userAndSeck1 = (UserAndSeck) redisTemplate.boundHashOps("userAndSeck").get(tbId + getTbUser.getUserId());
        //缓存中有数据 已购买
        if (userAndSeck1 != null){
            return new Result(ResultEnum.ORDER.getCode(),ResultEnum.IN_ORDER_TO_BUY_A.getMessage());
        }
        //获取 库存
        Long num = Long.valueOf(stringRedisTemplate.boundValueOps(RedisKeys.NUM_ORDER + tbId).get());

        //获取到库存数量
        tbSeckillProduct.setSeckillStockCount(num);

        //放进缓存
        redisTemplate.boundValueOps(tbId).set(tbSeckillProduct);

        if (num < 0){
            //如果卖光了
            travelServiceI.updateSeckillProduct(tbSeckillProduct);//同步数据库
            //删除缓存
            redisTemplate.boundHashOps("tbSeckillProduct").delete(tbId);
        }

        return new Result(ResultEnum.FIND_SUCCESS.getCode(),ResultEnum.PURCHASE_SUCCEEDS.getMessage(),tbSeckillProduct);
    }



}
