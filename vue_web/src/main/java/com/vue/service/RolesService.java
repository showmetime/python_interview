package com.vue.service;

import com.vue.pojo.Roles;

import java.util.List;
import java.util.concurrent.locks.Lock;

public interface RolesService {

    List<Roles> findAll();
}
