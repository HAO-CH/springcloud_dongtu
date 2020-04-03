package com.dongtu.controller;

import com.alibaba.fastjson.JSONObject;
import com.dongtu.util.HttpClientUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Author shideyu
 * @Description S63401
 * 功能描述: 调用天气接口为客户提供方便
 * @Date 14:32 2020/1/10
 * @Param
 * @return
 **/
@Controller
public class WeatherController {

    Logger logger = LoggerFactory.getLogger(WeatherController.class);

        @RequestMapping("/")
        public String getWeather(Model model){
            //调用定位api查询城市编码
            Map map = new HashMap();
            map.put("key","ff50f164fcf78b4622a7963ca990e3be");
            String s = HttpClientUtil.doGet("https://restapi.amap.com/v3/ip", map);
            logger.info("查询城市编码: 查询成功参数为:{}"+s);
            Map map1 = JSONObject.parseObject(s);
            String adcode = map1.get("adcode").toString();
            logger.info("调用定位api查询城市编码: 查询成功参数为:{}"+adcode);
            //调用天气api查询
            Map map2 = new HashMap();
            map2.put("key","ff50f164fcf78b4622a7963ca990e3be");
            map2.put("city",adcode);
            String weather = HttpClientUtil.doGet("https://restapi.amap.com/v3/weather/weatherInfo", map2);
            logger.info("调用天气api查询成功参数为:{}"+weather);
            Map map3 = JSONObject.parseObject(weather,Map.class);
            List<Map<String,Object>> lg = new ArrayList<>();
            lg = (List<Map<String, Object>>) map3.get("lives");
            model.addAttribute("lg",lg);
//            //黄历
//            Map map6 = new HashMap();
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            map6.put("id","57");
//            map6.put("key","XOrH/YZjQ9n+iJ+N+o8zQm/IMwTgsJeZ/px36g");
//            map6.put("date",sdf.format(new Date()));
//            String str = HttpClientUtil.doGet("http://zhouxunwang.cn/data", map6);
//            //获取result信息并转成ma
//;            Map map7 = JSONObject.parseObject(str, Map.class);
//            String result = map7.get("result").toString();
//            Map map8 = JSONObject.parseObject(result, Map.class);
//            model.addAttribute("yi",map8.get("yi"));
//            model.addAttribute("ji",map8.get("ji "));
//            logger.info("调用黄历api查询成功参数为:{}"+"宜:{}"+map8.get("yi")+"忌:{}"+map8.get("ji "));
            return "index";
        }
}
