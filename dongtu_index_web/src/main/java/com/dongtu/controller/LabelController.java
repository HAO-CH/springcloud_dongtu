package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.pojo.TagProducys;
import com.dongtu.pojo.TbUser;
import com.dongtu.service.AdvertiseServiceI;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.controller
 * @ClassName: LabelController
 * @Description: java类作用描述
 * @Author: DengQing
 * @CreateDate: 2020/1/14 10:39
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/14 10:39
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Controller
@RequestMapping("label")
@CrossOrigin("*")
public class LabelController {
    @Autowired
    private AdvertiseServiceI advertiseServiceI;
    Logger logger = LoggerFactory.getLogger(LabelController.class);

    /**
     * 查询商品的标签
     *
     * @param tpId
     * @return
     */
    @RequestMapping("findLabel")
    @ResponseBody
    public List<TagProducys> findLabel(Long tpId) {
        logger.info("查询商品的标签{}", tpId);
        Result<List<TagProducys>> result = advertiseServiceI.findTag(tpId);
        List<TagProducys> tagList = result.getData();
        return tagList;
    }

    /**
     * 把标签存入redis
     *
     * @param label
     */
    @RequestMapping("StatisticaLabel")
    @ResponseBody
    public Result StatisticaLabel(@RequestParam("label[]") Long[] label, Long tpId) {
        logger.info("把标签存入缓存{},{}", label, tpId);
        TbUser user = (TbUser) SecurityUtils.getSubject().getPrincipal();
        //调用接口进行把标签出现的时间和次数存放进redis
        Result result = advertiseServiceI.StatisticaLabel(label, user, tpId);
        return result;
    }
}
