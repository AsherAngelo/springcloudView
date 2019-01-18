package com.springcloud.session14busclient2.session14bus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Session14BusApplication {

    public static void main(String[] args) {
        SpringApplication.run(Session14BusApplication.class, args);
    }

}

