package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.pojo.*;
import com.dongtu.service.TravelServiceI;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: HAO
 * @Date: 2019-12-28 00:49
 * @Desc:
 */

@Controller
@RequestMapping("seckillProduct")
public class SeckillProductController {

    @Resource
    private TravelServiceI seckillService;

    @RequestMapping("list")
    public String list() {

        return "seckill_product/seckill_product_list";
    }

    @RequestMapping("find")
    @ResponseBody
    public Map<String, Object> find(TbSeckillProduct seckillProduct, @RequestParam(required = false, defaultValue = "1") Integer pageNum,
                                    @RequestParam(required = false, defaultValue = "3") Integer pageSize) {
        TbTravelSeller seller = (TbTravelSeller) SecurityUtils.getSubject().getPrincipal();
        Result<List<TbSeckillProduct>> result = seckillService.findSeckillProductBySellerId(seller.getTravelSellerId());
        Map<String, Object> map = new HashMap<>();
        map.put("total", 15);
        map.put("rows", result.getData());
        return map;
    }

    @RequestMapping("toAdd")
    public String toAdd(Model model) {
        Result<List<TbNavbar>> result = seckillService.findNavbar();
        model.addAttribute("navbarList", result.getData());
        Result<List<TbArea>> areaResult = seckillService.findArea(0L);
        model.addAttribute("areaList", areaResult.getData());
        return "seckill_product/add";
    }

    @RequestMapping("addProduct")
    @ResponseBody
    public boolean addSeckillProduct(TbSeckillProduct seckillProduct) {
        TbTravelSeller seller = (TbTravelSeller) SecurityUtils.getSubject().getPrincipal();
        seckillProduct.setSeckillTravelSellerId(seller.getTravelSellerId());
        seckillService.addSeckillProduct(seckillProduct);
        return true;
    }

    @RequestMapping("toUpdate/{id}")
    public String toUpdate(Model model, @PathVariable("id") Long id) {
        Result<List<TbNavbar>> result = seckillService.findNavbar();
        model.addAttribute("navbarList", result.getData());
        Result<List<TbArea>> areaResult = seckillService.findArea(0L);
        model.addAttribute("areaList", areaResult.getData());
        Result<TbSeckillProduct> result1 = seckillService.findSeckillProductById(id);
        model.addAttribute("p", result1.getData());
        return "seckill_product/update";
    }

    @RequestMapping("updateProduct")
    @ResponseBody
    public boolean updateProduct(TbSeckillProduct product) {
        seckillService.updateSeckillProduct(product);
        return true;
    }

    @RequestMapping("deleteProduct")
    @ResponseBody
    public boolean deleteProduct(Long id) {
        seckillService.deleteSeckillProductById(id);
        return true;
    }
}
