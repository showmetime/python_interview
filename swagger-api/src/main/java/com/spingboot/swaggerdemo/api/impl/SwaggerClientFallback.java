package com.spingboot.swaggerdemo.api.impl;

import com.spingboot.swaggerdemo.api.SwaggerClient;
import com.springboot.common.context.UserContext;
import com.springboot.common.vo.ResultData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Author: ASUS
 * @description: TODO
 * @Date: 0:54 2020/6/21
 */
@Slf4j
@Component
public class SwaggerClientFallback implements SwaggerClient {
    @Override
    public ResultData update(String phone, String nickName, UserContext context) {
        log.error("**********************调用v1/product/{phone}/{nickName}失败了哈");
        return null;
    }
}
