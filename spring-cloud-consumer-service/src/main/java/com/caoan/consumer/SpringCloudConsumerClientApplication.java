package com.caoan.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @author caoan
 * @create 2021/8/13 17:14
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudConsumerClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumerClientApplication.class, args);
    }
}
