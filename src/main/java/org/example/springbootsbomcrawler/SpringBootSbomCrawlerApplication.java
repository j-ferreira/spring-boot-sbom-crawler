package org.example.springbootsbomcrawler;

import org.example.springbootsbomcrawler.config.CrawlerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableConfigurationProperties(CrawlerConfiguration.class)
@EnableFeignClients(basePackages = "org.example.springbootsbomcrawler")
public class SpringBootSbomCrawlerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSbomCrawlerApplication.class, args);
    }

}
