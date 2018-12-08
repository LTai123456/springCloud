package com.example.demo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
@Data
@Slf4j
@ApiModel(value = "响应数据",description = "响应信息")
public class Response<T> {
    @ApiModelProperty("响应码")
    @Getter
    @Setter
    private Integer code;
    @ApiModelProperty("响应信息")
    @Getter
    @Setter
    private String msg;
    @ApiModelProperty("响应数据")
    @Getter
    @Setter
    private  T data;
}
