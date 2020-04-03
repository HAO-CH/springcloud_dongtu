package com.dongtu.shiro;

import com.dongtu.pojo.TbOperator;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class UserRealm extends AuthorizingRealm {

    /**
     * 执行授权逻辑
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println(">>>>>>>>执行授权逻辑");
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
        System.out.println(">>>>>>>>执行认证逻辑");
        TbOperator operator = new TbOperator();
        operator.setId(1L);
        operator.setOperName("东途");
        operator.setOperPassword("1234");
        //编写登录逻辑
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        //判断用户是否存在
        if (!operator.getOperName().equals(token.getUsername())){
            return null;
        }
        return new SimpleAuthenticationInfo(operator,operator.getOperPassword(),operator.getOperName());
    }
}
