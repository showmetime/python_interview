package com.oppo.employee.dao;

import com.oppo.employee.pojo.Titles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TitlesDao extends JpaRepository<Titles,Integer>,JpaSpecificationExecutor<Titles> {
}
