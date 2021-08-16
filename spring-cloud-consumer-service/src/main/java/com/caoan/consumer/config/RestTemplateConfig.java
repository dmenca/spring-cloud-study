package com.caoan.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
    /**
     * RestTemplate 是由 Spring 提供的一个 HTTP 请求工具
     * LoadBalanced 修饰的RestTemplate才支持服务名调用
     * 不加LoadBalanced的RestTemplate要使用ip加端口才能访问 配合DiscoveryClient
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }
}
