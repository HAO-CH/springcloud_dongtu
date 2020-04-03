package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.TbProductsParam;
import com.dongtu.service.TbProductsParamService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.controller
 * @ClassName: TbProductsParamController
 * @Description: java类作用描述
 * @Author: DengQing
 * @CreateDate: 2020/1/7 20:41
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/7 20:41
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@RestController
@RequestMapping("param")
public class TbProductsParamController {
    @Autowired
    private TbProductsParamService tbProductsParamService;
    Logger logger = LoggerFactory.getLogger(TbSeckillProductController.class);

    @ApiOperation("根据商品id查询商品注意事项")
    @GetMapping("findProductParamByTpId/{tpId}")
    public Result findProductParamByTpId(@PathVariable("tpId") Long tpId) {
        logger.debug("查询注意事项商品id{}",tpId);
        try {
            TbProductsParam tbProductsParam = tbProductsParamService.findProductParamByTpId(tpId);
            return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), tbProductsParam);
        } catch (Exception e) {
            return new Result(ResultEnum.FAILED.getCode(), ResultEnum.FIND_FAILED.getMessage(), e);
        }
    }
}
