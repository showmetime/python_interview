package com.vue.service.impl;

import com.vue.dao.RolesDao;
import com.vue.pojo.Roles;
import com.vue.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RolesServiceimpl  implements RolesService {
    @Autowired
    private RolesDao rolesDao;
    @Override
    public List<Roles> findAll() {
        return rolesDao.findAll();
    }
}
