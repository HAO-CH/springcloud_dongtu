package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.pojo.TbTravelSeller;
import com.dongtu.service.TravelServiceI;
import com.dongtu.util.ShiroUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * @Author: HAO
 * @Date: 2019-12-27 21:21
 * @Desc:
 */
@Controller
@RequestMapping("login")
public class LoginController {

    @Resource
    private TravelServiceI loginService;

    @RequestMapping("toLog")
    public String login(Model model, String travelName, String travelPassword) {
        //使用Shiro编写登录逻辑
        // 1.获取subject
        Subject subject = SecurityUtils.getSubject();
        // 2.将参数封装成token对象
        UsernamePasswordToken token = new UsernamePasswordToken(travelName, travelPassword);
        // 3.执行登录方法
        try {
            subject.login(token);
            return "show";
        } catch (UnknownAccountException e) {
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

    @RequestMapping("toRegister")
    public String toRegister() {

        return "register";
    }

    @RequestMapping("register")
    @ResponseBody
    public boolean register(HttpServletRequest req, TbTravelSeller seller) {
        Result<TbTravelSeller> result = loginService.findSellerByName(seller.getTravelName());
        if (result.getData() != null) {
            return false;
        }
        String password = ShiroUtils.encryptPassword("MD5", seller.getTravelPassword(), seller.getTravelSalt(), 1);
        seller.setTravelPassword(password);
        seller.setTravelCreateTime(new Date());
        seller.setTravelPic("http://10.112.3.12:8888/"+seller.getTravelPic());
        loginService.addTravelSeller(seller);
        req.getSession().setAttribute("seller", seller);
        return true;
    }

    //用户退出
    @RequestMapping("logout")
    public String logout(HttpSession session) {
        //session失效
        session.invalidate();
        return "index";
    }

    //用户退出
    @RequestMapping("show")
    public String show() {

        return "show";
    }


}
