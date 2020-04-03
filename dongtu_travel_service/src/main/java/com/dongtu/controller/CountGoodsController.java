package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.TbGoodsCountSold;
import com.dongtu.service.GoodsCountSoldService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @Author: HAO
 * @Date: 2020-01-10 14:48
 * @Desc:
 */
@RestController
@RequestMapping("countGoods")
public class CountGoodsController {

    @Resource
    private GoodsCountSoldService goodsCountSoldService;

    @GetMapping("findByMinutes")
    public Result<List<TbGoodsCountSold>> findByMinutes() {

        return new Result<>(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage());
    }

    /**
     * 统计商家 每小时 交易单数
     *
     * @param sellerId
     * @return
     */
    @GetMapping("/findByTimeUnit")
    public List findByHours(@RequestParam Long sellerId) {
        //给当前时间进行设置
        Calendar calendar = Calendar.getInstance();
        //小时分钟归零
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        int nowTime = Integer.parseInt(new SimpleDateFormat("HH").format(new Date()));
        List list = new ArrayList();
        for (int i = 0; i <= nowTime; i++) {
            //循环设置一个开始时间
            calendar.set(Calendar.HOUR_OF_DAY, i);
            Date date = new Date(calendar.getTimeInMillis());
            //循环设置一个结束时间
            calendar.set(Calendar.HOUR_OF_DAY, i + 1);
            Date date1 = new Date(calendar.getTimeInMillis());
            List<TbGoodsCountSold> soldList = goodsCountSoldService.findByHours(date, date1, sellerId);
            // 统计商家每小时成交单数，放入List
            int count = 0;
            for (int j = 0; j < soldList.size(); j++) {
                count += soldList.get(i).getCount();
            }
            list.add(count);
        }
        return list;
    }
}
