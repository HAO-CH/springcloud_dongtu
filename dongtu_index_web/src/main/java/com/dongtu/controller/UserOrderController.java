package com.dongtu.controller;

import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.*;
import com.dongtu.service.OrderServiceI;
import com.dongtu.service.TravelNotesI;
import com.dongtu.service.TravelServiceI;
import com.dongtu.service.UserServiceI;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.controller
 * @ClassName: UserOrderController
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2020/1/3 11:28
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/3 11:28
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@RequestMapping("userOrderController")
@Controller
public class UserOrderController {
    @Resource
    private UserServiceI userServiceI;
    @Resource
    private OrderServiceI orderServiceI;
    @Resource
    private TravelServiceI travelServiceI;
    @Resource
    private TravelNotesI travelNotesI;
    Logger logger= LoggerFactory.getLogger(UserOrderController.class);


    /**
     *
     * @param model
     * 刘自豪
     * 跳转到个人中心
     * @return
     */
    @RequestMapping("centeList")
    public String myCenteList(Model model){
        //1.获取subject
        Subject subject = SecurityUtils.getSubject();
        TbUser getTbUser = (TbUser) subject.getPrincipal();
        //如果为空跳到登录页面
        if (getTbUser == null){
            return "redirect:/loginController/login";
        }
        //调UserServiceI进行用户的信息查询
        Result<TbUser> byId = userServiceI.findById(getTbUser.getUserId());
        TbUser tbUser = byId.getData();
        model.addAttribute("tbUser",tbUser);

        return "my-cente";
    }

    /**
     *
     * @param model
     * 刘自豪
     * 用户详情查询
     * @return
     */
    @RequestMapping("personalList")
    public String personalList(Model model){
        //1.获取subject
        Subject subject = SecurityUtils.getSubject();
        TbUser getTbUser = (TbUser) subject.getPrincipal();
        //调UserServiceI进行用户的信息查询
        Result<TbUser> byId = userServiceI.findById(getTbUser.getUserId());
        TbUser tbUser = byId.getData();
        model.addAttribute("tbUser",tbUser);
        return "personal-data";
    }

    /**
     *
     * @param model
     * 刘自豪
     * 已支付订单查询
     * @return
     */
    @RequestMapping("orderList")
    public String orderList(Model model){
        //1.获取subject
        Subject subject = SecurityUtils.getSubject();
        TbUser getTbUser = (TbUser) subject.getPrincipal();
        Integer status = 2;
        //调OrderServiceI订单服务查询用户已支付的订单
        Result<List<TbTravelOrder>> unpaidOrPaidOrder = orderServiceI.findUnpaidOrPaidOrder(getTbUser.getUserId(), status);
        List<TbTravelOrder> data = unpaidOrPaidOrder.getData();
        //定义一个空集合
        List list = new ArrayList();
        list.add(data);

        List<ProductsVOOrder> productsVOOrderList = new ArrayList<>();
        List<TbTravelOrder> tbTravelOrders = null;
        //遍历每一个订单9
        ProductsVOOrder productsVOOrder= new ProductsVOOrder();
        List<TbTravelOrder> tbTravelOrderList= new ArrayList();
        //把list集合中的数据遍历出来
        for (int i = 0; i < list.size(); i++) {
            //判断集合中的数据是不是为空,如果为空结束本次循环,继续下一次循环
            if(list.get(i)==null){
                continue;
            }
            tbTravelOrders = (List<TbTravelOrder>)list.get(i);
            for (TbTravelOrder tbTravelOrder : tbTravelOrders) {
                tbTravelOrderList.add(tbTravelOrder);
            }

        }
        for (TbTravelOrder tbTravelOrder : tbTravelOrderList){
            //调TravelServiceI商品服务查询商品
            Result<TbTravelProducts> byTravelProductsId = travelServiceI.findByProductById(tbTravelOrder.getTrTravelId());
            TbTravelProducts tbTravelProducts = byTravelProductsId.getData();
            productsVOOrder = new ProductsVOOrder();
            //获取时间
            productsVOOrder.setTpGoTime(tbTravelProducts.getTpGoTime());
            //商品标题名
            productsVOOrder.setTpTitle(tbTravelProducts.getTpTitle());
            //获取图片
            productsVOOrder.setTpImg(tbTravelProducts.getTpImg().replace('[',' ').replace(']',' '));
            //进行字符串的分割
            String[] split = productsVOOrder.getTpImg().split(",");
            productsVOOrder.setTpImg(split[0].replace("\"", ""));
            //商品名
            productsVOOrder.setTpTitle(tbTravelProducts.getTpTitle());
            //下单时间
            productsVOOrder.setTpGoTime(tbTravelOrder.getTpGoTime());
            //订单id
            productsVOOrder.setTrOrderId(tbTravelOrder.getTrOrderId());
            //总价钱
            productsVOOrder.setTrTravelTotalFee(tbTravelOrder.getTrTravelTotalFee());
            //商品id
            productsVOOrder.setTpId(tbTravelProducts.getTpId());

            productsVOOrder.setTrade_no(tbTravelOrder.getTrTransactionId());

            productsVOOrderList.add(productsVOOrder);
        }

        model.addAttribute("productsVOOrderList",productsVOOrderList);
        return "my-order";
    }
    /**
     *
     * @param model
     * 刘自豪
     * 代付订单查询
     * @return
     */
    @RequestMapping("payList")
    public String payList(Model model){
        //1.获取subject
        Subject subject = SecurityUtils.getSubject();
        TbUser getTbUser = (TbUser) subject.getPrincipal();
        Integer status =  1;
        Result<List<TbTravelOrder>> unpaidOrPaidOrder = orderServiceI.findUnpaidOrPaidOrder(getTbUser.getUserId(), status);
        List<TbTravelOrder> data = unpaidOrPaidOrder.getData();
        //定义一个空集合
        List list = new ArrayList();
        list.add(data);

        List<ProductsVOOrder> productsVOOrderList = new ArrayList<>();
        List<TbTravelOrder> tbTravelOrders = null;
        //遍历每一个订单9
        ProductsVOOrder productsVOOrder= new ProductsVOOrder();
        List<TbTravelOrder> tbTravelOrderList= new ArrayList();
        //把list集合中的数据遍历出来
        for (int i = 0; i < list.size(); i++) {
            //判断集合中的数据是不是为空,如果为空结束本次循环,继续下一次循环
            if(list.get(i)==null){
                continue;
            }
            tbTravelOrders = (List<TbTravelOrder>)list.get(i);
            for (TbTravelOrder tbTravelOrder : tbTravelOrders) {
                tbTravelOrderList.add(tbTravelOrder);
            }

        }
        for (TbTravelOrder tbTravelOrder : tbTravelOrderList){
            //订单id查询
            Result<TbTravelProducts> byTravelProductsId = travelServiceI.findByProductById(tbTravelOrder.getTrTravelId());
            TbTravelProducts tbTravelProducts = byTravelProductsId.getData();
            productsVOOrder = new ProductsVOOrder();
            //获取时间
            productsVOOrder.setTpGoTime(tbTravelProducts.getTpGoTime());
            //商品标题名
            productsVOOrder.setTpTitle(tbTravelProducts.getTpTitle());
            //获取图片
            productsVOOrder.setTpImg(tbTravelProducts.getTpImg().replace('[',' ').replace(']',' '));
            //进行字符串的分割
            String[] split = productsVOOrder.getTpImg().split(",");
            productsVOOrder.setTpImg(split[0].replace("\"", ""));
            //商品名
            productsVOOrder.setTpTitle(tbTravelProducts.getTpTitle());
            //下单时间
            productsVOOrder.setTpGoTime(tbTravelOrder.getTpGoTime());
            //订单id
            productsVOOrder.setTrOrderId(tbTravelOrder.getTrOrderId());
            //总价钱
            productsVOOrder.setTrTravelTotalFee(tbTravelOrder.getTrTravelTotalFee());
            //商品id
            productsVOOrder.setTpId(tbTravelProducts.getTpId());

            productsVOOrderList.add(productsVOOrder);
        }

        model.addAttribute("productsVOOrderList",productsVOOrderList);
        return "no-pay";
    }
    /**
     *
     * @param model
     * 刘自豪
     * 待评价订单查询
     * @return
     */
    @RequestMapping("commentList")
    public String commentList(Model model){
        //1.获取subject
        Subject subject = SecurityUtils.getSubject();
        TbUser getTbUser = (TbUser) subject.getPrincipal();
        Integer status = 7;
        Result<List<TbTravelOrder>> unpaidOrPaidOrder = orderServiceI.findUnpaidOrPaidOrder(getTbUser.getUserId(), status);
        List<TbTravelOrder> data = unpaidOrPaidOrder.getData();
        //定义一个空集合
        List list = new ArrayList();
        list.add(data);

        List<ProductsVOOrder> productsVOOrderList = new ArrayList<>();
        List<TbTravelOrder> tbTravelOrders = null;
        //遍历每一个订单9
        ProductsVOOrder productsVOOrder= new ProductsVOOrder();
        List<TbTravelOrder> tbTravelOrderList= new ArrayList();
        //把list集合中的数据遍历出来
        for (int i = 0; i < list.size(); i++) {
            //判断集合中的数据是不是为空,如果为空结束本次循环,继续下一次循环
            if(list.get(i)==null){
                continue;
            }
            tbTravelOrders = (List<TbTravelOrder>)list.get(i);
            for (TbTravelOrder tbTravelOrder : tbTravelOrders) {
                tbTravelOrderList.add(tbTravelOrder);
            }

        }
        for (TbTravelOrder tbTravelOrder : tbTravelOrderList){
            //订单id查询
            Result<TbTravelProducts> byTravelProductsId = travelServiceI.findByProductById(tbTravelOrder.getTrTravelId());
            TbTravelProducts tbTravelProducts = byTravelProductsId.getData();
            productsVOOrder = new ProductsVOOrder();
            //获取时间
            productsVOOrder.setTpGoTime(tbTravelProducts.getTpGoTime());
            //商品标题名
            productsVOOrder.setTpTitle(tbTravelProducts.getTpTitle());
            //获取图片
            productsVOOrder.setTpImg(tbTravelProducts.getTpImg().replace('[',' ').replace(']',' '));
            //进行字符串的分割
            String[] split = productsVOOrder.getTpImg().split(",");
            productsVOOrder.setTpImg(split[0].replace("\"", ""));
            //商品名
            productsVOOrder.setTpTitle(tbTravelProducts.getTpTitle());
            //下单时间
            productsVOOrder.setTpGoTime(tbTravelOrder.getTpGoTime());
            //订单id
            productsVOOrder.setTrOrderId(tbTravelOrder.getTrOrderId());
            //总价钱
            productsVOOrder.setTrTravelTotalFee(tbTravelOrder.getTrTravelTotalFee());
            //商品id
            productsVOOrder.setTpId(tbTravelProducts.getTpId());

            productsVOOrderList.add(productsVOOrder);
        }

        model.addAttribute("productsVOOrderList",productsVOOrderList);
        return  "no-comment";
    }


    @RequestMapping("findTravelsByIdAndUserId")
    public String findTravelsByIdAndUserId(Model model){

        return "my-travels";
    }

    @RequestMapping("findList")
    @ResponseBody
    public  Result<List<Travels>> findTravelsByIdAndUserId(){
        //1.获取subject
        Subject subject = SecurityUtils.getSubject();
        TbUser getTbUser = (TbUser) subject.getPrincipal();
        Result<List<Travels>> travelsByIdAndUserId = travelNotesI.findTravelsByIdAndUserId(getTbUser.getUserName());
        List<Travels> travelsList = travelsByIdAndUserId.getData();
        logger.info("查询的结果为{}{}",travelsList);
        return new Result<>(ResultEnum.SUCCESS.getCode(),ResultEnum.FIND_SUCCESS.getMessage(),travelsList);
    }

    /**
     * 已支付
     */
    @RequestMapping("seckillList")
    public String seckillList(Model model){
        //1.获取subject
        Subject subject = SecurityUtils.getSubject();
        TbUser getTbUser = (TbUser) subject.getPrincipal();
        Integer status =  2;
        Result<List<TbSeckillOrder>> seckillId = orderServiceI.getSeckillId(getTbUser.getUserId(), status);
        List<TbSeckillOrder> data = seckillId.getData();
        //定义一个空集合
        //把数据放到listjihezhong
        List list = new ArrayList();
        list.add(data);
        List<SeckillVOOrder> seckillVOOrdersList = new ArrayList<>();
        List<TbSeckillOrder> tbSeckillOrders = null;
        //遍历每一个订单
        SeckillVOOrder seckillVOOrder = null;
        //把list集合中的数据遍历出来
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null) {
                continue;
            }
            tbSeckillOrders = (List<TbSeckillOrder>)list.get(i);
            for (TbSeckillOrder tbSeckillOrder : tbSeckillOrders) {
                //id查询该商品
                Result<TbSeckillProduct> tbSeckillProductList = travelServiceI.findSeckillProductById(tbSeckillOrder.getSeckillId());
                TbSeckillProduct tbSeckillProduct = tbSeckillProductList.getData();
                seckillVOOrder = new SeckillVOOrder();
                //商品id
                seckillVOOrder.setId(tbSeckillProduct.getId());
                //商品名称
                seckillVOOrder.setSeckillTitle(tbSeckillProduct.getSeckillTitle());
                //获取图片
                seckillVOOrder.setSeckillSmallPic(tbSeckillProduct.getSeckillSmallPic().replace('[',' ').replace(']',' '));
                //进行字符串的分割
                String[] split = seckillVOOrder.getSeckillSmallPic().split(",");
                seckillVOOrder.setSeckillSmallPic(split[0].replace("\"", ""));
                //订单id
                seckillVOOrder.setSeckillOrderId(tbSeckillOrder.getSeckillOrderId());
                //下单时间
                seckillVOOrder.setSeckillOrderPayTime(tbSeckillOrder.getSeckillOrderPayTime());
                //总价钱
                seckillVOOrder.setSeckillOrderTotalMoney(tbSeckillOrder.getSeckillOrderTotalMoney());
                seckillVOOrder.setTrade_no(tbSeckillOrder.getTransactionId());


                seckillVOOrdersList.add(seckillVOOrder);
            }
        }
        model.addAttribute("seckillVOOrdersList",seckillVOOrdersList);
        return "my-seckill-order";
    }

    /**
     *
     * @param model
     * 为支付的订单
     * @return
     */
    @RequestMapping("paySeckillList")
    public String paySeckillList(Model model){
        //1.获取subject
        Subject subject = SecurityUtils.getSubject();
        TbUser getTbUser = (TbUser) subject.getPrincipal();
        Integer status =  1;
        Result<List<TbSeckillOrder>> seckillId = orderServiceI.getSeckillId(getTbUser.getUserId(), status);
        List<TbSeckillOrder> data = seckillId.getData();
        //定义一个空集合
        //把数据放到listjihezhong
        List list = new ArrayList();
        list.add(data);
        List<SeckillVOOrder> seckillVOOrdersList = new ArrayList<>();
        List<TbSeckillOrder> tbSeckillOrders = null;
        //遍历每一个订单
        SeckillVOOrder seckillVOOrder = null;
        //把list集合中的数据遍历出来
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null) {
                continue;
            }
            tbSeckillOrders = (List<TbSeckillOrder>)list.get(i);
            for (TbSeckillOrder tbSeckillOrder : tbSeckillOrders) {
                //id查询该商品
                Result<TbSeckillProduct> tbSeckillProductList = travelServiceI.findSeckillProductById(tbSeckillOrder.getSeckillId());
                TbSeckillProduct tbSeckillProduct = tbSeckillProductList.getData();
                seckillVOOrder = new SeckillVOOrder();
                //商品id
                seckillVOOrder.setId(tbSeckillProduct.getId());
                //商品名称
                seckillVOOrder.setSeckillTitle(tbSeckillProduct.getSeckillTitle());
                //获取图片
                seckillVOOrder.setSeckillSmallPic(tbSeckillProduct.getSeckillSmallPic().replace('[',' ').replace(']',' '));
                //进行字符串的分割
                String[] split = seckillVOOrder.getSeckillSmallPic().split(",");
                seckillVOOrder.setSeckillSmallPic(split[0].replace("\"", ""));
                //订单id
                seckillVOOrder.setSeckillOrderId(tbSeckillOrder.getSeckillOrderId());
                //下单时间
                seckillVOOrder.setSeckillOrderPayTime(tbSeckillOrder.getSeckillOrderPayTime());
                //总价钱
                seckillVOOrder.setSeckillOrderTotalMoney(tbSeckillOrder.getSeckillOrderTotalMoney());

                seckillVOOrdersList.add(seckillVOOrder);
            }
        }
        model.addAttribute("seckillVOOrdersList",seckillVOOrdersList);
        return "no-seckill";
    }

    @RequestMapping("findByUserIdOrder")
    public String findByUserIdOrder(Model model){
        //1.获取subject
        Subject subject = SecurityUtils.getSubject();
        TbUser getTbUser = (TbUser) subject.getPrincipal();
        Result<List<IntegralItem>> byUserIdOrder = orderServiceI.findByUserIdOrder(getTbUser.getUserId());
        List<IntegralItem> data = byUserIdOrder.getData();
        //定义一个空集合
        //把数据放到listjihezhong
        List list = new ArrayList();
        list.add(data);
        List<IntegralItemVO> integralItemVOList = new ArrayList<>();
        List<IntegralItem> integralItems = null;
        //遍历每一个订单
        IntegralItemVO integralItemVO = null;
        //把list集合中的数据遍历出来
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null) {
                continue;
            }
            integralItems = (List<IntegralItem>) list.get(i);
            for (IntegralItem integralItem : integralItems) {
                Result<IntegralGoods> integralGoodsResult = travelServiceI.findByGoodsId(integralItem.getGoodsId());
                IntegralGoods integralGoods = integralGoodsResult.getData();
                integralItemVO = new IntegralItemVO();
                //获取图片
                integralItemVO.setGoodsImage(integralGoods.getGoodsImage());
                //获取积分商品名
                integralItemVO.setGoodsName(integralGoods.getGoodsName());
                //获取订单号
                integralItemVO.setIntegralIdwork(integralItem.getIntegralIdwork());
                //获取积分商品件数
                integralItemVO.setIntegralNum(integralItem.getIntegralNum());
                //获取积分总价
                integralItemVO.setIntegralTotalPrice(integralItem.getIntegralTotalPrice());
                //收货人
                integralItemVO.setIntemName(integralItem.getIntemName());
                //手机号
                integralItemVO.setIntemPhone(integralItem.getIntemPhone());

                integralItemVOList.add(integralItemVO);
            }
            model.addAttribute("integralItemVOList",integralItemVOList);
        }
        return "my-integral-order";

    }


    /*
    收货
     */
    @RequestMapping("updateStatus")
    public String updateStatus(@RequestParam Long out_trade_no){
        TbTravelOrder tbTravelOrder = new TbTravelOrder();
        tbTravelOrder.setTrOrderId(out_trade_no);
        tbTravelOrder.setTrStatus(7);
        orderServiceI.updateTravelOrder(tbTravelOrder);
        return "my-order";
    }
}
