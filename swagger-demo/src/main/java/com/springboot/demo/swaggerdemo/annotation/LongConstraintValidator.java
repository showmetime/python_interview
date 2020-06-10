package com.springboot.demo.swaggerdemo.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @Author: ASUS
 * @description: ConstraintValidator 接口有俩个范型 第一个是自定义的注解类，第二个就是要验证的数据的类型，
 * 例如写了String 类型的数据，那么这个注解 就需要在String类型的字段上才会起作用 ，所以最简单的写成Object 它可以接收任何类型的
 * 数据 TODO :!! 注意他默认被Spring 管理的bean 所以可以使用@Autowiredu @Resource注入别服务
 * @Date: 22:21 2020/6/10
 */

public class LongConstraintValidator implements ConstraintValidator<Mobile, Integer> {

    @Override
    public void initialize(Mobile constraintAnnotation) {
        System.out.println("验证长整型的初始化方法");
    }

    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        // 当这个注释@Mobile在某个值上面的时候，如果是Long型 他就是进行检查 这个值就是这个aLong
        System.out.println("到这个Long注解里面来了");
        if (integer > 100){
            return true;
        }
        System.out.println("没过，你的这个值小于100了");
        return false;
    }
}
