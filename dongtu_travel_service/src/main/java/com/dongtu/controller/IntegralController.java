package com.dongtu.controller;

import com.alibaba.fastjson.JSONObject;
import com.dongtu.consts.RedisKeys;
import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.IntegralGoods;
import com.dongtu.pojo.TbPub;
import com.dongtu.service.IntegralService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.controller
 * @ClassName: IntegralController
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2020/1/9 21:13
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/9 21:13
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@RestController
@RequestMapping("integralController")
public class IntegralController {

    @Resource
    private IntegralService integralService;

    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    Logger logger = LoggerFactory.getLogger(IntegralController.class);
    @GetMapping("findByAll")
    @ApiOperation(value = "查询积分商品")
    public Result<List<IntegralGoods>> findByAll(){
        try {
            List<IntegralGoods> list = null;
            //如果缓存中有
            if (redisTemplate.hasKey("integralGoods")) {
                list= redisTemplate.boundHashOps("integralGoods").values();
            }else {
                list = integralService.findAll();
                for (IntegralGoods integralGoods : list) {
                    //存单个商品
                    redisTemplate.boundHashOps("integralGoods").put(integralGoods.getGoodsId(),integralGoods);
                    //存积分库存
                    stringRedisTemplate.opsForValue().set(RedisKeys.NUM_INTEGRAL+integralGoods.getGoodsId(), JSONObject.toJSONString(integralGoods.getGoodsNum()));
                }
            }
            logger.info("查询结果{}{}",list);
            return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.FIND_SUCCESS.getMessage(),list);

        }catch (Exception e){
            logger.error("查询错误{}{}",e);
            return new Result(ResultEnum.FAILED.getCode(),ResultEnum.FIND_FAILED.getMessage());

        }
    }
    @GetMapping("findByGoodsId")
    @ApiOperation(value = "Id查询积分商品")
    public Result<IntegralGoods> findByGoodsId(@RequestParam Long goodsId){
        try {
            IntegralGoods list = integralService.findByGoodsId(goodsId);
            logger.info("查询结果{}{}",list);
            return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.FIND_SUCCESS.getMessage(),list);

        }catch (Exception e){
            logger.error("查询错误{}{}",e);
            return new Result(ResultEnum.FAILED.getCode(),ResultEnum.FIND_FAILED.getMessage());

        }
    }


    @PostMapping("addIntegralGoods")
    @ApiOperation(value = "积分商品的增加")
    //增加商品
    public Result addIntegralGoods(@RequestBody IntegralGoods integralGoods){
        try {
            integralGoods.setGoodsImage("http://10.112.3.12:8888/"+integralGoods.getGoodsImage());
            integralService.addIntegralGoods(integralGoods);
            logger.info("增加的商品{}{}", integralGoods);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.INSERT_SUCCESS.getMessage(),integralGoods);
        } catch (Exception e) {
            logger.error("增加的商品失败{}{}",e);
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.FIND_FAILED.getMessage());
        }
    }

    @PutMapping("updateIntegralGoods")
    @ApiOperation(value = "积分商品的修改")
    //修改商品
    public Result updateIntegralGoods(@RequestBody IntegralGoods integralGoods){
        try {
            integralService.updateIntegralGoods(integralGoods);
            logger.info("增加的商品{}{}", integralGoods);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.UPDATE_SUCCESS.getMessage(),integralGoods);
        } catch (Exception e) {
            logger.error("增加的商品失败{}{}",e);
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.UPDATE_FAILED.getMessage());
        }
    }
}
