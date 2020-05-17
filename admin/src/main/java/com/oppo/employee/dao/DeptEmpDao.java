package com.oppo.employee.dao;

import com.oppo.employee.pojo.DeptEmp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DeptEmpDao  extends JpaRepository<DeptEmp,Integer>,JpaSpecificationExecutor<DeptEmp> {
}
