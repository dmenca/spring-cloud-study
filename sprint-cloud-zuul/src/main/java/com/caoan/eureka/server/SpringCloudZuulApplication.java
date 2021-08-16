package com.caoan.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author caoan
 * @create 2021/8/13 17:14
 **/
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class SpringCloudZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZuulApplication.class, args);
    }
}
