package com.springcloud.serverconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 *
 * POST这个是1.5x版本之前的刷新方式
 * 集体刷新  http://localhost:8080/bus/refresh?destination=session14-bus-client:**
 * 单体刷新  http://localhost:8080/bus/refresh?destination=session14-bus-client:8082
 * POST  springboot2.0以后的刷新方式
 * 集体刷新  http://localhost:8080/actuator/bus-refresh/session14-bus-client:**
 * 单体刷新  http://localhost:8080/actuator/bus-refresh/session14-bus-client:8093
 *
 */

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class Session3ConfigserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(Session3ConfigserverApplication.class, args);
    }

}

