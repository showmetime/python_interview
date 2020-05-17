package com.vue.controller;

import com.vue.pojo.Result;
import com.vue.pojo.Student;
import com.vue.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("findAll")
    public List<Student> findAll(){
        return studentService.findAll();
    }

    // 添加学生
    @PostMapping("add")
    public Result add(@RequestBody  Student student){
        try {
            studentService.add(student);
            return  new Result(true,"添加成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"添加失败！");
        }
    }
    // 修改学生
    @PostMapping("update")
    public Result update(@RequestBody Student student){
        try {
            studentService.update(student);
            return  new Result(true,"修改成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return  new Result(false,"修改失败！");
        }
    }
    // 删除学生 这个应该是事务 因为不是原子性的
    @GetMapping("delete")
    public Result delete(int[] ids){
        try {
            studentService.delete(ids);
            return  new Result(true,"删除成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return  new Result(false,"删除失败！");
        }
    }
}
