package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.pojo.TbTravelProducts;
import com.dongtu.service.ManagerServiceI;
import com.dongtu.service.TravelServiceI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("pockageTour")
public class PackageTourController {
    @Autowired
    private ManagerServiceI managerServiceI;
    Logger logger = LoggerFactory.getLogger(PackageTourController.class);

    //跳转跟团游页面
    @RequestMapping("toPackageTour")
    public String toPackageTour() {
        return "package-tour";
    }

    /**
     * 查询境内跟团游或境外跟团游数据
     * 1.出境自由行;2.出境跟团游;3.境内自由行;4.境内跟团游
     *
     * @param travelTypeId
     * @return
     */
    @RequestMapping("findTravelProductsByTravelTypeId")
    @ResponseBody
    public List<TbTravelProducts> findTravelProductsByTravelTypeId(Long travelTypeId) {
        logger.debug("查询旅游类型传入参数{}", travelTypeId);
        Result<List<TbTravelProducts>> result = managerServiceI.findTravelProductsByTravelTypeId(travelTypeId);
        if (result.getCode() == 10000) {
            List<TbTravelProducts> travelProductsList = result.getData();
            return travelProductsList;
        }
        return null;
    }

    /**
     * 查询商品信息
     * 只查询8条商品信息
     *
     * @return
     */
    @RequestMapping("findProductsRanke")
    @ResponseBody
    public List<TbTravelProducts> findProductsRanke() {
        Result<List> result = managerServiceI.findEightTravelProducts();
        List<TbTravelProducts> list = result.getData();
        if (list.size() > 8) {
            return list.subList(0, 8);
        }
        return list;
    }
}
