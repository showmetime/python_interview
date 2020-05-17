package com.springboot.demo.swaggerdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author:ASUS
 * @createTime:2020/5/16 18:21
 * @describle:
 */
@MapperScan("com.springboot.demo.swaggerdemo.mapper")
@SpringBootApplication
public class SwaggerDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SwaggerDemoApplication.class);
    }
}
