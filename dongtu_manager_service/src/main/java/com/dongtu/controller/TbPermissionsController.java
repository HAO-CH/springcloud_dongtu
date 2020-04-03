package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.service.TbPermissionsService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("permissionsController")
public class TbPermissionsController {
    @Autowired
    private TbPermissionsService tbPermissionsService;
    Logger logger = LoggerFactory.getLogger(TbSeckillProductController.class);

    @ApiOperation("查询权限")
    @GetMapping("findPermissions/{permissionsPid}")
    public Result findPermissions(@PathVariable("permissionsPid") Long permissionsPid) {
        logger.debug("查询权限传入参数{}",permissionsPid);
        //判断传的值，第一次查询最高级默认给个0
        if (permissionsPid == null) {
            permissionsPid = 0L;
        }
        try {
            //查询权限
            List<Map<String, Object>> permissionsTree = tbPermissionsService.findPermissions(permissionsPid);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), permissionsTree);
        } catch (Exception e) {
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.FIND_FAILED.getMessage(), e);
        }
    }
}
