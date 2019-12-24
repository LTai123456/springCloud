package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entry.User;
import com.example.demo.mapper.UserMapper;

@Service
public class service {

	@Autowired
	private UserMapper userMapper;
	public void ss() {
		System.out.println(("----- selectAll method test ------"));
		List<User> userList = userMapper.selectList(null);
		userList.forEach(System.out::println);
	}
}
