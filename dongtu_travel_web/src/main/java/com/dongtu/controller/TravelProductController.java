package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.pojo.*;
import com.dongtu.service.TravelServiceI;
import org.apache.shiro.SecurityUtils;
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
@RequestMapping("travelProduct")
public class TravelProductController {

    @Resource
    private TravelServiceI seckillService;

    @RequestMapping("list")
    public String list() {

        return "travel_product/travel-product-list";
    }

    @RequestMapping("find")
    @ResponseBody
    public Map<String, Object> find(TbSeckillProduct seckillProduct, @RequestParam(required = false, defaultValue = "1") Integer pageNum,
                                    @RequestParam(required = false, defaultValue = "3") Integer pageSize) {
        TbTravelSeller seller = (TbTravelSeller) SecurityUtils.getSubject().getPrincipal();
        Result<List<TbTravelProducts>> result = seckillService.findTravelProductsBySellerId(seller.getTravelSellerId());
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
        Result<List<TbTag>> alll = seckillService.findAlll();
        model.addAttribute("tbTag", alll.getData());
        return "travel_product/add";
    }

    @RequestMapping("addProduct")
    @ResponseBody
    public boolean addTravelProduct(TbTravelProducts products,@RequestParam("tagName[]") Long[] tagName) {
        TbTravelSeller seller = (TbTravelSeller) SecurityUtils.getSubject().getPrincipal();
        products.setTpSellerId(seller.getTravelSellerId());
        products.setTpSellerName(seller.getTravelName());
        seckillService.addTravelProducts(products,tagName);
        return true;
    }

    @RequestMapping("toUpdate/{id}")
    public String toUpdate(Model model, @PathVariable("id") Long id) {
        Result<List<TbNavbar>> result = seckillService.findNavbar();
        model.addAttribute("navbarList", result.getData());
        Result<List<TbArea>> areaResult = seckillService.findArea(0L);
        model.addAttribute("areaList", areaResult.getData());
        Result<TbTravelProducts> result1 = seckillService.findByTravelProductsId(id);
        model.addAttribute("p", result1.getData());
        return "travel_product/update";
    }

    @RequestMapping("updateProduct")
    @ResponseBody
    public boolean updateProduct(TbTravelProducts product) {
        seckillService.updateTravelProducts(product);
        return true;
    }

    @RequestMapping("deleteProduct")
    @ResponseBody
    public boolean deleteProduct(Long tpId) {
        seckillService.deleteTravelProductsById(tpId);
        return true;
    }
}
