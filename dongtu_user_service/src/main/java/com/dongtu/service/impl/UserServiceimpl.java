package com.dongtu.service.impl;

import com.dongtu.mapper.TbUserMapper;
import com.dongtu.pojo.LuckyDraw;
import com.dongtu.pojo.TbUser;
import com.dongtu.service.UserService;
import org.apache.catalina.User;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.service.impl
 * @ClassName: UserServiceimpl
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2019/12/30 11:23
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/12/30 11:23
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Service
public class UserServiceimpl implements UserService {
    @Resource
    private TbUserMapper tbUserMapper;
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public TbUser findById(Long id) {
        return tbUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateTbUser(TbUser tbUser) {
        tbUserMapper.updateByPrimaryKeySelective(tbUser);
    }

    @Override
    public void saveTbUser(TbUser tbUser) {
        tbUserMapper.insertSelective(tbUser);
    }

    @Override
    public TbUser findByUserName(String userName) {
        return tbUserMapper.findByUserName(userName);
    }

    //抽奖后减积分加积分
    @Override
    public void integralProcessing(String score, TbUser user) {
        //取出原有的用户积分
        TbUser tbUser = tbUserMapper.selectByPrimaryKey(user.getUserId());
        //扣除抽奖使用的积分
        tbUser.setUserPoints(new BigDecimal(tbUser.getUserPoints().doubleValue() - 500.00));
        if (!score.equals("谢谢参与")) {
            String integral = score.substring(2);
            //增加抽到的积分
            tbUser.setUserPoints(new BigDecimal(tbUser.getUserPoints().doubleValue() + Double.valueOf(integral)));
            //将中奖信息放入mongodb
            LuckyDraw luckyDraw = new LuckyDraw();
            luckyDraw.setUserName(user.getUserName());
            luckyDraw.setAward(score);
            luckyDraw.setWinningTime(new Date());
            mongoTemplate.save(luckyDraw);
        }
        tbUserMapper.updateByPrimaryKeySelective(tbUser);
    }
}
