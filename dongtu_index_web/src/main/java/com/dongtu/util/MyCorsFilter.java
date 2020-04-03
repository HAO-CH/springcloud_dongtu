package com.dongtu.util;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.util
 * @ClassName: MyCorsFilter
 * @Description: java类作用描述
 * @Author: DengQing
 * @CreateDate: 2020/1/9 10:35
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/9 10:35
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Component
//MyCorsFilter 此类名不能以CorsFilter当类名,会有重名冲突
public class MyCorsFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpServletRequest reqs = (HttpServletRequest) servletRequest; //http://www.yitao.com 此路径是要跳转到freemarker页面的路径
        response.setHeader("Access-Control-Allow-Origin", "http://localhost");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
        filterChain.doFilter(reqs, response);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void destroy() {
    }
}
