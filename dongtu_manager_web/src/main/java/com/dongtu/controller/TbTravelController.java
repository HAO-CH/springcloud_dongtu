package com.dongtu.controller;

import com.alibaba.fastjson.JSONObject;
import com.dongtu.consts.Result;
import com.dongtu.pojo.*;
import com.dongtu.service.ManagerServiceI;
import com.dongtu.service.TravelServiceI;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("travel")
public class TbTravelController {
    @Autowired
    private ManagerServiceI managerServiceI;
    @Autowired
    private TravelServiceI travelServiceI;
    Logger logger = LoggerFactory.getLogger(TbTravelController.class);

    //查询权限
    @RequestMapping("getPermissions")
    @ResponseBody
    public List<Map<String, Object>> getPermissions() {
        Result<List> result = managerServiceI.findPermissions(0L);
        if (result.getCode() == 10000) {
            List<Map<String, Object>> data = result.getData();
            return data;
        }
        return null;
    }

    //跳转旅游商家审核页面
    @RequestMapping("toTravelSeller")
    public String toTravelSeller() {
        return "travel/travel-seller";
    }

    //查询旅游商家审核
    @RequestMapping("findTravelSeller")
    @ResponseBody
    public List<TbTravelSeller> findTravelSeller() {
        Result<List> result = managerServiceI.findTravelSeller();
        if (result.getCode() == 10000) {
            List<TbTravelSeller> list = result.getData();
            return list;
        }
        return null;
    }

    //审核通过
    @RequestMapping("updateTravelSellerStatus")
    @ResponseBody
    public Result updateTravelSellerStatus(TbTravelSeller tbTravelSeller) {
        logger.debug("旅游商品审核传入参数{}", JSONObject.toJSONString(tbTravelSeller));
        Result result = managerServiceI.updateTravelSellerStatus(tbTravelSeller);
        return result;
    }

    //跳转秒杀页面
    @RequestMapping("toSeckillProduct")
    public String toSeckillProduct() {
        return "travel/seckill-product";
    }

    //查询秒杀商品
    @RequestMapping("findSeckillProduct")
    @ResponseBody
    public List<TbSeckillProductVO> findSeckillProduct() {
        Result<List> result = managerServiceI.findSeckillProduct();
        if (result.getCode() == 10000) {
            List<TbSeckillProductVO> list = result.getData();
            return list;
        }
        return null;
    }

    //秒杀审核
    @RequestMapping("updateSeckillProduct")
    @ResponseBody
    public Result updateSeckillProduct(TbSeckillProduct tbSeckillProduct) {
        logger.debug("秒杀审核传入参数{}", JSONObject.toJSONString(tbSeckillProduct));
        Result result = managerServiceI.updateSeckillProduct(tbSeckillProduct);
        return result;
    }

    //跳转旅游商品页面
    @RequestMapping("toTravelProducts")
    public String toTravelProducts() {
        return "travel/travel-product";
    }

    //旅游商品查询
    @RequestMapping("findTravelProducts")
    @ResponseBody
    public List<TbTravelProductsVo> findTravelProducts() {
        TbOperator tbOperator = (TbOperator) SecurityUtils.getSubject().getPrincipal();
        String operName = tbOperator.getOperName();
        Result<Map> result = managerServiceI.findTravelProducts(operName);
        if (result.getCode() == 10000) {
            Map<String, Object> map = result.getData();
            List<TbTravelProductsVo> travelProductsVoList = (List<TbTravelProductsVo>) map.get("QUANBU");
            return travelProductsVoList;
        }
        return null;
    }

    //旅游商品审核
    @RequestMapping("updateTravelProductsStatus")
    @ResponseBody
    public Result updateTravelProductsStatus(TbTravelProducts tbTravelProducts) {
        logger.debug("旅游商品审核传入参数{}", JSONObject.toJSONString(tbTravelProducts));
        Result result = managerServiceI.updateTravelProductsStatus(tbTravelProducts);
        return result;
    }

    //跳转自营商品页面
    @RequestMapping("toSalfTravelProducts")
    public String toSalfTravelProducts() {
        return "travel/salf-products";
    }

    //自营旅游商品查询
    @RequestMapping("findSalfTravelProducts")
    @ResponseBody
    public List<TbTravelProductsVo> findSalfTravelProducts() {
        TbOperator tbOperator = (TbOperator) SecurityUtils.getSubject().getPrincipal();
        String operName = tbOperator.getOperName();
        Result<Map> result = managerServiceI.findTravelProducts(operName);
        logger.debug("旅游商品查询结果{}", JSONObject.toJSONString(result));
        if (result.getCode() == 10000) {
            Map<String, Object> map = result.getData();
            List<TbTravelProductsVo> travelProductsVoList = (List<TbTravelProductsVo>) map.get("ZIYING");
            return travelProductsVoList;
        }
        return null;
    }

    //自营商品增加页面
    @RequestMapping("addSalfProductsPage")
    public String addSalfProducts(Long areaPid, Model model) {
        if (areaPid == null) {
            areaPid = 0L;
        }
        Result<List<TbArea>> areaResult = travelServiceI.findArea(areaPid);
        List<TbArea> areaList = areaResult.getData();
        model.addAttribute("areaList", areaList);
        Result<List<TbNavbar>> navbarResult = travelServiceI.findNavbar();
        List<TbNavbar> navbarList = navbarResult.getData();
        model.addAttribute("navbarList", navbarList);
        Result<List> typeResult = managerServiceI.findTravelTypeAll();
        List<TbTravelType> typeList = typeResult.getData();
        model.addAttribute("typeList", typeList);
        return "travel/add-self-products";
    }

    //查询地区
    @RequestMapping("findAreaByAreaPid")
    @ResponseBody
    public List<TbArea> findAreaByAreaPid(Long areaPid) {
        logger.debug("查询地区传入参数{}", areaPid);
        Result<List<TbArea>> result = travelServiceI.findArea(areaPid);
        logger.debug("查询地区结果{}", JSONObject.toJSONString(result));
        List<TbArea> list = result.getData();
        return list;
    }

    //增加自营商品
    @RequestMapping("addTbTravelProducts")
    @ResponseBody
    public Result addTbTravelProducts(TbTravelProducts tbTravelProducts) {
        logger.debug("自营商品增加参数{}", JSONObject.toJSONString(tbTravelProducts));
        TbOperator operator = (TbOperator) SecurityUtils.getSubject().getPrincipal();
        tbTravelProducts.setTpSellerName(operator.getOperName());
        tbTravelProducts.setIsDelete(0);
        tbTravelProducts.setTpSellerId(operator.getId());
        tbTravelProducts.setTpStatus(0);
        Result result = managerServiceI.insertTravelProducts(tbTravelProducts);
        return result;
    }

    //自营商品删除
    @RequestMapping("deleteTravelProducts")
    @ResponseBody
    public Result deleteTravelProducts(TbTravelProducts tbTravelProducts) {
        logger.debug("商品删除传入参数{}", JSONObject.toJSONString(tbTravelProducts));
        Result result = managerServiceI.deleteTravelProducts(tbTravelProducts);
        return result;
    }
}
