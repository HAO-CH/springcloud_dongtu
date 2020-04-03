package com.dongtu;

import com.github.tobato.fastdfs.FdfsClientConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.context.annotation.Import;
import org.springframework.jmx.support.RegistrationPolicy;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu
 * @ClassName: PubWebAPP
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2019/12/28 9:11
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/12/28 9:11
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@Import(FdfsClientConfig.class)
@EnableMBeanExport(registration = RegistrationPolicy.IGNORE_EXISTING)
public class PubWebAPP {
    public static void main(String[] args) {
        SpringApplication.run(PubWebAPP.class,args);
    }
}
