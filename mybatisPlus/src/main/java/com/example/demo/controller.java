package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
public class controller {

	@Autowired
	private service service;
	@GetMapping("/xx")
	public void xxx() {
		service.ss();
	}
}
