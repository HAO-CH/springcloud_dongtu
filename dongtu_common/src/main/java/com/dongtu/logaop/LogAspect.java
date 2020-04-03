package com.dongtu.logaop;

import com.alibaba.fastjson.JSONObject;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Author: HAO
 * @Date: 2019-12-27 20:02
 * @Desc: 使用springaop 打印日志
 */
@Aspect
@Component
public class LogAspect {

    Logger logger = LoggerFactory.getLogger(LogAspect.class);

    //切点表达式方法
    @Pointcut("execution(public * com.dongtu.service.*.*(..))")
    public void aopLog(){

    }

    //定义前置通知
    @Before("aopLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable{
        //获取参数
        Object[] args = joinPoint.getArgs();
        Signature signature = joinPoint.getSignature();
        logger.info("正在执行方法: {} ,参数为：{}", signature, args);
    }

    //returning 表示返回的结果
    @AfterReturning(pointcut = "aopLog()", returning = "ret")
    public void doAfterReturn(Object ret) throws Throwable{
        //处理请求成功后，打印返回结果
        logger.info("方法执行成功，返回结果为: {}", JSONObject.toJSONString(ret));
    }
}
