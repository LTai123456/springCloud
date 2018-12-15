package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
 
/**
 * Created by lizheng on 2017/7/21.
 */
@RestController()
@RequestMapping("/feign")
public class HelloCotroller {
 
    @Autowired
    HelloService helloService;
 
    @RequestMapping(value = "/")
    public String helloCustomer() {
       
        return helloService.hello();
    }
}
