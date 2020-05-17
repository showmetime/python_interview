package com.mybatis.service.impl;

import com.mybatis.mapper.RolesMapper;
import com.mybatis.pojo.Roles;
import com.mybatis.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RolesServiceImpl implements RolesService {
    @Autowired
    private RolesMapper rolesMapper;
    @Override
    public List<Roles> findAll() {
        return rolesMapper.selectList(null);
        // 这个选择空就是选择全部
    }
}
