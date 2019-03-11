package com.alibaba.cola.command;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

//后置拦截器
@Inherited
@Command
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface PostInterceptor {

    Class<? extends com.alibaba.cola.dto.Command>[] commands() default {};

}
