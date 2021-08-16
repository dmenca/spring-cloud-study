package com.caoan.consumer.controller;

import com.caoan.consumer.feign.TestFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer/order")
public class TestCallController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private TestFeignClient testFeignClient;

//    @RequestMapping(value = "/call",method = RequestMethod.GET)
//    public String testCall(){
//        String value = restTemplate.getForObject("http://spring-cloud-client-provider/test/hello", String.class);
//        return value;
////  通过discoveryClient获取到对应服务的ip和port restTemplate通过ip和port调用
////        List<ServiceInstance> list = discoveryClient.getInstances("provider");
////        ServiceInstance instance = list.get(0);
////        String host = instance.getHost();
////        int port = instance.getPort();
////        String url = "http://" + host + ":" + port + "/test/hello";
////        String value = restTemplate.getForObject(url, String.class);
////        return value;
//    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Long testCallFeign(@PathVariable("id")Long id){
       return testFeignClient.getById(id);
    }
}
