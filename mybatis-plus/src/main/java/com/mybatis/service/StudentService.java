package com.mybatis.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.mybatis.pojo.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();

    void add(Student student);

    void update(Student student);

    void delete(int[] ids);

    List<Student> search(Student student);

    // 带分页条件的查询
    IPage<Student> searchPage(int page, int pageSize, Student student);
}
