package com.alibaba.cola.command;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;


//前置拦截器
@Inherited
@Component
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface PreInterceptor {

    Class<? extends com.alibaba.cola.dto.Command>[] commands() default {};

}
