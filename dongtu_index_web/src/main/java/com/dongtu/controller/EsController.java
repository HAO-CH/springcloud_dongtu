package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.pojo.EsPojo;
import com.dongtu.pojo.TbTravelProducts;
import com.dongtu.service.EsServiceI;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.controller
 * @ClassName: Escontroller
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2020/1/2 17:40
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/2 17:40
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Controller
@RequestMapping("esController")
public class EsController {
    @Resource
    private EsServiceI esServiceI;

    @RequestMapping("findByEs")
    public String findByEs(@RequestParam String str, Model model){

        if(str == ""){
            return "index";
        }
        Result<List<EsPojo>> byEs = esServiceI.findByEs(str);
        List<EsPojo> esPojos = byEs.getData();

        //定义一个空集合
        List list = new ArrayList();
        list.add(esPojos);

        List<EsPojo> esPojos1 = null;
        List<EsPojo> list1 = new ArrayList();
        //把list集合中的数据遍历出来
        for (int i = 0; i < list.size(); i++) {
            //判断集合中的数据是不是为空,如果为空结束本次循环,继续下一次循环
            if(list.get(i)==null){
                continue;
            }
            esPojos1 = (List<EsPojo>)list.get(i);
            for (EsPojo esPojo : esPojos1) {
                list1.add(esPojo);
            }
        }
        for (EsPojo esPojo : list1 ){
            esPojo.setTpImg(esPojo.getTpImg().replace('[',' ').replace(']',' '));
            //进行字符串的分割
            String[] split = esPojo.getTpImg().split(",");
            esPojo.setTpImg(split[0].replace("\"", ""));

        }
        model.addAttribute("listEs",list1);
        return "esindex";
    }
}
