package com.oppo.employee.controller;

import com.oppo.employee.pojo.Student;
import com.oppo.employee.serviceImpl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @RequestMapping("getAllStudent")
    public List<Student> getAllStudent(){
        return  studentService.getAllStudent();
    }

}
