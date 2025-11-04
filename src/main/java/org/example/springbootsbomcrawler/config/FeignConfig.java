package org.example.springbootsbomcrawler.config;

import org.springframework.cloud.openfeign.FeignClientBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    public FeignClientBuilder feignClientBuilder(ApplicationContext context) {
        return new FeignClientBuilder(context);
    }
}
