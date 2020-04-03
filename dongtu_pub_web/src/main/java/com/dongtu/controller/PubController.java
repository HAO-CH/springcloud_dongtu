package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.TbArea;
import com.dongtu.pojo.TbPub;
import com.dongtu.pojo.TbPubSeller;
import com.dongtu.pojo.TbPubVO;
import com.dongtu.service.PubServiceI;
import com.dongtu.service.TravelServiceI;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.controller
 * @ClassName: PubController
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2019/12/28 9:57
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/12/28 9:57
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Controller
@RequestMapping("pubController")
public class PubController {
    @Resource
    private PubServiceI pubServiceI;

    @Resource
    private TravelServiceI travelServiceI;

    Logger logger = LoggerFactory.getLogger(PubController.class);


    @RequestMapping("list")
    public String list(){
        return "pub/list";
    }

    @RequestMapping("findAll")
    @ResponseBody
    //商品的查询
    public  Result<List<TbPubVO>> findAll() {
        try {
            Result<List<TbPubVO>> all = pubServiceI.findAll();
            List<TbPubVO> data = all.getData();
            logger.info("查询结果为{}{}",data);
            return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.FIND_SUCCESS.getMessage(),data);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("查询失败{}{}",e);
            return new Result(ResultEnum.FAILED.getCode(),ResultEnum.FIND_SUCCESS.getMessage());
        }
    }

    //商品的逻辑删除
    @RequestMapping("deleteByPubsId")
    @ResponseBody
    public Result addList(@RequestParam Long pubsId){
        try {
            Result<TbPub> result = pubServiceI.findById(pubsId);
            TbPub tbPub = result.getData();
            tbPub.setIsDelete(1);
            Result result1= pubServiceI.deleteBatch(tbPub);
            return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.DELETE_SUCCESS.getMessage(),result1.getData());
        }catch (Exception e){
            e.printStackTrace();
            return new Result(ResultEnum.FAILED.getCode(),ResultEnum.DELETE_FAILED.getMessage());

        }

    }

    @RequestMapping("addPub")
    public String addPub(Model model){
        Result<List<TbArea>> areaList= travelServiceI.findArea((long) 0);
        List<TbArea> data = areaList.getData();
        model.addAttribute("areaList",data);
        return "pub/add";
    }

    @RequestMapping("findByAreaPId")
    @ResponseBody
    public Result findByAreaPId(@RequestParam Long areaPid){
        Result<List<TbArea>> areaList= travelServiceI.findArea(areaPid);
        List<TbArea> data = areaList.getData();
        return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.INSERT_SUCCESS.getMessage(),data);
    }




    @RequestMapping("addTbPub")
    @ResponseBody
    public Result addTbPub(TbPub tbPub){
        try {
            Subject subject = SecurityUtils.getSubject();
            TbPubSeller tbPubSeller = (TbPubSeller) subject.getPrincipal();
            tbPub.setIsDelete(0);
            tbPub.setPubsSellerId(tbPubSeller.getPubSellerId());
            tbPub.setPubsSatus(1);
            String pubImg = tbPub.getPubImg();
            tbPub.setPubImg("http://10.112.3.12:8888/"+pubImg);
            pubServiceI.addTbPub(tbPub);
            logger.info("增加的信息{}{}",tbPub);
            return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.INSERT_SUCCESS.getMessage(),tbPub);
        }catch (Exception e){
            e.printStackTrace();
            return new Result(ResultEnum.FAILED.getCode(),ResultEnum.INSERT_SUCCESS.getMessage());
        }
    }




}
