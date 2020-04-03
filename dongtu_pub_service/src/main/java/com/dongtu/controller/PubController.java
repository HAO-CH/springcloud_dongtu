package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.TbPub;
import com.dongtu.pojo.TbPubVO;
import com.dongtu.service.PubService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.controller
 * @ClassName: PubController
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2019/12/27 19:21
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/12/27 19:21
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@RestController
@RequestMapping("pubController")
public class PubController {
    @Autowired
    private PubService pubService;

    Logger logger = LoggerFactory.getLogger(PubController.class);


    @GetMapping("/findAll")
    @ApiOperation(value = "酒店商品查询")
    //查询所有的酒店商品
    public Result<List<TbPubVO>> findAll() {
        List<TbPubVO> list = null;
        try {
            list = pubService.findAll();
            logger.info("查询结果{}{}",list);
            return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.FIND_SUCCESS.getMessage(),list);

        }catch (Exception e){
            logger.error("查询错误{}{}",e);
            return new Result(ResultEnum.FAILED.getCode(),ResultEnum.FIND_FAILED.getMessage());

        }
    }



    @PostMapping("addTbPub")
    @ApiOperation(value = "商品的增加")
    //增加商品
    public Result addTbPub(@RequestBody TbPub tbPub){
        try {
            pubService.addTbPub(tbPub);
            logger.info("增加的商品{}{}", tbPub);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.INSERT_SUCCESS.getMessage());
        } catch (Exception e) {
            logger.error("增加的商品失败{}{}",e);
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.FIND_FAILED.getMessage());
        }
    }



    @GetMapping("/findByArea")
    @ApiOperation(value = "地区id商品查询")
    //查询所有的酒店商品
    public Result<List<TbPub>> findByArea(@RequestParam Long pubsAreaId) {
        List<TbPub> list = null;
        try {
            list = pubService.findByArea(pubsAreaId);
            logger.info("查询结果{}{}",list);
            return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.FIND_SUCCESS.getMessage(),list);
        }catch (Exception e){
            logger.error("查询错误{}{}",e);
            return new Result(ResultEnum.FAILED.getCode(),ResultEnum.FIND_FAILED.getMessage());

        }
    }




    @GetMapping("/findById")
    @ApiOperation(value = "酒店商品查询")
    //查询所有的酒店商品
    public Result<TbPub> findById(@RequestParam Long pubsId) {
        try {
            TbPub result= pubService.findById(pubsId);
            logger.info("查询结果{}{}",result);
            return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.FIND_SUCCESS.getMessage(),result);

        }catch (Exception e){
            logger.error("查询错误{}{}",e);
            return new Result(ResultEnum.FAILED.getCode(),ResultEnum.FIND_FAILED.getMessage());

        }
    }


    @PutMapping("deleteBatch")
    @ApiOperation(value = "逻辑删除")
    //增加商品
    public Result deleteBatch(@RequestBody TbPub tbPub) {
        try {
            pubService.deleteBatch(tbPub);
            logger.info("逻辑删除{}{}", tbPub);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.DELETE_SUCCESS.getMessage(),tbPub);
        } catch (Exception e) {
            logger.error("增加的商品失败{}{}",e);
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.DELETE_FAILED.getMessage());
        }
    }


}
