package com.dongtu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
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
public class PointsServiceAPP {

    public static void main(String[] args) {
        SpringApplication.run(PointsServiceAPP.class, args);
    }
}
