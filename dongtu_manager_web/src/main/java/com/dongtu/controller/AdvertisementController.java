package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.pojo.TbAdveField;
import com.dongtu.pojo.TbAdvertisement;
import com.dongtu.pojo.TbAdvertisementVO;
import com.dongtu.pojo.TbMediaType;
import com.dongtu.service.ManagerServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("advertisementController")
public class AdvertisementController {

    //调用ManagerService服务
    @Autowired
    private ManagerServiceI managerServiceI;

    //跳转保险页面
    @RequestMapping("toList")
    public String toInsure(){
        return "advertisement/list";
    }

    //查询所有广告信息
    @RequestMapping("getAdvertisementAll")
    @ResponseBody
    public List<TbAdvertisementVO> getAdvertisementAll(){
        Result<List<TbAdvertisementVO>> advertisementAll = managerServiceI.findAdvertisementAll();
        List<TbAdvertisementVO> list = advertisementAll.getData();
        return list;
    }
    //跳转添加广告页面
    @RequestMapping("toAdd")
    public String toAdd(Model model){
        Result<List<TbMediaType>> mediaTypeAll = managerServiceI.findMediaTypeAll();
        List<TbMediaType> list = mediaTypeAll.getData();
        model.addAttribute("list",list);
        Result<List<TbAdveField>> tbAdveFieldAll = managerServiceI.findTbAdveFieldAll();
        List<TbAdveField> adveList = tbAdveFieldAll.getData();
        model.addAttribute("adveList",adveList);
        return "advertisement/save";
    }

    //添加广告
    @RequestMapping("saveAdvertisement")
    @ResponseBody
    public boolean saveAdvertisement(TbAdvertisement advertisement){
        String adImg = advertisement.getAdImg();
        advertisement.setAdImg("http://10.112.3.12:8888/"+adImg);
        managerServiceI.saveAdvertisement(advertisement);
        return true;
    }
    //跳转修改广告页面
    @RequestMapping("toUpdateAdvertisement")
    public String toUpdateAdvertisement(Long id,Model model){
        //媒介类型
        Result<List<TbMediaType>> mediaTypeAll = managerServiceI.findMediaTypeAll();
        List<TbMediaType> list = mediaTypeAll.getData();
        model.addAttribute("list",list);
        //广告栏位类型
        Result<List<TbAdveField>> tbAdveFieldAll = managerServiceI.findTbAdveFieldAll();
        List<TbAdveField> adveList = tbAdveFieldAll.getData();
        model.addAttribute("adveList",adveList);
        //广告回显
        Result<TbAdvertisement> result = managerServiceI.toUpdateAdvertisementById(id);
        TbAdvertisement advertisement = result.getData();
        model.addAttribute("advertisement",advertisement);
        return "advertisement/update";
    }
    //确认修改广告
    @RequestMapping("updateAdvertisement")
    @ResponseBody
    public boolean updateAdvertisement(TbAdvertisement advertisement){
        String adImg = advertisement.getAdImg();
        advertisement.setAdImg("http://10.112.3.12:8888/"+adImg);
        managerServiceI.updateAdvertisementInfo(advertisement);
        return true;
    }
    //删除广告
    @RequestMapping("deleteAdvertisement")
    @ResponseBody
    public boolean deleteAdvertisement(Long id){
        managerServiceI.deleteAdvertisementById(id);
        return true;
    }
}
