package com.vue.dao;

import com.vue.pojo.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RolesDao extends JpaRepository<Roles,Integer>,JpaSpecificationExecutor<Roles> {
}
