package com.springcloud.session4consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Session4ConsulApplication {

	public static void main(String[] args) {
		SpringApplication.run(Session4ConsulApplication.class, args);
	}

}

