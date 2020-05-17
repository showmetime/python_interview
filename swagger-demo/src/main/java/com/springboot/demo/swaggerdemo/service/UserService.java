package com.springboot.demo.swaggerdemo.service;

import com.springboot.demo.swaggerdemo.context.UserContext;

/**
 * @author:ASUS
 * @createTime:2020/5/17 0:03
 * @describle:
 */
public interface UserService {
    // 通过UserContext更改学生
    int updateUser(UserContext userContext);
}
