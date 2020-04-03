package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.TbSeckillProduct;
import com.dongtu.service.SeckillProductService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: HAO
 * @Date: 2019-12-27 20:10
 * @Desc:
 */

@RestController
@RequestMapping("seckillProduct")
public class SeckillProductController {

    @Resource
    private SeckillProductService seckillProductService;

    /**
     * 查询所有
     *
     * @return
     */
    @GetMapping("findAll")
    public Result<List<TbSeckillProduct>> findSeckillProductAll() {
        List<TbSeckillProduct> list = seckillProductService.findAll();
        return new Result<>(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), list);
    }

    /**
     * 增加
     *
     * @return
     */
    @PostMapping("addSeckillProduct")
    public Result addSeckillProduct(@RequestBody TbSeckillProduct seckillProduct) {
        seckillProductService.addSeckillProduct(seckillProduct);
        return new Result<>(ResultEnum.SUCCESS.getCode(), ResultEnum.INSERT_SUCCESS.getMessage());
    }

    /**
     * 根据id查询
     *
     * @return
     */
    @GetMapping("findById/{id}")
    public Result<TbSeckillProduct> findSeckillProductById(@PathVariable("id") Long id) {
        TbSeckillProduct seckillProduct = seckillProductService.findById(id);
        return new Result<>(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), seckillProduct);
    }

    /**
     * 修改
     *
     * @return
     */
    @PutMapping("updateSeckillProduct")
    public Result updateSeckillProduct(@RequestBody TbSeckillProduct seckillProduct) {
        seckillProductService.updateSeckillProduct(seckillProduct);
        return new Result<>(ResultEnum.SUCCESS.getCode(), ResultEnum.UPDATE_SUCCESS.getMessage());
    }

    /**
     * 根据id删除
     *
     * @return
     */
    @DeleteMapping("deleteSeckillProductById/{id}")
    public Result deleteSeckillProductById(@PathVariable("id") Long id) {
        seckillProductService.deleteSeckillProductById(id);
        return new Result<>(ResultEnum.SUCCESS.getCode(), ResultEnum.DELETE_SUCCESS.getMessage());
    }

    /**
     * 根据商家id查询
     *
     * @return
     */
    @GetMapping("findSeckillProductBySellerId")
    public Result<List<TbSeckillProduct>> findSeckillProductBySellerId(@RequestParam("seckillTravelSellerId") Long seckillTravelSellerId) {
        List<TbSeckillProduct> list = seckillProductService.findSeckillProductBySellerId(seckillTravelSellerId);
        return new Result<>(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), list);
    }
}
