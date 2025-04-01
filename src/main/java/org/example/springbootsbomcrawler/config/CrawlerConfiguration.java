package org.example.springbootsbomcrawler.config;

import java.util.List;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "crawler")
public class CrawlerConfiguration {

    private List<ConfigurationEntry> configuration;


}
