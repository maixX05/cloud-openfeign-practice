package top.maishuren.upload.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author maisrcn@qq.com
 * @site <a href="https://www.maishuren.top">blog</a>
 * @since 2024-03-01
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class UploadClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(UploadClientApplication.class, args);
    }
}
