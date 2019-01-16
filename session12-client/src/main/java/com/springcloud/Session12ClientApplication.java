package com.springcloud;

import com.springcloud.instream.UserMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableEurekaClient
@EnableBinding(UserMessage.class)
public class Session12ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Session12ClientApplication.class, args);
    }

}

