package com.dongtu.controller;

import com.dongtu.consts.RedisKeys;
import com.dongtu.consts.Result;
import com.dongtu.pojo.*;
import com.dongtu.service.ManagerServiceI;
import com.dongtu.service.TravelServiceI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("advertiseController")   //广告
public class AdvertiseController {

    @Autowired
    private ManagerServiceI managerServiceI;
    //调用蒿成硕的接口
    @Autowired
    private TravelServiceI travelServiceI;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    Logger logger = LoggerFactory.getLogger(AdvertiseController.class);


    //轮播图
    @RequestMapping("SlideShow")
    @ResponseBody
    public List<TbAdvertisement> SlideShow() {
        Result<List<TbAdvertisement>> contentsInfosPlanting = managerServiceI.getContentsInfosPlanting();
        List<TbAdvertisement> data = contentsInfosPlanting.getData();
        //只是查询所有广告,然后走下缓存
        Result<List<TbAdvertisementVO>> advertisementAll = managerServiceI.findAdvertisementAll();
        return data;
    }

    //查询今日推荐广告栏位
    @RequestMapping("TodayRecommend")
    @ResponseBody
    public List<TbAdvertisement> TodayRecommend() {
        Result<List<TbAdvertisement>> contentsInfosPlanting = managerServiceI.TodayRecommend();
        List<TbAdvertisement> data = contentsInfosPlanting.getData();
        return data;
    }

    //查询品牌目的地
    @RequestMapping("findAreaToImg")
    @ResponseBody
    public List<TbAreaImg> findAreaToImg() {
        Result<List<TbAreaImg>> areaImgAll = managerServiceI.findAreaImgAll();
        List<TbAreaImg> data = areaImgAll.getData();
        List<TbAreaImg> list = data.subList(0, 8);
        return list;
    }

    /**
     * managerServiceI 调用运营商后台管理服务
     *
     * @param areaId
     * @param model
     * @return 史德雨
     */
    //根据地区Id查询地区内所有的景点信息
    @RequestMapping("findAreaByIdAll")
    public String findAreaByIdAll(Long areaId, Model model) {
        Result<TbAreaImg> areaImgById = managerServiceI.findAreaImgById(areaId);
        TbAreaImg tbAreaImg = areaImgById.getData();
        model.addAttribute("tbAreaImg", tbAreaImg);
        //根据地区父Id查询下面所有的市级Id
        Result<List<TbArea>> data = travelServiceI.findArea(areaId);
        List<TbArea> areaList = data.getData();
        //定义一个空集合
        List list = new ArrayList();
        //使用增强for循环实现
        for (TbArea area : areaList) {
            System.out.println(area.getAreaId());
            //根据地区Id查询地区内所有的景点信息
            Result<List<TbTravelProducts>> productsByAreaId = travelServiceI.findProductsByAreaId(area.getAreaId());
            List<TbTravelProducts> travelProductsList = productsByAreaId.getData();
            //把每次查询出来的数据放到定义的集合中
            list.add(travelProductsList);
        }
        List<TbTravelProducts> TbTravelProducts = null;
        List<TbTravelProducts> list1 = new ArrayList();
        //把list集合中的数据遍历出来
        for (int i = 0; i < list.size(); i++) {
            //判断集合中的数据是不是为空,如果为空结束本次循环,继续下一次循环
            if (list.get(i) == null) {
                continue;
            }
            TbTravelProducts = (List<TbTravelProducts>) list.get(i);
            for (com.dongtu.pojo.TbTravelProducts tbTravelProduct : TbTravelProducts) {
                list1.add(tbTravelProduct);
            }
        }
        //遍历集合
        for (com.dongtu.pojo.TbTravelProducts tbTravelProducts : list1) {
            //把获取到的图片地址进行替换,然后把地址set进去
            tbTravelProducts.setTpImg(tbTravelProducts.getTpImg().replace('[', ' ').replace(']', ' '));
            //进行字符串的分割
            String[] split = tbTravelProducts.getTpImg().split(",");
            //分割之后把引号去掉
            tbTravelProducts.setTpImg(split[0].replace("\"", ""));
            if (tbTravelProducts.getTpTitle().length() >= 15) {
                tbTravelProducts.setTpTitle(tbTravelProducts.getTpTitle().substring(0, 15) + "......");
            }
        }
        model.addAttribute("TbTravelProducts", list1);
        return "area";
    }

    /**
     * @return
     * @Author shideyu
     * @Description //TODO S63401
     * 功能描述:最新旅游商品查询
     * @Date 22:12 2020/1/6
     * @Param
     **/
    @RequestMapping("findNewsTravelAll")
    @ResponseBody
    public List<TbTravelProducts> findNewsTravelAll() {
        Result<List<TbTravelProducts>> newsTravelAll = travelServiceI.findNewsTravelAll();
        List<TbTravelProducts> data = newsTravelAll.getData();
        return data;
    }
    /**
    /**
     * @return
     * @Author shideyu
     * @Description S63401
     * 功能描述: 广告扣款
     * @Date 11:07 2020/1/8
     * @Param
     **/
    @RequestMapping("advDeduction")
    @ResponseBody
    public boolean advDeduction(Long adId, Long adFieldId) {
        //查詢所有商家,以商家id作為key,值為余额
        Result<List<TbTravelSeller>> all = travelServiceI.findAll();
        List<TbTravelSeller> data = all.getData();
        String str =null;
        for (TbTravelSeller datum : data) {
            if (stringRedisTemplate.hasKey(RedisKeys.ADV_DEDUCTION+datum.getTravelSellerId())){
                str = stringRedisTemplate.boundValueOps(RedisKeys.ADV_DEDUCTION + datum.getTravelSellerId()).get();
            }else {
                stringRedisTemplate.boundValueOps(RedisKeys.ADV_DEDUCTION + datum.getTravelSellerId()).set(datum.getTravelBalence().toString());
                str = stringRedisTemplate.boundValueOps(RedisKeys.ADV_DEDUCTION + datum.getTravelSellerId()).get();
            }
        }
        Result<TbAdvertisement> advertisementById = managerServiceI.findAdvertisementById(adId);
        //根据广告id获取到广告商家的Id
        TbAdvertisement advertisement = advertisementById.getData();
        //先判断这个广告是哪个广告栏位
        List<TbAdvertisementVO> tbAdvertisementVOList = (List<TbAdvertisementVO>) redisTemplate.boundValueOps(RedisKeys.ADV_DEDUCTION).get();

        for (TbAdvertisementVO advertisementVO : tbAdvertisementVOList) {
            //判断广告商家和广告是否一致
            if (advertisementVO.getAdTraverlSellerId().equals(advertisement.getAdTraverlSellerId())){
                String price = stringRedisTemplate.boundValueOps(RedisKeys.ADV_DEDUCTION + advertisementVO.getAdTraverlSellerId()).get();
                if (adFieldId.equals(advertisementVO.getAdFieldId()) && adFieldId == 4) {
                    if (adId.equals(advertisementVO.getAdId())){
                        //判断金额是否>=1,如果余额不足,把广告的状态修改为失效状态
                        if (Double.valueOf(price.toString())>=3){
                            Double dd = Double.valueOf(price.toString())-3;
                            String str2=Double.toString(dd);
                            stringRedisTemplate.boundValueOps(RedisKeys.ADV_DEDUCTION + advertisement.getAdTraverlSellerId()).set(str2);
                            logger.info("广告扣费成功,当前余额为:{}"+str2);
                        }else {
                            //执行业务逻辑  把余额同步redis 和mysql 还要把广告状态改为失效
                            TbTravelSeller travelSeller = new TbTravelSeller();
                            travelSeller.setTravelSellerId(advertisement.getAdTraverlSellerId());
                            travelSeller.setTravelBalence(new BigDecimal(price));
                            travelServiceI.updateTravelSeller(travelSeller);
                            //把广告的状态改为失效
                            TbAdvertisement adv = new TbAdvertisement();
                            adv.setAdId(adId);
                            adv.setIsOpen(0); //0为失效
                            managerServiceI.updateAdvertisementInfo(adv);
                            stringRedisTemplate.delete(RedisKeys.ADV_DEDUCTION+advertisement.getAdTraverlSellerId());
                        }
                    }

                } else {//其他减-1
                    if (adId.equals(advertisementVO.getAdId())){
                        //判断金额是否>=1,如果余额不足,把广告的状态修改为失效状态
                        if (Double.valueOf(price.toString())>=1){
                            //把string类型转为duble类型
                            Double dd = Double.valueOf(price.toString())-1;
                            //把dubbo类型转换为String
                            String str2=Double.toString(dd);
                            //把当前的价格更新到当前商家的缓存中
                            stringRedisTemplate.boundValueOps(RedisKeys.ADV_DEDUCTION + advertisement.getAdTraverlSellerId()).set(str2);
                            logger.info("广告扣费成功,当前余额为:{}"+str2);
                        }else {
                            //执行业务逻辑  把余额同步redis 和mysql 还要把广告状态改为失效
                            TbTravelSeller travelSeller = new TbTravelSeller();
                            travelSeller.setTravelSellerId(advertisement.getAdTraverlSellerId());
                            travelSeller.setTravelBalence(new BigDecimal(price));
                            travelServiceI.updateTravelSeller(travelSeller);
                            //把广告的状态改为失效
                            TbAdvertisement adv = new TbAdvertisement();
                            adv.setAdId(adId);
                            adv.setIsOpen(0); //0为失效
                            managerServiceI.updateAdvertisementInfo(adv);
                            stringRedisTemplate.delete(RedisKeys.ADV_DEDUCTION+advertisement.getAdTraverlSellerId());
                        }
                    }
                }
            }
        }
        return true;
    }
}