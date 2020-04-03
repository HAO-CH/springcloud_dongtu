package com.dongtu.controller;

import com.alibaba.fastjson.JSONObject;
import com.baidu.ueditor.ActionEnter;
import com.dongtu.consts.RedisKeys;
import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.TbUser;
import com.dongtu.pojo.TravelCommentary;
import com.dongtu.pojo.Travels;
import com.dongtu.service.TravelNotesI;
import com.dongtu.util.FastDFSClient;
import com.dongtu.util.IdWorker;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("travelsController")
public class TravelsController {
    Logger logger = LoggerFactory.getLogger(TravelsController.class);

    @Autowired
    private TravelNotesI travelNotesI;
    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private IdWorker idWorker;

    @Autowired
    private FastDFSClient fastDFSClient;

    /**
     * 跳转游记页面
     *
     * @return
     * @author 赵方
     */
    @RequestMapping("toTravels")
    public String toTravels() {
        return "travels.html";
    }

    /**
     * 跳转游记编辑页面
     *
     * @return
     * @author 赵方
     */
    @RequestMapping("toUe")
    public String toUe() {
        //获取登录态
        TbUser user = (TbUser) SecurityUtils.getSubject().getPrincipal();
        //判断是否登录
        if (user == null) {
            return "login.html";
        } else {
            return "ue.html";
        }
    }

    /**
     * 将用户编写的游记保存到数据库
     *
     * @param trvelsContent
     * @author 赵方
     */
    @RequestMapping("saveTravels")
    @ResponseBody
    public Result saveTravels(@RequestParam String trvelsContent, @RequestParam String titleImg) {
        //获取登录态
        TbUser user = (TbUser) SecurityUtils.getSubject().getPrincipal();
        String userName = user.getUserName();
        //调用游记的接口进行保存游记到mongodb数据库
        String imgs = "http://10.112.3.12:8888/" + titleImg;
        long id = idWorker.nextId();
        //将参数传到游记服务层
        Travels travels = new Travels();
        travels.setTravelsId(String.valueOf(id));
        travels.setTitleImg(imgs);
        travels.setPostedTime(new Date());
        travels.setUserName(userName);
        travels.setTrvelsContent(trvelsContent);
        travels.setFlags(0);
        Result result = travelNotesI.saveTravels(travels);
        Integer code = result.getCode();
        return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.INSERT_SUCCESS.getMessage(), code);
    }

    /**
     * 查询所有游记
     */
    @RequestMapping("findTravelsAll")
    @ResponseBody
    public Result findTravelsAll() {
        try {
            Result<List<Travels>> listResult = travelNotesI.findTravelsAll();
            List<Travels> data = listResult.getData();
            if (data.size()>13){
                data = data.subList(0, 12);
            }
            logger.info("接收的参数为:{}{}" + JSONObject.toJSONString(data));
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), data);
        } catch (Exception e) {
            logger.error("错误信息:{}{}" + e);
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.FIND_FAILED.getMessage());
        }
    }

    /**
     * 根据Id查询数据
     */
    @RequestMapping("findTravelsById")
    public String findTravelsById(@RequestParam String travelsId, Model m) {
        logger.info("接收参数:{}{}" + travelsId);
        Result<Travels> travelsResult = travelNotesI.findTravelsById(travelsId);
        Travels data = travelsResult.getData();
        m.addAttribute("data", data);
        //获取登录态
        TbUser user = (TbUser) SecurityUtils.getSubject().getPrincipal();
        if (user == null) {
            //表示用户没有登录
            m.addAttribute("loginStatus", 0);
        } else {
            //表示用户已经登录
            m.addAttribute("loginStatus", 1);
        }
        Long increment = redisTemplate.boundValueOps(travelsId + RedisKeys.TRAVEL_PAGE_VIEWS).increment(1);
        logger.debug("浏览量自增后{}", increment);
        m.addAttribute("increment", increment);
        return "travels.html";
    }

    /**
     * ueditor 统一配置接口
     *
     * @param request
     * @author 赵方
     */
    @RequestMapping(value = "/config")
    public void config(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("application/json");
        String rootPath = request.getSession().getServletContext().getRealPath("/");
        try {
            String exec = new ActionEnter(request, rootPath).exec();
            PrintWriter writer = response.getWriter();
            writer.write(exec);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 根据游记的id进行查询游记的评论
     *
     * @param travelsId
     * @return
     */
    @RequestMapping("findTravelsComments")
    @ResponseBody
    public List<TravelCommentary> findTravelsComments(String travelsId) {
        Result<List> result = travelNotesI.findTravelsCommentsByTravelsId(travelsId);
        if (result.getCode() == 10000) {
            //评论
            List<TravelCommentary> list = result.getData();
            return list;
        }
        return null;
    }

    /**
     * 增加游记的评论
     *
     * @param travelCommentary
     * @return
     */
    @RequestMapping("saveTravelsComments")
    @ResponseBody
    public Result saveTravelsComments(TravelCommentary travelCommentary) {
        //获取登录态
        TbUser user = (TbUser) SecurityUtils.getSubject().getPrincipal();
        //用户名
        travelCommentary.setUserName(user.getUserName());
        //用户头像
        travelCommentary.setHeadPic(user.getUserHeadPic());
        //评论时间
        travelCommentary.setCommentTime(new Date());
        Result result = travelNotesI.saveTravelsComments(travelCommentary);
        return result;
    }

    /**
     * 跳转游戏页面
     */
    @RequestMapping("toGame")
    public String toGame() {
        return "game.html";
    }

    @RequestMapping("toCatGame")
    public String toCatGame() {
        return "catGame.html";
    }

    /**
     * 跳转积分城
     */
    @RequestMapping("toIntegralCity")
    public String toIntegralCity(){
        return "integral-city";
    }
}
