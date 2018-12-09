package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/test")
public class TestRibbonApi {
    /**
     * 注入RestTemplate
     */
    @Autowired
    RestTemplate restTemplate;


    @RequestMapping(value = "/name" ,method = RequestMethod.GET)
    public String testGetNameOfBlog(){
        String url="http://SERVICE-HI/hello/hello";
        return restTemplate.getForObject(url,String.class);
    }
}
