package com.oppo.employee.dao;

import com.oppo.employee.pojo.Departments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DepartmentsDao extends JpaRepository<Departments,Integer>,JpaSpecificationExecutor<Departments> {
}
