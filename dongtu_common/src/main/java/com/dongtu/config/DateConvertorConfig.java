package com.dongtu.config;

import com.dongtu.convertor.DateConvertor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DateConvertorConfig {

    @Bean
    public DateConvertor getDateConvertor(){
        return new DateConvertor();
    }
}
