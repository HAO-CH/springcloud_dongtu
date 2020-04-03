package com.dongtu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu
 * @ClassName: CollectServiceApp
 * @Description: java类作用描述
 * @Author: DengQing
 * @CreateDate: 2020/1/9 10:18
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/9 10:18
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@SpringBootApplication
@EnableSwagger2
@EnableEurekaClient
@MapperScan("com.dongtu.mapper")
public class CollectServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(CollectServiceApp.class, args);
    }
}
