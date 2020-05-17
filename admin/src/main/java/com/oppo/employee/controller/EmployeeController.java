package com.oppo.employee.controller;


import com.oppo.employee.commom.PageResult;
import com.oppo.employee.pojo.Employees;
import com.oppo.employee.pojo.EmployeesInfo;
import com.oppo.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("getAllEmployees")
    public List<Employees> getAllEmployeesInfo(){
        return  employeeService.getAllEmployees();
    }

    @RequestMapping("getAllEmployees/{page}/{rows}")
    public PageResult getAllEmployees(int page, int rows){
        return  employeeService.getAllEmployees(page,rows);
    }

    @RequestMapping("getAllEmployeesInfo")
    public List<EmployeesInfo> getAllEmployeeInfo(){
        return employeeService.getAllEmployeesInfo();
    }
    @RequestMapping("getAllEmployeesInfoObject")
    public List<EmployeesInfo> getAllEmployeeInfoObject(){
        return employeeService.getAllEmployeesInfoObject();
    }
}
