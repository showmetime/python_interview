package com.oppo.employee.dao;

import com.oppo.employee.pojo.Salaries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SalariesDao extends JpaRepository<Salaries,Integer>,JpaSpecificationExecutor<Salaries> {
}
