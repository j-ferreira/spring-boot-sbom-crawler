package org.example.springbootsbomcrawler.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.springbootsbomcrawler.config.CrawlerConfiguration;
import org.example.springbootsbomcrawler.feign.GenericFeignClient;
import org.example.springbootsbomcrawler.model.SbomIndexList;
import org.springframework.cloud.openfeign.FeignClientBuilder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class CrawlerService {

    final CrawlerConfiguration crawlerConfiguration;


    final FeignClientBuilder feignClientBuilder;

    public void startCrawler() {

        System.out.println("Crawler started");

        crawlerConfiguration.getConfigurations().forEach(crawler -> {
            log.info("Starting crawler: {}", crawler.getEndpoint());
            // Here you would add the logic to start the actual crawling process
            // For demonstration, we just log the crawler details
            log.info("Crawler details: {}", crawler);

            GenericFeignClient indexClient = feignClientBuilder
                .forType(GenericFeignClient.class, "dynamicClient")
                .url(crawler.getEndpoint())
                .build();
            SbomIndexList response = indexClient.getSbomIndexList();
            log.info("Response von {}: {}", crawler.getEndpoint(), response);

            response.getIds().forEach(id -> {
                GenericFeignClient sbomContentClient = feignClientBuilder
                    .forType(GenericFeignClient.class, "dynamicClient")
                    .url(crawler.getEndpoint() + "/" + id)
                    .build();

                String fromEndpoint = sbomContentClient.getFromEndpoint();

                log.info("Response von {}: {}", crawler.getEndpoint() + "/" + id, fromEndpoint);

            });


        });
    }

}
