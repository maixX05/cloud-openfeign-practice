package com.msr.better.feign.config;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @since 2021-07-03
 */
@Configuration
public class CoreAutoConfiguration {

    @Bean
    public HttpComponentsClientHttpRequestFactory httpComponentsClientHttpRequestFactory() {
        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
        factory.setHttpClient(httpClient());
        factory.setReadTimeout(3000);
        factory.setConnectTimeout(3000);
        factory.setConnectionRequestTimeout(3000);
        return factory;
    }

    @Bean
    public HttpClient httpClient() {
        // 可根据需求配置HttpClient
        return HttpClientBuilder.create()
                .build();
    }

    /**
     * {@link RestTemplate }的setRequestFactory方法支持HttpClient和Okhttp等Client
     * 默认是使用{@link SimpleClientHttpRequestFactory } Http的请求是使用原生的URLConnection
     *
     * @return RestTemplate的bean
     */
    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setRequestFactory(httpComponentsClientHttpRequestFactory());
        return restTemplate;
    }
}
