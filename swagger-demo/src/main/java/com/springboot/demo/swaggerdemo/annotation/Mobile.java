package com.springboot.demo.swaggerdemo.annotation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.FIELD})
@Documented
@Inherited
@Constraint(validatedBy = {MobileConstraintValidator.class,LongConstraintValidator.class})
public @interface Mobile {

    String messages()  default "电话格式不正确， 请好好看看";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
