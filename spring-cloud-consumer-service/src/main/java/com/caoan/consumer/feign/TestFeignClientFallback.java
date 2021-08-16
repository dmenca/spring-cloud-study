package com.caoan.consumer.feign;

import org.springframework.stereotype.Component;

@Component
public class TestFeignClientFallback implements TestFeignClient {

    @Override
    public Long getById(Long id) {
        return -1L;
    }
}
