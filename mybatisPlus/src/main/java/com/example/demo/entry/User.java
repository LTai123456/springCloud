package com.example.demo.entry;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("user")
public class User {

	private Integer id;
	private String  name;
	private String addr;
	private Integer age;
}
