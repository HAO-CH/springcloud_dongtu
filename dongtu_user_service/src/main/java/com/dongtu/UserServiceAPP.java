package com.dongtu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu
 * @ClassName: UserServiceAPP
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2019/12/30 11:14
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/12/30 11:14
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
@MapperScan("com.dongtu.mapper")
@EnableScheduling  //启动任务调度
public class UserServiceAPP {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceAPP.class,args);
    }
}
