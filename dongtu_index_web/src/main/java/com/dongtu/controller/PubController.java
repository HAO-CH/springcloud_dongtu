package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.TbPub;
import com.dongtu.pojo.TbPubSeller;
import com.dongtu.pojo.TbPubVO;
import com.dongtu.service.PubServiceI;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.controller
 * @ClassName: PubController
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2020/1/8 21:08
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/8 21:08
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@RequestMapping("pubController")
@Controller
public class PubController {

    @Resource
    private PubServiceI pubServiceI;


    //跳转酒店页面
    @RequestMapping("findList")
    public String findList(){
        return "pubList";
    }
    //酒店查询
    @RequestMapping("findPub")
    @ResponseBody
    public Result<List<TbPubVO>> findPub(){
        //调用酒店服务
        Result<List<TbPubVO>> listResult = pubServiceI.findAll();
        List<TbPubVO> tbPubVo = listResult.getData();
        return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.FIND_SUCCESS.getMessage(),tbPubVo);
    }

    @RequestMapping("findByPubsId")
    public String findByPubsId(@RequestParam("pubsId") Long pubsId,Model model){
        Result<TbPub> byId = pubServiceI.findById(pubsId);
        TbPub tbPub = byId.getData();
        model.addAttribute("tbPub",tbPub);
        return "pub";
    }

}
