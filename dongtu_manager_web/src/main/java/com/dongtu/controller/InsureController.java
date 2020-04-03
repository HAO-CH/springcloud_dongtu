package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.pojo.TbInsure;
import com.dongtu.service.ManagerServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("insureController")
public class InsureController {

    //调用ManagerService服务
    @Autowired
    private ManagerServiceI managerServiceI;

    //跳转保险页面
    @RequestMapping("toList")
    public String toInsure(Model model){
        return "insure/list";
    }
    //查询所有保险
    @RequestMapping("getInsureAll")
    @ResponseBody
    public List<TbInsure> getInsureAll(){
        Result<List<TbInsure>> insureAll = managerServiceI.findInsureAll();
        List<TbInsure> list = insureAll.getData();
        return list;
    }
}
