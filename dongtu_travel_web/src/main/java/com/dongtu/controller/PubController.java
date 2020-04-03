package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.TbPub;
import com.dongtu.service.PubServiceI;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: HAO
 * @Date: 2019-12-28 14:56
 * @Desc:
 */
@Controller
@RequestMapping("pub")
public class PubController {

    @Resource
    private PubServiceI pubService;

    @RequestMapping("findByArea")
    @ResponseBody
    public Result<List<TbPub>> findByArea(Long areaId) {
        Result<List<TbPub>> result = pubService.findByArea(areaId);
        return new Result<>(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), result.getData());
    }
}
