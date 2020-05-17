package com.springboot.demo.swaggerdemo.vo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author:ASUS
 * @createTime:2020/5/16 16:46
 * @describle:
 */

@AllArgsConstructor
@Getter
@ApiModel(value = "返回的结果状态")
public enum ResultData {
    @ApiModelProperty(value = "返回结果失败")
    RESULT_ERROR(4000,"结果失败"),
    @ApiModelProperty(value = "返回结果成功")
    RESULT_SUCCESS(2000,"结果成功");
    private int code;
    private String msg;
}
