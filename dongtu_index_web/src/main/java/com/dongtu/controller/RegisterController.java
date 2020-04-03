package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.TbArea;
import com.dongtu.pojo.TbUser;
import com.dongtu.service.TravelServiceI;
import com.dongtu.service.UserServiceI;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.controller
 * @ClassName: RegisterController
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2019/12/28 10:33
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/12/28 10:33
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Controller
@RequestMapping("registerController")
public class RegisterController {

    @Resource
    private UserServiceI userServiceI;

    @Resource
    private TravelServiceI travelServiceI;

    @Resource
    private RocketMQTemplate rocketMQTemplate;


    @Resource
    private RedisTemplate redisTemplate;

    Logger logger = LoggerFactory.getLogger(RegisterController.class);


    @RequestMapping("register")
    public String register(Model model){
        Result<List<TbArea>> areaList= travelServiceI.findArea((long) 0);
        List<TbArea> data = areaList.getData();
        model.addAttribute("areaList",data);
        return "register";
    }

    @RequestMapping("registerUser")
    public String registerInsertSeller(TbUser tbUser,Model model,String code,String userPasswords){
        try {
            Result<TbUser> byUserName = userServiceI.findByUserName(tbUser.getUserName());
            //判断用户是否已被注册
            TbUser data = byUserName.getData();
            if (data !=null){
                model.addAttribute("msg", "该用户已被注册");
                return "/register";
            }
            //判断密码是否一致
            if (!tbUser.getUserPassword().equals(userPasswords)){
                model.addAttribute("msg", "密码不一致");
                return "/register";
            }
            //判断验证码是否正确
            String ckeckcode = (String) redisTemplate.boundValueOps(tbUser.getUserPhone()).get();
            if (!code.equals(ckeckcode)){
                model.addAttribute("msg", "验证码不正确");
                return "/register";
            }
            //删除验证缓存
            redisTemplate.delete(tbUser.getUserPhone());
            userServiceI.saveTbUser(tbUser);
            logger.info("增加的信息{}{}",tbUser);

        }catch (Exception e){
            e.printStackTrace();
            logger.info("增加的信息失败{}{}",e);
        }
        return "login";
    }

    @RequestMapping("findByAreaPId")
    @ResponseBody
    public Result findByAreaPId(@RequestParam Long areaPid){
        try {
            Result<List<TbArea>> areaList= travelServiceI.findArea(areaPid);
            List<TbArea> data = areaList.getData();
            logger.info("三级查询{}{}",data);
            return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.INSERT_SUCCESS.getMessage(),data);
        }catch (Exception e){
            logger.info("三级查询失败{}{}",e);
            return new Result(ResultEnum.FAILED.getCode(),ResultEnum.FIND_FAILED.getMessage(),e);

        }

    }

    @RequestMapping("sendSms")
    @ResponseBody
    public String sendSms(String userPhone){
        rocketMQTemplate.convertAndSend("my-group", userPhone);
        System.out.println("消息发送成功...");
        logger.info("短信发送成功{}{}",userPhone);
        return "ok";
    }
}
