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

    /**
     * 创建 ShiroFilterFactoryBean
     * @return
     */
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        //设置安全管理器
        shiroFilterFactoryBean.setSecurityManager(getDefaultWebSecurityManager());
        /** 添加Shiro内置过滤器
         *  常用过滤器:
         *    anon:无需认证,登录就可以访问
         *    authc:必须认证才可以访问
         *    user:使用rememberMe的功能可以直接访问
         *     perms:该资源必须得到访问权限才可以访问
         */
        Map<String,String> filterMap =new LinkedHashMap<>();
        filterMap.put("/js/**", "anon");
        filterMap.put("/css/**", "anon");
        filterMap.put("/img/**", "anon");
        filterMap.put("/plugins/**", "anon");
        filterMap.put("/bootstrap-fileinput/css","anon");
        filterMap.put("/bootstrap-fileinput/img","anon");
        filterMap.put("/bootstrap-fileinput/js","anon");
        filterMap.put("/bootstrap-fileinput/themes","anon");
        filterMap.put("/**","anon");


        filterMap.put("/loginController/toLog","anon");
        filterMap.put("/loginController/toRegister","anon");

        filterMap.put("/**","authc");
        //修改调整登录的地址
        shiroFilterFactoryBean.setLoginUrl("/**");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);
        return  shiroFilterFactoryBean;
    }

    /**
     * 创建DefaultWebSecurityManager
     * @return
     */
    @Bean
    public DefaultWebSecurityManager getDefaultWebSecurityManager(){
        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
        defaultWebSecurityManager.setRealm(getRealm());
        return defaultWebSecurityManager;
    }

    /**
     * 创建Realm
     * @return
     */
    @Bean
    public TestRealm getRealm(){
        TestRealm testRealm= new TestRealm();
        testRealm.setCredentialsMatcher(hashedCredentialsMatcher());
        return testRealm;
    }

    @Bean
    public HashedCredentialsMatcher hashedCredentialsMatcher(){
        HashedCredentialsMatcher credentialsMatcher = new HashedCredentialsMatcher();
        //指定加密方式
        credentialsMatcher.setHashAlgorithmName("MD5");
        System.out.println("加密方式:MD5");
        //加密次数
        credentialsMatcher.setHashIterations(1);
        //此处设置,true加密用的hex编码,false用的base64编码
        credentialsMatcher.setStoredCredentialsHexEncoded(true);
        return credentialsMatcher;
    }
}

