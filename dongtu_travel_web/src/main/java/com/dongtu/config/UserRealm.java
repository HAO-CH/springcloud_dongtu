package com.dongtu.config;

import com.dongtu.consts.Result;
import com.dongtu.pojo.TbTravelSeller;
import com.dongtu.service.TravelServiceI;
import com.dongtu.util.ShiroUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import javax.annotation.Resource;

public class UserRealm extends AuthorizingRealm {

    @Resource
    private TravelServiceI userService;

    /**
     * @param principalCollection
     * @return
     * @method 授权
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("授权>>>>>>>>");
        // 给资源进行授权
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        // 添加资源的授权字符串
//        info.addStringPermission("user:add");
//        info.addStringPermission("items:add");
        return info;
    }

    /**
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     * @method 认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("认证>>>>>>>>>");
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        Result<TbTravelSeller> result = userService.findSellerByName(token.getUsername());
        TbTravelSeller user = result.getData();
        System.out.println(user.getTravelPassword());
        if (user == null) {
            return null;
        }
        return new SimpleAuthenticationInfo(user, user.getTravelPassword(), ByteSource.Util.bytes(user.getTravelSalt()),user.getTravelName());
    }

    public static void main(String[] args) {
        String password = ShiroUtils.encryptPassword("MD5", "1", "123", 1);
        System.out.println("密码为：" + password);
    }
}
