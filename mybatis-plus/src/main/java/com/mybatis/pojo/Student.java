package com.mybatis.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.Transient;
// 这些都是jpa的注解

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tblstudent")
public class Student {
    @TableId(type = IdType.AUTO)
    private int stuid;
    private String stuname;
    private int stuage;
    private String uusex;
    private int rid;
    @TableField(exist = false)  // 这个列可以没有
    private Roles roles;

}
