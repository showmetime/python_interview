package com.springboot.demo.swaggerdemo.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @Author: ASUS
 * @description: TODO
 * @Date: 22:21 2020/6/10
 */
public class MobileConstraintValidator implements ConstraintValidator<Mobile, String> {
   public void initialize(Mobile constraint) {
      System.out.println("进入验证String的的方法里面了");
   }

   public boolean isValid(String obj, ConstraintValidatorContext context) {
      if (obj.equals("拜拜")){
         return true;
      }
      System.out.println("不是拜拜");
      return false;
   }
}
