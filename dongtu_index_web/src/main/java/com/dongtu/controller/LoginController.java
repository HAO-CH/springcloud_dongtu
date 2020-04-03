package com.dongtu.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dongtu.consts.RedisKeys;
import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.LuckyDraw;
import com.dongtu.pojo.TbUser;
import com.dongtu.service.UserServiceI;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.controller
 * @ClassName: LoginController
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2019/12/31 9:20
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/12/31 9:20
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Controller
@RequestMapping("loginController")
@CrossOrigin("*")
public class LoginController {

    @Autowired
    private RedisTemplate redisTemplate;
    @Resource
    private RocketMQTemplate rocketMQTemplate;
    @Autowired
    private UserServiceI userServiceI;

    Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping("login")
    public String login() {
        return "login";
    }

    @RequestMapping("toLog")
    public String toLog(String username, String password, Model model) {

        /**
         * 使用shiro编写认证操作
         *
         */
        //1.获取subject
        Subject subject = SecurityUtils.getSubject();
        //2.封装用户数据
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        //3.执行登录方法
        try {
            subject.login(token);
            TbUser user = (TbUser) SecurityUtils.getSubject().getPrincipal();
            redisTemplate.opsForValue().set(RedisKeys.LOGIN_USER, JSONObject.toJSONString(user));
            //登录成功
            return "index";
        } catch (UnknownAccountException e) {
            model.addAttribute("msg", "用户名不存在!!!");
            return "login";
        } catch (IncorrectCredentialsException e) {
            model.addAttribute("msg", "密码错误! 活用户不存在");
            return "login";
        }

    }

    //用户退出
    @RequestMapping("logout")
    public String logout(HttpSession session) {
        //session失效
        session.invalidate();
        return "index";
    }

    //判断登录 退出登录
    @RequestMapping("logoutAnlong")
    @ResponseBody
    public Result logoutAnlong() {
        //1.获取subject
        Subject subject = SecurityUtils.getSubject();
        TbUser tbUser = (TbUser) subject.getPrincipal();
        if (tbUser == null) {
            //没登录
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage());
        }
        //一登录
        return new Result(ResultEnum.FAILED.getCode(), ResultEnum.FIND_FAILED.getMessage(), tbUser);

    }

    /**
     * @return com.dongtu.consts.Result
     * @Author shideyu
     * @Description S63401
     * 功能描述:打卡功能 技术点 redis + MQ
     * @Date 21:18 2020/1/9
     * @Param []
     **/
    @RequestMapping("daka")
    @ResponseBody
    public Result daka() {
        TbUser user = (TbUser) SecurityUtils.getSubject().getPrincipal();
        //判断用户有没有登录
        if (user == null) {
            //提示用户先登录
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.PLEASE_LOG_IN.getMessage());
        }
        //先判断有没有这个key,如果有这个key了,说明用户已经打卡成功了
        if (redisTemplate.hasKey(RedisKeys.DA_KA + user.getUserId())) {
            String name = (String) redisTemplate.boundValueOps(RedisKeys.DA_KA + user.getUserId()).get();
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.HAS_CLOCK_DAKA.getMessage(), name);
        } else {
            //把数据放入mq中
            redisTemplate.boundValueOps(RedisKeys.DA_KA + user.getUserId()).set(user.getUserName());
            //然后取出数据
            String name = (String) redisTemplate.boundValueOps(RedisKeys.DA_KA + user.getUserId()).get();
            //发送mq消息
            rocketMQTemplate.convertAndSend("daka-topic", user);
            logger.info("打卡发送消息成功.参数为:{}", JSON.toJSONString(user));
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.DAKA_SUCCESS.getMessage(), name);
        }
    }

    /**
     * 判断当前用户积分是否够抽奖
     *
     * @return
     */
    @RequestMapping("reward")
    @ResponseBody
    public Map reward() {
        TbUser user = (TbUser) SecurityUtils.getSubject().getPrincipal();
        Result<TbUser> result = userServiceI.findById(user.getUserId());
        TbUser tbUser = result.getData();
        Map map = new HashMap();
        if (tbUser.getUserPoints().doubleValue() < 500.00) {
            map.put("points", 0);
            return map;
        }
        map.put("points", 1);
        return map;
    }

    /**
     * 减去用户抽奖使用的积分
     * 增加用户抽中的积分
     */
    @RequestMapping("changeIntegral")
    @ResponseBody
    public Result changeIntegral(String score) {
        TbUser user = (TbUser) SecurityUtils.getSubject().getPrincipal();
        Result result = userServiceI.integralProcessing(score, user);
        return result;
    }

    /**
     * 查询当天用户中奖情况
     */
    @RequestMapping("findWinning")
    @ResponseBody
    public List<LuckyDraw> findWinning() {
        Result<List> result = userServiceI.findWinning();
        List<LuckyDraw> list = result.getData();
        return list;
    }

    /**
     * 跳转首页面
     */
    @RequestMapping("toIndex")
    public String toIndex() {
        return "index";
    }
}
