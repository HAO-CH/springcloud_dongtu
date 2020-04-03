package com.dongtu;

import com.github.tobato.fastdfs.FdfsClientConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;

/**
 * @Author: HAO
 * @Date: 2019-12-13 08:31
 * @Desc:
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaClient
@EnableFeignClients
@Import(FdfsClientConfig.class)
public class TravelWebAPP {

    public static void main(String[] args) {
        SpringApplication.run(TravelWebAPP.class, args);
    }
}
