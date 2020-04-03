package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.TbNavbar;
import com.dongtu.service.NavbarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: HAO
 * @Date: 2019-12-28 09:40
 * @Desc:
 */
@RestController
@RequestMapping("navbar")
public class NavbarController {

    @Resource
    private NavbarService navbarService;

    /**
     * 查询商品类型
     *
     * @return
     */
    @GetMapping("findNavbar")
    public Result<List<TbNavbar>> findNavbar() {
        List<TbNavbar> list = navbarService.findNavbar();
        return new Result<>(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), list);
    }
}
