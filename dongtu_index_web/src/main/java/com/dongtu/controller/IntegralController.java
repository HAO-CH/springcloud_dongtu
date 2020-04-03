package com.dongtu.controller;

import com.dongtu.consts.RedisKeys;
import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.IntegralGoods;
import com.dongtu.pojo.TbUser;
import com.dongtu.service.TravelServiceI;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
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

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.controller
 * @ClassName: IntegralController
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2020/1/9 23:51
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/9 23:51
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Controller
@RequestMapping("integralController")
public class IntegralController {
    @Resource
    private TravelServiceI travelServiceI;
    @Resource
    private RedisTemplate redisTemplate;
    @Resource
    private StringRedisTemplate stringRedisTemplate;


    @RequestMapping("findList")
    public String findList(Model model) {
        Result<List<IntegralGoods>> byAll = travelServiceI.findByAll();
        List<IntegralGoods> integralGoodsList = byAll.getData();
        model.addAttribute("integralGoodsList", integralGoodsList);
        return "integral";
    }
    @RequestMapping("findByGoodsId")
    public String findByGoodsId(@RequestParam Long goodsId, Model model){
        IntegralGoods integralGoods1 = (IntegralGoods) redisTemplate.boundHashOps("integralGoods").get(goodsId);
        model.addAttribute("integralGoods",integralGoods1);
        return "integralList";
    }
    @RequestMapping("findPrice")
    @ResponseBody
    public Result findPrice(@RequestParam Long goodsId,@RequestParam Integer numVal){
        IntegralGoods integralGoods1 = (IntegralGoods) redisTemplate.boundHashOps("integralGoods").get(goodsId);
        BigDecimal goodsIntegral =  integralGoods1.getGoodsIntegral();
        BigDecimal bigDecimal = new BigDecimal(""+goodsIntegral.multiply(new BigDecimal(numVal)));
        return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.FIND_SUCCESS.getMessage(),bigDecimal);
    }


    /**
     *
     * @param goodsId
     * @param numVal
     * @param integralTotalPrice
     * 积分
     * @return
     */
    @RequestMapping("getItem")
    @ResponseBody
    public Result getItem(@RequestParam Long goodsId,@RequestParam Integer numVal,@RequestParam BigDecimal integralTotalPrice){
        //获取登录态
        Subject subject = SecurityUtils.getSubject();
        TbUser getTbUser = (TbUser) subject.getPrincipal();
        //判断用户是否登录
        if (getTbUser == null){
            return new Result(ResultEnum.FAILED.getCode(),ResultEnum.PLEASE_LOG_IN.getMessage());
        }

        //取出积分商品信息
        IntegralGoods integralGoods = (IntegralGoods) redisTemplate.boundHashOps("integralGoods").get(goodsId);
        //判断该商品不存在
        if (integralGoods == null){
            return new Result(ResultEnum.ORDER.getCode(),ResultEnum.GOODS_DO_NET_EXIST.getMessage());
        }
        //判断商品的库存是否<0
        if (integralGoods.getGoodsNum() <= 0){
            return new Result(ResultEnum.ORDER.getCode(),ResultEnum.HAS_BEEN_SOLD_OUT.getMessage());
        }
        //判断买的积分是否超过用户积分
        if (getTbUser.getUserPoints().intValue() < integralTotalPrice.intValue()){
            return new Result(ResultEnum.ORDER.getCode(),ResultEnum.LACK_OF_INTEGRAL.getMessage());

        }

        //decrement自减 库存
        Long num = stringRedisTemplate.boundValueOps(RedisKeys.NUM_INTEGRAL + goodsId).decrement(numVal);

        //获取到库存数量
        integralGoods.setGoodsNum(num);

        //放进缓存
        redisTemplate.boundHashOps("integralGoods").put(goodsId,integralGoods);

       //查询
        IntegralGoods integralGoods1 = (IntegralGoods) redisTemplate.boundHashOps("integralGoods").get(goodsId);
        if (num < 0){
            //如果卖光了
            travelServiceI.updateIntegralGoods(integralGoods1);//同步数据库
            //删除缓存
            redisTemplate.boundHashOps("tbSeckillProduct").delete(goodsId);
        }

        return new Result(ResultEnum.FIND_SUCCESS.getCode(),ResultEnum.PURCHASE_SUCCEEDS.getMessage(),integralGoods );
    }



}
