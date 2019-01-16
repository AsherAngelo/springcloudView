package com.springcloud.session2config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 本章主要讲的是可以使用actuator用来修改配置文件的东西，这个是远程的配额
 */
@SpringBootApplication
public class Session2ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(Session2ConfigApplication.class, args);
    }

}

