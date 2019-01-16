package com.springcloud.serverconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class Session3ConfigserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(Session3ConfigserverApplication.class, args);
    }

}

