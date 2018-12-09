package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {
 
    @Value("${name}")
    private String common_service_config;
 
    @RequestMapping("/service")
    public String from() {
        return this.common_service_config ;
    }
}
