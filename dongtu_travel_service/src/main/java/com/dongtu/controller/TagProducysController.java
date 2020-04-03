package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.TagProducys;
import com.dongtu.pojo.TbTag;
import com.dongtu.service.TagProducysService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.controller
 * @ClassName: TagProducysController
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2020/1/14 14:40
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/14 14:40
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@RestController
@RequestMapping("tagProducysController")
public class TagProducysController {
    @Resource
    private TagProducysService tagProducysService;

    Logger logger = LoggerFactory.getLogger(TagProducysController.class);

    @GetMapping("findAll")
    @ApiOperation(value = "查询所有标签")
    public Result<List<TbTag>> findAlll(){
        List<TbTag> list = tagProducysService.findAll();
        return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.FIND_SUCCESS.getMessage(),list);
    }

    @ApiOperation("标签查对应的商品")
    @GetMapping("findTagId")
    public Result<List<TagProducys>> findTag(@RequestParam("tpId") Long tabId) {
        try {
            logger.debug("查询商品标签参数{}", tabId);
            List<TagProducys> list = tagProducysService.findTag(tabId);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), list);
        } catch (Exception e) {
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.FIND_FAILED.getMessage(), e);
        }
    }
}
