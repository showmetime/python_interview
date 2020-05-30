package com.springboot.demo.swaggerdemo.annotation;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComponentAnnotationTest {
    public static void main(String[] args) {
        // 这个也留着吧 现在开始主要是进行注解形式的用法
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ComponentAnnotationTest.class);
        context.refresh();
        InjectClass bean = context.getBean(InjectClass.class);
        bean.print();
    }

    @Mycomponent
    public static class InjectClass{
        public void print() {
            System.out.println("hello word!");
        }
    }
}
