package com.dongtu.controller;

import com.alibaba.fastjson.JSONObject;
import com.dongtu.util.HttpClientUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.controller
 * @ClassName: TrainQueryController
 * @Description: java类作用描述
 * @Author: DengQing
 * @CreateDate: 2020/1/8 21:13
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/8 21:13
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Controller
@RequestMapping("train")
public class TrainQueryController {
    Logger logger = LoggerFactory.getLogger(TrainQueryController.class);

    /**
     * 跳转到火车查询页面
     *
     * @return
     */
    @RequestMapping("toTrain")
    public String toTrain() {
        return "train";
    }

    /**
     * 根据页面传的起点终点位置进行查询火车票
     * 调用火车票接口
     *
     * @param start
     * @param end
     * @return
     */
    @RequestMapping("findTrain")
    @ResponseBody
    public List<Map<String, Object>> findTrain(String start, String end) {
        logger.debug("查询火车票接口传入参数{},{}", start, end);
        Map map = new HashMap();
        map.put("id", "123");
        map.put("key", "U+mTq9Q3Ttv+ipiN84IzT2zGOQTgsJeZ/pxz7/4");
        map.put("start", start);
        map.put("end", end);
        String trainStr = HttpClientUtil.doGet("http://zhouxunwang.cn/data/", map);
        Map trainMap = JSONObject.parseObject(trainStr, Map.class);
        Map trainMapMsg = (Map) trainMap.get("result");
        //获得火车票信息
        List<Map<String, Object>> trainList = (List<Map<String, Object>>) trainMapMsg.get("list");
        return trainList;
    }
}
