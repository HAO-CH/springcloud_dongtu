package com.dongtu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu
 * @ClassName: PudServiceApp
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2019/12/27 19:35
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/12/27 19:35
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
@MapperScan("com.dongtu.mapper")
public class PudServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(PudServiceApp.class,args);
    }
}
