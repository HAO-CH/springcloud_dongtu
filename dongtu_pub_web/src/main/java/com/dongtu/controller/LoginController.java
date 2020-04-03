package com.dongtu.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.controller
 * @ClassName: LoginController
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2019/12/28 10:13
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/12/28 10:13
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@RequestMapping("loginController")
@Controller
public class LoginController {

    @RequestMapping("toLog")
    public String toLog(String pubName, String pubPassword, Model model){

        /**
         * 使用shiro编写认证操作
         *
         */
        //1.获取subject
        Subject subject = SecurityUtils.getSubject();
        //2.封装用户数据
        UsernamePasswordToken token = new UsernamePasswordToken(pubName, pubPassword);
        //3.执行登录方法
        try {
            subject.login(token);
            //登录成功
            return "show";
        }catch (UnknownAccountException e){
            model.addAttribute("msg","用户名不存在!!!");
            return "index";
        }catch (IncorrectCredentialsException e){
            model.addAttribute("msg","密码错误!");
            return "index";
        }

    }
    @RequestMapping("toRegister")
    public String toRegister(){
        return "register";
    }
}
