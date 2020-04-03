package com.dongtu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer //config服务端
public class ConfigServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServiceApp.class, args);
    }
}
