package com.vue.dao;


import com.vue.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

// 这个是data-jpa 所以使用jpa接口就行了
//JpaRepository<Student,Integer> student是参数，第二个是主键id的类型
public interface StudentDao extends JpaRepository<Student,Integer >,JpaSpecificationExecutor<Student> {
}
