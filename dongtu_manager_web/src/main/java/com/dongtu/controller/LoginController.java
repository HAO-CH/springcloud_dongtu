package com.dongtu.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("loginController")
@Controller
public class LoginController {

    @RequestMapping("login")
    public String login(String operName, String operPassword, Model model){
        //使用shiro编写登录逻辑
        //1.获取subject
        Subject subject = SecurityUtils.getSubject();
        //2.将参数封装到token对象
        UsernamePasswordToken token = new UsernamePasswordToken(operName,operPassword);
        //3.执行登录方法
        try {
            subject.login(token);
            return "show";
        }catch (UnknownAccountException e) {
            e.printStackTrace();
            model.addAttribute("message", "账号不存在");
            return "login";
        } catch (IncorrectCredentialsException e) {
            e.printStackTrace();
            model.addAttribute("message", "密码错误");
            return "index";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
