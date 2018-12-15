package com.example.demo.service.impl;

import org.springframework.stereotype.Component;

import com.example.demo.service.HelloService;
@Component
public class HelloHystrix implements HelloService{

	@Override
	public String hello() {
		// TODO Auto-generated method stub
		return "error,this return hystrix error!!";
	}

}
