package com.zhiyue.test.java8feature.controller;

import com.zhiyue.test.common.Repeation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jiangfeng
 * @Description Java8可重复注解控制器
 * @createTime 2021年03月03日 16:14:00
 */
@RestController
public class Java8FeatureController {

    @Repeation("1")
    @Repeation("2")
    @Repeation("3")
    @Repeation("4")
    @Repeation("5")
    @RequestMapping("/test")
    public String index() {
        return "Greetings from java8!";
    }
}
