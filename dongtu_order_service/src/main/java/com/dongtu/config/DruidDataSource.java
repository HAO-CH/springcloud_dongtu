package com.dongtu.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


@Configuration
public class DruidDataSource {
    @Bean
    @ConfigurationProperties( prefix = "spring.datasource")
        public DataSource getDruid(){
         return new com.alibaba.druid.pool.DruidDataSource();
     }
}
