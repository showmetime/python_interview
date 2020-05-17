package com.vue.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tblstudent") // 可以这样指向数据库中的表面 如果不一致的话
public class Student {
    @Id // 这里是 数据库设置了自增 你也要设置 即 和他保持一致  否则会报错
    private int stuid;
    private String stuname;
    private int stuage;
    private String uusex;
    private int rid;
    @Transient
    private Roles roles;
    // 麻辣隔壁是fn + alt + insert才行

    public Student(String stuname, int stuage, String uusex, int rid) {
        this.stuname = stuname;
        this.stuage = stuage;
        this.uusex = uusex;
        this.rid = rid;
    }


    // 注意 他妈的 这里 如果第二个stuId大写的话 它会自动转化为stu_id 导致和数据库的字段不一致 所以 直接全部小写就行了

    //uld not determine type for: com.vue.pojo.Roles, at table: tblstudent,
    // for columns: [org.hibernate.mapping.Column(roles)] 必须要加上@Transient
    //@transient 就是在给某个javabean上需要添加个属性，但是这个属性你又不希望给存到数据库中去，
    // 仅仅是做个临时变量，用一下。不修改已经存在数据库的数据的数据结构。
}
