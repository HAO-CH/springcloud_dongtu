package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.TbArea;
import com.dongtu.service.TravelServiceI;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: HAO
 * @Date: 2019-12-29 17:45
 * @Desc:
 */
@Controller
@RequestMapping("area")
public class AreaController {

    @Resource
    private TravelServiceI AreaService;

    @RequestMapping("findByAreaPId")
    @ResponseBody
    public Result<List<TbArea>> findByAreaPId(Long areaPid){
        Result<List<TbArea>> areaList = AreaService.findArea(areaPid);
        return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.FIND_SUCCESS.getMessage(),areaList);
    }
}
