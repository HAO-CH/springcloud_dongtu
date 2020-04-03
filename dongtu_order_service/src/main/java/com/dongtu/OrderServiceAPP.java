package com.dongtu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: HAO
 * @Date: 2019-12-13 08:31
 * @Desc:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableSwagger2
@MapperScan("com.dongtu.mapper")
public class OrderServiceAPP {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceAPP.class, args);
    }
}
