package com.dongtu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
@MapperScan("com.dongtu.mapper")
public class EsServiceAPP {
    public static void main(String[] args) {
        System.setProperty("es.set.netty.runtime.available.processors", "false");
            SpringApplication.run(EsServiceAPP.class, args);
    }
}