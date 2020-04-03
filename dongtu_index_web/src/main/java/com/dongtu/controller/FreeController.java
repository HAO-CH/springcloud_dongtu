package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.pojo.TbArea;
import com.dongtu.pojo.TbTravelProducts;
import com.dongtu.service.ManagerServiceI;
import com.dongtu.service.TravelServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * freeController 自由行
 */
@Controller
@RequestMapping("freeController")   //自由行
public class FreeController {

    @Autowired
    private ManagerServiceI managerServiceI;
    @Autowired
    private TravelServiceI travelServiceI;

    /**
     * 调用运营商后台管理managerServiceI
     * 调用旅游服务 travelServiceI
     * @param model
     * @return 史德雨
     */
    //跳转自由行页面
    @RequestMapping("toFree")
    public String toFree(Model model) {
        //查询境内自由行
        Result<List<TbTravelProducts>> travelProductsByTravelTypeId = managerServiceI.findTravelProductsByTravelTypeId(3L);
        List<TbTravelProducts> freelist= new ArrayList<>();
        List<TbTravelProducts> data = travelProductsByTravelTypeId.getData();
        for (TbTravelProducts products : data) {
            //把获取到的图片地址进行替换,然后把地址set进去
            products.setTpImg(products.getTpImg().replace('[',' ').replace(']',' '));
            //进行字符串的分割
            String[] split = products.getTpImg().split(",");
            //分割之后把引号去掉
            products.setTpImg(split[0].replace("\"", ""));
            if (products.getTpTitle().length() >= 15){
                products.setTpTitle(products.getTpTitle().substring(0,10)+"...");
            }
            freelist.add(products);
        }
        //查询境外自由行
        Result<List<TbTravelProducts>> overseas = managerServiceI.findTravelProductsByTravelTypeId(1L);
        List<TbTravelProducts> overseaslist= new ArrayList<>();
        List<TbTravelProducts> data2 = overseas.getData();
        for (TbTravelProducts products : data2) {
            //把获取到的图片地址进行替换,然后把地址set进去
            products.setTpImg(products.getTpImg().replace('[',' ').replace(']',' '));
            //进行字符串的分割
            String[] split = products.getTpImg().split(",");
            //分割之后把引号去掉
            products.setTpImg(split[0].replace("\"", ""));
            if (products.getTpTitle().length() >= 15){
                products.setTpTitle(products.getTpTitle().substring(0,10)+"...");
            }
            overseaslist.add(products);
        }
        if (freelist.size()>6){
            freelist = freelist.subList(0, 6);
        }
        if (overseaslist.size()>6){
            overseaslist = overseaslist.subList(0, 6);
        }
        model.addAttribute("freelist",freelist);
        model.addAttribute("overseaslist",overseaslist);

        //调用蒿成硕的接口
        //查询地区为0的国家
        Result<List<TbArea>> area = travelServiceI.findArea(0L);
        List<TbArea> areaData = area.getData();
        //国家
        model.addAttribute("areaData", areaData);
            return "free";
        }

    /**
     * 调用旅游服务travelServiceI
     * @param areaId
     * @return
     */
    //根据省id查询下面所有的旅游景点
        @RequestMapping("sheng")
        @ResponseBody
        public List<TbArea> sheng(Long areaId){
            Result<List<TbArea>> shenglist = travelServiceI.findArea(areaId);
            List<TbArea> data = shenglist.getData();
            return data;
        }
        //根据地区景点Id查询所有旅游产品
        @RequestMapping("findAreaByIdTravel")
        public String findAreaByIdTravel(Long areaId,Model model){
            Result<List<TbTravelProducts>> productsByAreaId = travelServiceI.findProductsByAreaId(areaId);
            List<TbTravelProducts> data = productsByAreaId.getData();
            if (data.size()==0){
                return "notproduct";
            }else {
                for (TbTravelProducts datum : data) {
                    //把获取到的图片地址进行替换,然后把地址set进去
                    datum.setTpImg(datum.getTpImg().replace('[',' ').replace(']',' '));
                    //进行字符串的分割
                    String[] split = datum.getTpImg().split(",");
                    //分割之后把引号去掉
                    datum.setTpImg(split[0].replace("\"", ""));
                    if (datum.getTpTitle().length() >= 15){
                        datum.setTpTitle(datum.getTpTitle().substring(0,15)+"......");
                    }
                }
                model.addAttribute("data",data);
                return "scenic";
            }
        }
}