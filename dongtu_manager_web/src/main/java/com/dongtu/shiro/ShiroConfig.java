package com.dongtu.shiro;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {

    /**
     * 创建ShiroFilterFactoryBean对象
     * @return
     */
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(){
        //创建ShiroFilterFactoryBean对象
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(getSecurityManager());
        Map<String,String> filterMap = new LinkedHashMap<>();
        filterMap.put("/loginController/login","anon");
        filterMap.put("/css/**","anon");
        filterMap.put("/img/**","anon");
        filterMap.put("/js/**","anon");
        filterMap.put("/plugins/**","anon");
        filterMap.put("/**","anon");

        //filterMap.put("/**","authc");
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

        //自定义登录页面
        shiroFilterFactoryBean.setLoginUrl("/loginController/login");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);
        return shiroFilterFactoryBean;
    }

    /**
     *创建DefaultWebSecurityManager对象,用来管理用户主题的Subject
     */
    @Bean
    public DefaultWebSecurityManager getSecurityManager(){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        //关联自定义的realm
        securityManager.setRealm(getUserRealm());
        return securityManager;
    }

    @Bean
    public UserRealm getUserRealm(){
        return new UserRealm();
    }
}
