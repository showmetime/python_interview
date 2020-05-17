package com.oppo.employee.respository;

import com.oppo.employee.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRespository extends JpaRepository<Student,Integer> {
}
