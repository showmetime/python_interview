package com.springboot.demo.swaggerdemo.annotation;

import com.springboot.demo.swaggerdemo.context.UserContext;
import com.sun.org.apache.xml.internal.dtm.ref.ExtendedType;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;
import java.util.List;

@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)

public @interface Mycomponent {
    String value() default "默认值"; // 允许注解用参数
    String data()  default "这个自定义的数据"; // 属性必须是一个常数
    Class<UserContext> userContext()  default UserContext.class;// 类
    String[] params() default {"我猜", "我猜猜猜"};
    /**
     * @Description: 注解合法的类型有哪些
     * @Author: ASUS
     * @Date: 2020/5/30 11:47
     * 1、A primitive type ===== java的八种基本类型：byte、short、int、long、float、double、char、boolean
     * 2、String ===== 字符串
     * 3、Class ===== 类型
     * 4、An enum type ===== 枚举
     * 5、An annotation type ===== 注解
     * 6、An array type ===== 以上类型的数组形式 (!!注意java是[]，不是List<>!!)
     */
}
