package com.wsh.testCRUD.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HttpPutFormContentFilter;

@Configuration
public class ApplicationConfig {
    @Bean
    public HttpPutFormContentFilter httpPutFormFilter() {
        System.out.println("-------------------- HttpPutFormContentFilter init ---------------------");
        return new HttpPutFormContentFilter();
    }
}