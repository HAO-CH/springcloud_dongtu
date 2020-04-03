package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.TbTravelSeller;
import org.springframework.web.bind.annotation.*;
import com.dongtu.service.TravelService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: HAO
 * @Date: 2019-12-27 17:22
 * @Desc:
 */

@RestController
@RequestMapping("travel")
public class TravelController {

    @Resource
    private TravelService travelService;

    /**
     * 查询所有
     *
     * @return
     */
    @GetMapping("findAll")
    public Result<List<TbTravelSeller>> findAll() {
        List<TbTravelSeller> list = travelService.findAll();
        return new Result<>(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), list);
    }

    /**
     * 增加TbTravelSeller
     *
     * @return
     */
    @PostMapping("addTbTravelSeller")
    public Result addTravelSeller(@RequestBody TbTravelSeller travelSeller) {
        travelService.addTravelSeller(travelSeller);
        return new Result<>(ResultEnum.SUCCESS.getCode(), ResultEnum.INSERT_SUCCESS.getMessage());
    }

    /**
     * 根据id查询
     *
     * @return
     */
    @GetMapping("findById/{travelSellerId}")
    public Result<TbTravelSeller> findById(@PathVariable("travelSellerId") Long travelSellerId) {
        TbTravelSeller travelSeller = travelService.findById(travelSellerId);
        return new Result<>(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), travelSeller);
    }

    /**
     * 修改
     *
     * @return
     */
    @PutMapping("updateTravelSeller")
    public Result updateTravelSeller(@RequestBody TbTravelSeller travelSeller) {
        travelService.updateTravelSeller(travelSeller);
        return new Result<>(ResultEnum.SUCCESS.getCode(), ResultEnum.UPDATE_SUCCESS.getMessage());
    }

    /**
     * 根据id删除
     *
     * @return
     */
    @DeleteMapping("deleteTravelSellerById/{travelSellerId}")
    public Result deleteTravelSellerById(@PathVariable("travelSellerId") Long travelSellerId) {
        travelService.deleteTravelSellerById(travelSellerId);
        return new Result<>(ResultEnum.SUCCESS.getCode(), ResultEnum.DELETE_SUCCESS.getMessage());
    }

    /**
     * 根据用户名查询
     *
     * @return
     */
    @GetMapping("findSellerByName")
    public Result<TbTravelSeller> findSellerByName(@RequestParam("travelName") String travelName) {
        TbTravelSeller seller = travelService.findSellerByName(travelName);
        return new Result<>(ResultEnum.SUCCESS.getCode(), ResultEnum.FIND_SUCCESS.getMessage(), seller);
    }

}
