package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.TbPubSeller;
import com.dongtu.service.PubServiceI;
import com.dongtu.util.ShiroUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.controller
 * @ClassName: RegisterController
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2019/12/28 10:33
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/12/28 10:33
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Controller
@RequestMapping("registerController")
public class RegisterController {

    @Resource
    private PubServiceI pubServiceI;


    Logger logger = LoggerFactory.getLogger(PubController.class);


    @RequestMapping("registerInsertSeller")
    @ResponseBody
    public Result registerInsertSeller(TbPubSeller tbPubSeller){
        try {
            if (tbPubSeller.getPubName()==null || "".equals(tbPubSeller.getPubName()) || tbPubSeller.getPubPassword()==null || "".equals(tbPubSeller.getPubPassword())){
                return new Result(ResultEnum.FAILED.getCode(),ResultEnum.PASSNULL_REGISTER.getMessage());
            }else {

                Result byName = pubServiceI.findByName(tbPubSeller.getPubName());
                if (byName.getData() !=null){
                   return new Result(ResultEnum.FAILED.getCode(),ResultEnum.USER_NOT_EXISTS.getMessage());
                }else {
                    pubServiceI.addPubSeller(tbPubSeller);
                    logger.info("增加的信息{}{}",tbPubSeller);
                    return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.INSERT_SUCCESS.getMessage(),tbPubSeller);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return new Result(ResultEnum.FAILED.getCode(),ResultEnum.INSERT_SUCCESS.getMessage(),tbPubSeller);
        }
    }
    @RequestMapping("tosuccess")
    public String toCooperation(){
        return "admin/successStatus";
    }

}
