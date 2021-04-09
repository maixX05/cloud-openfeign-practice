package com.msr.better.feign.controller;

import com.msr.better.feign.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MaiShuRen
 * @site http://www.maishuren.top
 * @since 2021-07-03
 */
@RestController
public class HelloFeignController {

    @Autowired
    private HelloFeignService helloFeignService;

    @GetMapping(value = "/search/github")
    public String searchGithubRepoByStr(@RequestParam("searchStr") String searchStr) {
        return helloFeignService.searchRepo(searchStr);
    }
}
