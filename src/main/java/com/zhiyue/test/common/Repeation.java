package com.zhiyue.test.common;

import java.lang.annotation.*;

/**
 * @author Jiangfeng
 * @Description java8重复注解
 * @createTime 2021年03月01日 14:39:00
 */
@Target(ElementType.METHOD) // 用于描述注解的使用范围: 类
@Retention(RetentionPolicy.RUNTIME) // 注解的生命周期: 运行时
@Documented // 可被文档化标识
// @Inherited // 当@InheritedAnno注解加在某个类A上时，假如类B继承了A，则B也会带上该注解。
@Repeatable(Repeations.class)
public @interface Repeation {

    String value();

    int type() default 1;
}
