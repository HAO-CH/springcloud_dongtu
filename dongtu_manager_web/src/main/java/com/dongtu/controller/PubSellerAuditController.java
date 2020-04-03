package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.pojo.TbPubSeller;
import com.dongtu.service.ManagerServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("pubSellerAuditController")
public class PubSellerAuditController {

    @Autowired
    private ManagerServiceI managerServiceI;

    //跳转未审核的酒店商家
    @RequestMapping("toList")
    public String toInsure(){
        return "pubseller/list";
    }

    //查询所有未审核的商家
    @RequestMapping("findPubSellerAuditAll")
    @ResponseBody
    public List<TbPubSeller> findPubSellerAuditAll(){
        Result<List<TbPubSeller>> listResult = managerServiceI.notAuditPubSellerAll();
        List<TbPubSeller> list = listResult.getData();
        return list;
    }

    //审核酒店商家
    @RequestMapping("updatePubSellerStatus")
    @ResponseBody
    public boolean updatePubSellerStatus(TbPubSeller tbPubSeller){
        managerServiceI.updatePubSellerStatus(tbPubSeller);
        return true;
    }


}
