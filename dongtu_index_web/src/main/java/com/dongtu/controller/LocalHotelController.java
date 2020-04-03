package com.dongtu.controller;

import com.alibaba.fastjson.JSONObject;
import com.dongtu.util.HttpClientUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.controller
 * @ClassName: LocalHotelController
 * @Description: java类作用描述
 * @Author: DengQing
 * @CreateDate: 2020/1/8 14:40
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/8 14:40
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Controller
@RequestMapping("localHotel")
public class LocalHotelController {
    /**
     * 跳转到当地酒店页面
     *
     * @return
     */
    @RequestMapping("toLocalHotel")
    public String toLocalHotel() {
        return "local-hotel";
    }

    /**
     * 使用高德开放平台
     * 调用定位接口查询城市的adcode
     * 调用关键字搜索当前城市的酒店信息
     *
     * @return
     */
    @RequestMapping("findLocalHotel")
    @ResponseBody
    public List<Map<String, Object>> findLocalHotel() {
        Map map = new HashMap();
        //使用平台key
        map.put("key", "cb96bb12758915f0aa4ae61718a468d0");
        //调用定位接口定位当前城市返回一个json字符串
        String locationStr = HttpClientUtil.doGet("https://restapi.amap.com/v3/ip", map);
        //将返回的字符串转换为对象
        Map locationMap = JSONObject.parseObject(locationStr, Map.class);
        //获得当前城市的adcode（每个城市都是唯一的用于区分城市）
        String adcode = (String) locationMap.get("adcode");

        Map map1 = new HashMap();
        map1.put("key", "cb96bb12758915f0aa4ae61718a468d0");
        //搜索的关键字为酒店
        map1.put("keywords", "酒店");
        //搜索的城市
        map1.put("city", adcode);
        //调用关键字搜索接口
        String hotelStr = HttpClientUtil.doGet("https://restapi.amap.com/v3/place/text", map1);
        //转类型
        Map hotelMap = JSONObject.parseObject(hotelStr, Map.class);
        //获得酒店的数据
        List<Map<String, Object>> hotelListMap = (List<Map<String, Object>>) hotelMap.get("pois");
        return hotelListMap;
    }
}
