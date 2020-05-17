package com.oppo.employee.dao;


import com.oppo.employee.pojo.Employees;
import com.oppo.employee.pojo.EmployeesInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface EmployeesRepository extends JpaRepository<Employees,Integer>,JpaSpecificationExecutor<Employees> {
    /**
     * 这里这个枚举写在sql里面了，其实可以用这个枚举类 ，然后数据库添加注释 @Enumerated(EnumType.STRING)
     *
     * */
    @Query(nativeQuery = true,value = "select emp_no,birth_date,first_name," +
            "last_name,hire_date,case gender when 'M' then '男' when 'F' then '女' end gender  from employees limit 500")
    public List<Employees> getNumberEmployee();

    /**
     * 这个是根据实体类的对象查找的 现在要来一个manager查找好了
     * */
    @Query(value = "SELECT new com.oppo.employee.pojo.EmployeesInfo(e.firstName ,e.lastName ," +
            "t.title,s.salary,s.fromDate," +
            "e.birthDate ) FROM Employees e INNER JOIN  " +
            " Titles t ON e.empNo = t.empNo INNER JOIN Salaries s ON  s.empNo = e.empNo" +
            " INNER JOIN DeptEmp dp ON dp.empNo = e.empNo " +
            " GROUP BY t.empNo,s.empNo,dp.empNo")
    public List<EmployeesInfo> getAllEmployeesInfo();

    //再写一个使用Object接受试一下
    @Query(nativeQuery = true,value = "SELECT e.first_name ,e.last_name ," +
            "t.title,s.salary,s.from_date," +
            "e.birth_date,dep.dept_name  FROM employees e INNER JOIN  " +
            " titles t ON e.emp_no = t.emp_no INNER JOIN salaries s ON  s.emp_no = e.emp_no" +
            " INNER JOIN dept_emp dp ON dp.emp_no = e.emp_no " +
            "inner join departments dep on dep.dept_no = dp.dept_no" +
            " GROUP BY t.emp_no,s.emp_no,dp.emp_no " +
            " limit 0,30")
    public List<Object[]> getAllEmployeesInfoObject();

    //不用也行

    Page<Employees> findAllByFirstNameLike(String string, Pageable pageable);
}
