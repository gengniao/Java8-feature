package com.zhiyue.test.common;

import java.lang.annotation.*;

/**
 * @author Jiangfeng
 * @Description @Repeation 的注解组
 * @createTime 2021年03月01日 16:18:00
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.METHOD)
public @interface Repeations {

    Repeation[] value();
}
