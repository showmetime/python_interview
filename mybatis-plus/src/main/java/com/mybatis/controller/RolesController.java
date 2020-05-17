package com.mybatis.controller;



import com.mybatis.pojo.Roles;
import com.mybatis.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("roles")
public class RolesController {
    @Autowired
    private RolesService rolesService;
    @GetMapping("findAll")
    public List<Roles> findAll(){
        return rolesService.findAll();
    }
}
