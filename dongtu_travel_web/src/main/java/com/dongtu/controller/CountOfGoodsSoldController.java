package com.dongtu.controller;

import com.dongtu.pojo.TbTravelSeller;
import com.dongtu.service.TravelServiceI;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: HAO
 * @Date: 2020-01-10 14:29
 * @Desc:
 */
@Controller
@RequestMapping("countGoods")
public class CountOfGoodsSoldController {

    @Resource
    private TravelServiceI travelServiceI;

    @RequestMapping("chart")
    public String chart() {

        return "chart/chart";
    }

    /**
     * 统计商家 每小时 交易单数
     *
     * @param flag 1:5分钟 2：小时 3：天
     * @return
     */
    @RequestMapping("findByTimeUnit")
    @ResponseBody
    public List findByTimeUnit(Integer flag) {
        TbTravelSeller seller = (TbTravelSeller) SecurityUtils.getSubject().getPrincipal();
        List list = travelServiceI.findByHours(seller.getTravelSellerId());
        return list;
    }

}
