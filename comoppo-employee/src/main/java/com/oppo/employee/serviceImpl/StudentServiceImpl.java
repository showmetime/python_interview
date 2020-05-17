package com.oppo.employee.serviceImpl;

import com.oppo.employee.pojo.Student;
import com.oppo.employee.respository.StudentRespository;
import com.oppo.employee.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRespository studentRespository;
    @Override
    public List<Student> getAllStudent() {
        return studentRespository.findAll();
    }
}
