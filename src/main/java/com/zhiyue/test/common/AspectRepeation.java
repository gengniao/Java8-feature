package com.zhiyue.test.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * @author Jiangfeng
 * @Description 可重复注解 @Repeation的实现
 * @createTime 2021年03月02日 15:23:00
 */
@Component
@Aspect
public class AspectRepeation {

    @Pointcut("@annotation(Repeations)")
    public void ddd(){}

    @Before("ddd()")
    public void dd(JoinPoint joinPoint) {
       MethodSignature signature = (MethodSignature) joinPoint.getSignature();
       Repeations repeations= signature.getMethod().getAnnotation(Repeations.class);
        System.out.println("annotation:" + repeations);
        Repeation[] value = repeations.value();
        for (Repeation repeation: value) {
            System.out.println(repeation.value());
            System.out.println(repeation.type());
        }
    }
}
