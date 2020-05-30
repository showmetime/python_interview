package com.springboot.demo.swaggerdemo.annotation;

import com.springboot.demo.swaggerdemo.context.UserContext;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: ASUS
 * @description: @Aspect 注解形式的AOP
 * @Date: 11:59 2020/5/30
 */

@Aspect
@Component
public class MyComponentAspect {

    @Pointcut("@annotation(Mycomponent)")
    public void annotationPointcut(){
    }

    @Before("annotationPointcut()") //注意他们这些方法只能是void
    public void beforePointcut(JoinPoint point){
        // 先得到签名 才能得到方法
        MethodSignature signature = (MethodSignature) point.getSignature();
        // 得到方法
        Method method = signature.getMethod();
        // 得到相关得注释
        Mycomponent annotation = method.getAnnotation(Mycomponent.class);
        // 我可以给他赋予初始值  也可以在相关注释得时候赋值
        String data = annotation.data();
        // 数组
        String[] params = annotation.params();
        // userContext
        Class<UserContext> userContextClass = annotation.userContext();
        // 默认值
        String value = annotation.value();
        System.out.println("before得准备：" + value);
    }

    @After("annotationPointcut()")
    public void afterPointcut(JoinPoint joinPoint){
        // 它好像可以直接进行 Mycomponent，即在参数那里
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();

        Method method = signature.getMethod();

        Mycomponent annotation = method.getAnnotation(Mycomponent.class);

        String value = annotation.value();

        // 注意 这种写法
        System.out.println("after得准备，value:" + value + " data " + annotation.data().toString() +
                Arrays.stream(annotation.params()).collect(Collectors.joining(",")));
    }
}
