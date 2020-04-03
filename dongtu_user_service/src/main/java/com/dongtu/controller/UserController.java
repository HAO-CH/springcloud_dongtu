package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.LuckyDraw;
import com.dongtu.pojo.TbUser;
import com.dongtu.service.UserService;
import com.dongtu.util.ShiroUtils;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.controller
 * @ClassName: UserController
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2019/12/30 11:18
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/12/30 11:18
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@RestController
@RequestMapping("userController")
public class UserController {
    @Resource
    private UserService userService;
    @Autowired
    private MongoTemplate mongoTemplate;

    Logger logger = LoggerFactory.getLogger(UserController.class);


    @GetMapping("findById")
    @ApiOperation(value = "用户id查询")
    public Result<TbUser> findById(@RequestParam Long id) {
        try {
            TbUser tbUser = userService.findById(id);
            logger.info("用户Id查询{}{}", tbUser);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), tbUser);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("查询失败{}[}", e);
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.FIND_FAILED.getMessage(), e);
        }
    }

    @PutMapping("updateTbUser")
    @ApiOperation(value = "用户修改")
    public Result updateTbUser(@RequestBody TbUser tbUser) {
        try {
            userService.updateTbUser(tbUser);
            logger.info("用户Id查询{}{}", tbUser);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.UPDATE_SUCCESS.getMessage(), tbUser);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("修改失败{}{}", e);
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.UPDATE_FAILED.getMessage(), e);
        }
    }


    @PostMapping("saveTbUser")
    @ApiOperation(value = "用户增加")
    public Result saveTbUser(@RequestBody TbUser tbUser) {
        try {
            String pubPic = tbUser.getUserHeadPic();
            tbUser.setUserHeadPic("http://10.112.3.12:8888/" + pubPic);
            tbUser.setUserCreatedTime(new Date());
            tbUser.setUserUpdatedTime(new Date());
            tbUser.setUserAccountBalance(BigDecimal.valueOf(0));
            tbUser.setUserPoints(BigDecimal.valueOf(0));
            tbUser.setUserLevel(1);
            tbUser.setUserExperienceValue(0);
            String salt = ShiroUtils.generateSalt(8);
            tbUser.setUserSalt(salt);
            String md5 = ShiroUtils.encryptPassword("MD5", tbUser.getUserPassword(), salt, 1);
            tbUser.setUserPassword(md5);
            userService.saveTbUser(tbUser);
            logger.info("增加成功{}{}", tbUser);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.REGISTER_SUCCESS.getMessage(), tbUser);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("增加失败{}{}", e);
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.REGISTER_FAILED.getMessage(), e);
        }
    }

    @GetMapping("findByUserName")
    @ApiOperation(value = "用户登录查询")
    public Result<TbUser> findByUserName(@RequestParam String userName) {
        try {
            TbUser tbUser = userService.findByUserName(userName);
            logger.info("查询成功{}{}", tbUser);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), tbUser);
        } catch (Exception e) {
            e.printStackTrace();
            logger.info("查询失败{}{}", e);
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), e);

        }
    }

    @ApiOperation("扣除用户抽奖积分并增加奖励的积分")
    @PutMapping("integralProcessing")
    public Result integralProcessing(@RequestParam("score") String score, @RequestBody TbUser user) {
        try {
            logger.debug("抽奖后传入参数{},{}", score, user.toString());
            userService.integralProcessing(score, user);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.UPDATE_SUCCESS.getMessage());
        } catch (Exception e) {
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.UPDATE_SUCCESS.getMessage(), e);
        }
    }

    @ApiOperation("查询当前用户中奖信息")
    @GetMapping("findWinning")
    public Result findWinning() {
        try {
            Query query = new Query();
            query.with(Sort.by(Sort.Order.asc("winningTime")));
            List<LuckyDraw> list = mongoTemplate.find(query, LuckyDraw.class);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), list);
        } catch (Exception e) {
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.FIND_FAILED.getMessage(), e);
        }
    }
}
