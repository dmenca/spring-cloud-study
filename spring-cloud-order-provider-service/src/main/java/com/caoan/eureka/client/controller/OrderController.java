package com.caoan.eureka.client.controller;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Long getId(@PathVariable(value = "id")Long id){
        return id;
    }
}
