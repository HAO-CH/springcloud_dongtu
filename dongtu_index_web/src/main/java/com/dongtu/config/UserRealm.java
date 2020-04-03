package com.dongtu.config;



import com.dongtu.consts.Result;
import com.dongtu.consts.ResultEnum;
import com.dongtu.pojo.TbPubSeller;
import com.dongtu.pojo.TbUser;
import com.dongtu.service.PubServiceI;
import com.dongtu.service.UserServiceI;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import javax.annotation.Resource;


public class UserRealm extends AuthorizingRealm {
    @Resource
    private UserServiceI userServiceI;
    /**
     * 执行授权逻辑
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行授权逻辑");

        return null;
    }

    /**
     * 执行认证逻辑
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("执行认证逻辑");

         //填写shrio判断逻辑,判断账号密码
        UsernamePasswordToken token =(UsernamePasswordToken) authenticationToken;
        //假设数据库用户名密码
        Result<TbUser> byUserName = userServiceI.findByUserName(token.getUsername());
        TbUser data =  byUserName.getData();
        if (data==null){
            //用户名不存在
            return null;
        }
        //2.判断密码
        return new SimpleAuthenticationInfo(data, data.getUserPassword(), ByteSource.Util.bytes(data.getUserSalt()),data.getUserName());
    }
}
