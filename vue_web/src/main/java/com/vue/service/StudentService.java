package com.vue.service;

import com.vue.pojo.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();

    void add(Student student);

    void update(Student student);

    void delete(int[] ids);
}
