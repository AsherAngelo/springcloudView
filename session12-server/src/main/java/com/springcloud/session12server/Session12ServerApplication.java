package com.springcloud.session12server;

import com.springcloud.session12server.outstream.UserMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(UserMessage.class)
@EnableEurekaClient
public class Session12ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Session12ServerApplication.class, args);
	}

}

