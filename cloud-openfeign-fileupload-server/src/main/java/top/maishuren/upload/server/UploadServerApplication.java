package top.maishuren.upload.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author maisrcn@qq.com
 * @site <a href="https://www.maishuren.top">blog</a>
 * @since 2024-03-01
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UploadServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(UploadServerApplication.class, args);
    }
}
