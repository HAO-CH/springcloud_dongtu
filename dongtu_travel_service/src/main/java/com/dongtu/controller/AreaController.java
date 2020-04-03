package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.TbArea;
import com.dongtu.service.AreaService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: HAO
 * @Date: 2019-12-28 14:32
 * @Desc:
 */
@RestController
@RequestMapping("area")
public class AreaController {

    @Resource
    private AreaService areaService;

    /**
     * 查询地址
     *
     * @return
     */
    @GetMapping("findArea")
    public Result<List<TbArea>> findArea(@RequestParam Long areaPid) {
        List<TbArea> list = areaService.findArea(areaPid);
        return new Result<>(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), list);
    }

    //详情页面展示商品地址（根据pid当做id查询地区）
    @ApiOperation("查询详情页地区")
    @GetMapping("findAreaByAreaPid/{areaPid}")
    public Result findAreaByAreaPid(@PathVariable("areaPid") Long areaPid) {
        try {
            TbArea tbArea = areaService.findAreaByAreaPid(areaPid);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), tbArea);
        } catch (Exception e) {
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.FIND_FAILED.getMessage(), e);
        }
    }

    //根据id查询地址
    @ApiOperation("根据id查询地区")
    @GetMapping("findAreaByAreaId/{areaId}")
    public Result findAreaByAreaId(@PathVariable("areaId") Long areaId) {
        try {
            TbArea tbArea = areaService.findAreaByAreaId(areaId);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), tbArea);
        } catch (Exception e) {
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.FIND_FAILED.getMessage(), e);
        }
    }
}
