package com.springcloud.session14busclient1.session14bus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 *
 * @RefreshScope
 * 如何实现动态加载数据源
 * 只需要@RefreshScope
 * dataSource即可
 * Controller和server、dao可以不需要进行@RefreshScope的，所以就成为这样了
 */

@SpringBootApplication
@EnableEurekaClient
public class Session14BusApplication {

    public static void main(String[] args) {
        SpringApplication.run(Session14BusApplication.class, args);
    }

}

