package com.oppo.employee.service;

import com.oppo.employee.commom.PageResult;
import com.oppo.employee.pojo.Employees;
import com.oppo.employee.pojo.EmployeesInfo;

import java.util.List;

public interface EmployeeService {
    //获得所有的员工
    List<EmployeesInfo> getAllEmployeesInfo();

    List<Employees> getAllEmployees();

    List<EmployeesInfo> getAllEmployeesInfoObject();

    PageResult getAllEmployees(int page, int rows);
}
