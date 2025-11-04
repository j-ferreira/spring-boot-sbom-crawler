package org.example.springbootsbomcrawler.feign;


import org.example.springbootsbomcrawler.model.SbomIndexList;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "genericClient", url = "")
public interface GenericFeignClient {

    @GetMapping
    String getFromEndpoint();


    @GetMapping
    SbomIndexList getSbomIndexList();
}