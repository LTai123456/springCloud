package com.example.demo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class UserBean {
    @ApiModelProperty("用户名称")
    private String userName;
    @ApiModelProperty("用户年龄")
    private Integer age;
}
