package com.springboot.demo.swaggerdemo.serviceImpl;


import com.springboot.common.context.UserContext;
import com.springboot.demo.swaggerdemo.mapper.TbUserMapper;
import com.springboot.demo.swaggerdemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author:ASUS
 * @createTime:2020/5/17 0:03
 * @describle:
 */
@Service
@RequiredArgsConstructor(onConstructor = @__({@Autowired}))
public class UserServiceImpl implements UserService {

    private final TbUserMapper userMapper;

    @Override
    public int updateUser(UserContext userContext) {
        return userMapper.updateUser(userContext);
    }
}
