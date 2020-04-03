package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.EsPojo;
import com.dongtu.service.EsService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.controller
 * @ClassName: EsController
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2020/1/2 10:42
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/2 10:42
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@RestController
@RequestMapping("esController")
public class EsController {
    @Autowired
    private EsService esService;
    @GetMapping("findByEs")
    @ApiOperation(value = "es查询111")
    public Result<List<EsPojo>> findByEs(@RequestParam String str){
        Integer page=0;
        Integer size=3;
        List<EsPojo> list= esService.findByEs(str,page,size);
        return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.FIND_SUCCESS.getMessage(),list);
    }
}
