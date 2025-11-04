package org.example.springbootsbomcrawler.api;


import lombok.RequiredArgsConstructor;
import org.example.springbootsbomcrawler.service.CrawlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class CrawlerController {

    @Autowired
    private final CrawlerService crawlerService;

    @GetMapping("/start-crawler")
    public ResponseEntity<Void> startCrawler() {
        crawlerService.startCrawler();
        return ResponseEntity.ok().build();
    }


}
