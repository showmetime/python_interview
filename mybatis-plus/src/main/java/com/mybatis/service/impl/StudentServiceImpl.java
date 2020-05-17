package com.mybatis.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mybatis.mapper.RolesMapper;
import com.mybatis.mapper.StudentMapper;
import com.mybatis.pojo.Student;
import com.mybatis.service.StudentService;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private RolesMapper rolesMapper;

    @Override
    public List<Student> findAll() {
        List<Student> students = studentMapper.selectList(null);
        for (Student student : students) {
            student.setRoles(rolesMapper.selectById(student.getRid()));
        }
        return  students;
        // 选择空 就是选择全部 和之前的example差不多
    }

    // 添加学生
    @Override
    public void add(Student student) {
         studentMapper.insert(student);

    }

    // 修改学生
    @Override
    public void update(Student student) {
        studentMapper.updateById(student);
        // 这个是根据学生id进行修改的 所以是一个学生
        // 还有个方法是根据wapper包装器来修改的 即 符合某些条件的学生
    }

    // 删除学生 在这里加一个事务处理好了
    @Transactional
    @Override
    public void delete(int[] ids) {
        // 这个应该好一点
        studentMapper.deleteBatchIds(Arrays.asList(ids));
    }

    // 根据条件查询
    @Override
    public List<Student> search(Student student) {
        // 这里写错了 直接全部new QueryWrapper就行了 算了 还有就是对每个字段进行判断一下看看是否为空
        // 等下 分页的时候就不这样写了
        Wrapper<Student> wrap = new QueryWrapper<>();
        if(StringUtils.isNotBlank(student.getStuname())){
            ((QueryWrapper<Student>) wrap).like("stuname",student.getStuname());
        }
        if(StringUtils.isNotBlank(student.getUusex())){
            ((QueryWrapper<Student>) wrap).eq("uusex",student.getUusex());
        }
        if(student.getRid() != 0){
            ((QueryWrapper<Student>) wrap).eq("rid",student.getRid());
            // 这里有个小问题就是没有的时候他是为0 所以现实中我们不能将rid赋予0值
        }

        List<Student> students = studentMapper.selectList(wrap);
        for (Student student1 : students) {
            student1.setRoles(rolesMapper.selectById(student1.getRid()));
        }
        return  students;
    }

    // 带分页条件的查询
    @Override
    public IPage<Student> searchPage(int page, int pageSize, Student student) {
        // 和上面一样
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();

        if(StringUtils.isNotBlank(student.getStuname())){
            queryWrapper.like("stuname",student.getStuname());
        }
        if(StringUtils.isNotBlank(student.getUusex())){
            queryWrapper.eq("uusex",student.getUusex());
        }
        if(student.getRid() != 0){
            queryWrapper.eq("rid",student.getRid());
            // 这里有个小问题就是没有的时候他是为0 所以现实中我们不能将rid赋予0值
        }
        Page<Student> studentPage = studentMapper.selectPage(new Page<>(page, pageSize), queryWrapper);
        for (Student student1 : studentPage.getRecords()) {
            // 还是为每个学生分配角色
            student1.setRoles(rolesMapper.selectById(student1.getRid()));
        }

        return studentPage;
    }
}
