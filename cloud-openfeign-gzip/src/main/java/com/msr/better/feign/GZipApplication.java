package com.msr.better.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author MaiShuRen
 * @site http://www.maishuren.top
 * @since 2021-07-03
 */
@SpringBootApplication
@EnableFeignClients
public class GZipApplication {

    public static void main(String[] args) {
        SpringApplication.run(GZipApplication.class, args);
    }
}
