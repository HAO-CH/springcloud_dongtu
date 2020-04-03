package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.TbTravelType;
import com.dongtu.service.TbTravelTypeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("travelType")
public class TbTravelTypeController {
    @Autowired
    private TbTravelTypeService tbTravelTypeService;

    @ApiOperation("查询旅游所有分类")
    @GetMapping("findTravelTypeAll")
    public Result findTravelTypeAll() {
        try {
            List<TbTravelType> list = tbTravelTypeService.findTravelTypeAll();
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), list);
        } catch (Exception e) {
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.FIND_FAILED.getMessage(), e);
        }
    }
}
