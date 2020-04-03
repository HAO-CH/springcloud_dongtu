package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.TbPubSeller;
import com.dongtu.service.PubSellerService;
import com.dongtu.util.ShiroUtils;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.controller
 * @ClassName: PubSellerController
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2019/12/28 11:14
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/12/28 11:14
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@RestController
@RequestMapping("pubSellerController")
public class PubSellerController {
    @Resource
    private PubSellerService pubSellerService;

    Logger logger = LoggerFactory.getLogger(PubController.class);

    @GetMapping("findByName")
    @ApiOperation(value ="名字的查询")
    public Result findByName(@RequestParam String pubName){
        try {
            Result tbPubSeller= pubSellerService.findByName(pubName);
            logger.info("名字的查询{}{}", tbPubSeller);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.INSERT_SUCCESS.getMessage(),tbPubSeller);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(ResultEnum.FAILED.getCode(),ResultEnum.FIND_FAILED.getMessage());
        }
    }

    @PostMapping("addPubSeller")
    @ApiOperation(value ="增加用户")
    public Result addPubSeller (@RequestBody TbPubSeller tbPubSeller){
        try {
            String pubPic = tbPubSeller.getPubPic();
            tbPubSeller.setPubPic("http://10.112.3.12:8888/"+pubPic);
            tbPubSeller.setPubStatus(0);
            String salt = ShiroUtils.generateSalt(8);
            tbPubSeller.setPubSalt(salt);
            tbPubSeller.setPubCreateTime(new Date());
            String md5 = ShiroUtils.encryptPassword("MD5", tbPubSeller.getPubPassword(), salt, 1);
            tbPubSeller.setPubPassword(md5);
            pubSellerService.addPubSeller(tbPubSeller);
            logger.info("增加用户{}{}", tbPubSeller);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.INSERT_SUCCESS.getMessage(),tbPubSeller);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(ResultEnum.FAILED.getCode(),ResultEnum.FIND_FAILED.getMessage());
        }
    }

    @GetMapping("findByNameLogin")
    @ApiOperation(value ="用户登录")
    public Result<TbPubSeller> findByNameLogin(@RequestParam("username") String username){
        try {
            TbPubSeller tbPubSeller = pubSellerService.findByNameLogin(username);
            logger.info("用户登录查询{}{}", tbPubSeller);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.INSERT_SUCCESS.getMessage(),tbPubSeller);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(ResultEnum.FAILED.getCode(),ResultEnum.FIND_FAILED.getMessage());
        }
    }
}
