package com.oppo.employee.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class EmployeesInfo implements Serializable {
    private String firstName;
    private String lastName;
    private String title;//职位
    private int salary;
    //只算最大from_date的薪水
    private Date fromDate;
    private Date birthDate;
    private String deptName;
//    private enum gender{
//        M,F
//    }


    public EmployeesInfo() {
    }

    public EmployeesInfo(String firstName, String lastName, String title, int salary, Date fromDate, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.salary = salary;
        this.fromDate = fromDate;
        this.birthDate = birthDate;
    }

    public EmployeesInfo(String firstName, String lastName, String title, String deptName, int salary, Date fromDate, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.deptName = deptName;
        this.salary = salary;
        this.fromDate = fromDate;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public int getSalary() {
        return salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSalary(int salary) {
        this.salary = salary;

    }

}
