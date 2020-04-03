package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.IntegralGoods;
import com.dongtu.service.TravelServiceI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
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
@Controller
@RequestMapping("integralController")
public class IntegralController {

    @Resource
    private TravelServiceI travelServiceI;

    Logger logger = LoggerFactory.getLogger(IntegralController.class);


    @RequestMapping("list")
    public String list(){
        return "integral/list";
    }


    @RequestMapping("findByAll")
    @ResponseBody
    public Result<List<IntegralGoods>> findByAll(){
        try {
            Result<List<IntegralGoods>> byAll = travelServiceI.findByAll();
            List<IntegralGoods> data = byAll.getData();

            logger.info("查询结果{}{}",data);
            return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.FIND_SUCCESS.getMessage(),data);

        }catch (Exception e){
            logger.error("查询错误{}{}",e);
            return new Result(ResultEnum.FAILED.getCode(),ResultEnum.FIND_FAILED.getMessage());

        }
    }
    @RequestMapping("add")
    public String add(){
        return "integral/add";
    }

    @RequestMapping("addIntegralGoods")
    @ResponseBody
    //增加商品
    public Result addTbPub(IntegralGoods integralGoods){
        try {
            travelServiceI.addIntegralGoods(integralGoods);
            logger.info("增加的商品{}{}", integralGoods);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.INSERT_SUCCESS.getMessage(),integralGoods);
        } catch (Exception e) {
            logger.error("增加的商品失败{}{}",e);
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.FIND_FAILED.getMessage());
        }
    }

}
