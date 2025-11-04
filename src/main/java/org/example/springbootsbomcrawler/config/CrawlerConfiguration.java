package org.example.springbootsbomcrawler.config;

import java.util.List;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "crawler")
@Data
public class CrawlerConfiguration {

    private List<ConfigurationEntry> configurations;


}
