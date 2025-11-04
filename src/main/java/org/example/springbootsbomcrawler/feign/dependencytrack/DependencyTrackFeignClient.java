package org.example.springbootsbomcrawler.feign.dependencytrack;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "dependency-track", url = "http://localhost:8081")
public interface DependencyTrackFeignClient {

    @PutMapping(value = "/api/v1/bom", consumes = "application/json")
    String putBom(@RequestBody BomSubmitRequest request, @RequestHeader("Authorization") String bearerToken);


    @PostMapping(value = "/api/v1/finding/project/{uuid}/analyze", consumes = "application/json")
    String startAnalyse(@PathVariable String uuid, @RequestHeader("Authorization") String bearerToken);


}
