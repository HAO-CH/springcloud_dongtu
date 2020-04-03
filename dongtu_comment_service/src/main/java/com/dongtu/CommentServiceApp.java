package com.dongtu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu
 * @ClassName: CommentServiceApp
 * @Description: java类作用描述
 * @Author: DengQing
 * @CreateDate: 2020/1/7 11:55
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/7 11:55
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
public class CommentServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(CommentServiceApp.class);
    }
}
