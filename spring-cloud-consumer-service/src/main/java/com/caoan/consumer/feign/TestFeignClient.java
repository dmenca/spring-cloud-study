package com.caoan.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="spring-cloud-client-provider",fallback = TestFeignClientFallback.class)
public interface TestFeignClient {
    @GetMapping(value = "/order/{id}")
    public Long getById(@PathVariable("id")Long id);
}
