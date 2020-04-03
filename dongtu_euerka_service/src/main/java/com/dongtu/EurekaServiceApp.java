package com.dongtu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//表示一个eureka服务
@EnableEurekaServer
public class EurekaServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceApp.class,args);
    }
}
