package com.dongtu.config;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {

    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(getDefaultWebSecurityManager());
        /**
         * 配置Shiro的内置过滤器
         * anon : 不需要登录就能访问的路径
         * authc : 必须登录才能访问
         * perms ：登录后也不行，还得和我们设置的权限一样才能访问
         */
        Map<String, String> fileterMap = new LinkedHashMap<>(); //存储有序
        fileterMap.put("/login/**","anon");

        fileterMap.put("/css/**","anon");
        fileterMap.put("/img/**","anon");
        fileterMap.put("/js/**","anon");
        fileterMap.put("/plugins/**","anon");
//
//        fileterMap.put("/login/login","authc");
//        fileterMap.put("/**","authc"); // /** 表示多层路径拦截

        // 授权  授权拦截后，会跳转到授权拦截页面
//        fileterMap.put("/userController/add","perms[user:add]");

//        fileterMap.put("/commentWebController/addComment","authc");
//        fileterMap.put("/user/myOrder","authc");
//        fileterMap.put("/order/getOrderInfo","authc");

        // 退出登录
//        fileterMap.put("/auth/logout","logout");
//        <a href="/auth/logout">退出</a>
        fileterMap.put("logout","logout");

        fileterMap.put("/**","anon"); //放过所有

        // 自定义登录页面
        shiroFilterFactoryBean.setLoginUrl("/login/toLog");

        //设置未授权提示页面
        shiroFilterFactoryBean.setUnauthorizedUrl("/noAuth");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(fileterMap);
        return shiroFilterFactoryBean;
    }

    @Bean
    public DefaultWebSecurityManager getDefaultWebSecurityManager(){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(getUserRealm());
        return securityManager;
    }

    @Bean
    public UserRealm getUserRealm(){
        UserRealm userRealm = new UserRealm();
        userRealm.setCredentialsMatcher(hashedCredentialsMatcher());
        return userRealm;
    }

    @Bean
    public HashedCredentialsMatcher hashedCredentialsMatcher() {
        HashedCredentialsMatcher credentialsMatcher = new HashedCredentialsMatcher();
        credentialsMatcher.setHashAlgorithmName("MD5");
        credentialsMatcher.setHashIterations(1); //加盐次数
        credentialsMatcher.setStoredCredentialsHexEncoded(true);
        return credentialsMatcher;
    }
}
