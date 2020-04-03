package com.dongtu.service;

import com.alibaba.fastjson.JSONObject;
import com.dongtu.consts.Result;
import com.dongtu.pojo.TbArea;
import com.dongtu.pojo.TbProductsParam;
import com.dongtu.pojo.TbPub;
import com.dongtu.pojo.TbTravelProducts;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import java.io.FileWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DetailPagesService {
    @Autowired
    private FreeMarkerConfigurer freeMarkerConfigurer;
    @Autowired
    private ManagerServiceI managerServiceI;
    @Autowired
    private TravelServiceI travelServiceI;
    @Autowired
    private PubServiceI pubServiceI;
    @Value("${freemarker.outputDir}")
    private String outputDir;
    Logger logger = LoggerFactory.getLogger(DetailPagesService.class);

    /**
     * 生成静态页面
     *
     * @param tbTravelProducts
     */
    public void BuildDetailPages(TbTravelProducts tbTravelProducts) {
        logger.debug("传入参数{}", JSONObject.toJSONString(tbTravelProducts));
        //加载配置
        Configuration configuration = freeMarkerConfigurer.getConfiguration();
        //加载模板
        FileWriter fileWriter = null;
        try {
            //生成的静态页面名称
            Template template = configuration.getTemplate("item.ftl");
            Map map = new HashMap();
            //放入商品(先根据商品id查询商品数据)
            Result<TbTravelProducts> result = managerServiceI.findTravelProductsByTpId(tbTravelProducts.getTpId());
            //查询的商品信息
            TbTravelProducts products = result.getData();
            logger.debug("获得商品参数{}", JSONObject.toJSONString(products));
            map.put("travelProducts", products);
            //根据地区id查询该地区的酒店
            Long areaId = products.getTpAreaId();
            Result<List<TbPub>> result4 = pubServiceI.findByArea(areaId);
            List<TbPub> pubList = result4.getData();
            logger.debug("酒店参数{}", JSONObject.toJSONString(pubList));
            map.put("pubList", pubList);
            //查询商品所在的地区第三级
            Result<TbArea> result3 = travelServiceI.findAreaByAreaId(areaId);
            TbArea area3 = result3.getData();
            logger.debug("第三级地区参数{}", JSONObject.toJSONString(area3));
            map.put("area3", area3);
            //查询商品所在的地区第二级
            Result<TbArea> result2 = travelServiceI.findAreaByAreaPid(area3.getAreaPid());
            TbArea area2 = result2.getData();
            logger.debug("第二级参数{}", JSONObject.toJSONString(area2));
            map.put("area2", area2);
            //查询商品所在的地区第一级
            Result<TbArea> result1 = travelServiceI.findAreaByAreaPid(area2.getAreaPid());
            TbArea area1 = result1.getData();
            logger.debug("第一级参数{}", JSONObject.toJSONString(area1));
            map.put("area1", area1);
            //查询商品的一些注意事项
            Result<TbProductsParam> result5 = managerServiceI.findProductParamByTpId(products.getTpId());
            TbProductsParam param = result5.getData();
            map.put("param", param);
            //生成的静态页面名称
            fileWriter = new FileWriter(outputDir + "\\" + tbTravelProducts.getTpId() + ".html");
            template.process(map, fileWriter);
            logger.debug("生成静态页面成功");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关流
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
