package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.pojo.TbPub;
import com.dongtu.pojo.TbPubProductVO;
import com.dongtu.service.ManagerServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("pubProductController") //酒店商品审核
public class PubProductController {

    @Autowired
    private ManagerServiceI managerServiceI;

    //跳转未审核的酒店商品页面
    @RequestMapping("toList")
    public String toInsure(){
        return "pub/list";
    }

    //查询所有未审核的酒店商品
    @RequestMapping("findPubProductAuditAll")
    @ResponseBody
    public List<TbPubProductVO> findPubProductAuditAll(){
        Result<List<TbPubProductVO>> listResult = managerServiceI.notAuditPubAll();
        List<TbPubProductVO> list = listResult.getData();
        return list;
    }

    //修改酒店商品的审核状态
    @RequestMapping("updatePubProductStatus")
    @ResponseBody
    public boolean updatePubProductStatus(TbPub pub){
        managerServiceI.updatePubStatus(pub);
        return true;
    }
}
