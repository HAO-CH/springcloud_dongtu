package com.dongtu.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
@Configuration
public class DetailPagesConfig {
    //模板位置
    @Value("${freemarker.templateLoderPath}")
    private String templateLoderPath;
    //编码方式
    @Value("${freemarker.defaultEncoding}")
    private String defaultEncoding;

    @Bean
    public FreeMarkerConfigurer getFreeMarkerConfigurer() {
        FreeMarkerConfigurer configurer = new FreeMarkerConfigurer();
        configurer.setTemplateLoaderPath(templateLoderPath);
        configurer.setDefaultEncoding(defaultEncoding);
        return configurer;
    }
}
