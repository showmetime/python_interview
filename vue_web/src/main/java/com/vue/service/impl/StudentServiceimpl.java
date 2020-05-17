package com.vue.service.impl;

import com.vue.dao.RolesDao;
import com.vue.dao.StudentDao;
import com.vue.pojo.Student;
import com.vue.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class StudentServiceimpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Autowired
    private RolesDao rolesDao;
    @Override
    public List<Student> findAll() {
        List<Student> studentList = studentDao.findAll();
        // 也还是在这个设置 根据student的rid查找出roles
        for (Student student : studentList) {
            student.setRoles(rolesDao.findById(student.getRid()).get());
        }
        return studentList;
    }

    @Override
    public void add(Student student) {
        studentDao.save(student);
    }
    /**添加和修改在这里都是save 它会自动识别*/
    @Override
    public void update(Student student) {
        // 卧槽 是不能用这个flush吗
        studentDao.save(student);
    }

    // 删除学生
    @Transactional
    @Override
    public void delete(int[] ids) {
        for (int id : ids) {
            studentDao.deleteById(id);
        }
    }
}
