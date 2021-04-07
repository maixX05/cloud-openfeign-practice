package com.msr.better.feign.service;

import com.msr.better.feign.config.HelloFeignServiceConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author MaiShuRen
 * @site http://www.maishuren.top
 * @since 2021-07-03
 */
@FeignClient(name = "github-client", url = "https://api.github.com", configuration = HelloFeignServiceConfig.class)
public interface HelloFeignService {

    /**
     * content:
     * {
     *  "message":"Validation Failed",
     *  "errors":[{"resource":"Search","field":"q","code":"missing"}],
     *  "documentation_url":"https://developer.github.com/v3/search"
     *  }
     *
     * @param queryStr
     * @return
     */
    @GetMapping(value = "/search/repositories")
    String searchRepo(@RequestParam("q") String queryStr);

}


