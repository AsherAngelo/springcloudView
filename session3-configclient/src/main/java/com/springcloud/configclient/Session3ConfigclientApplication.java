package com.springcloud.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.refresh.ContextRefresher;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Set;

@SpringBootApplication
@EnableScheduling
@EnableEurekaClient
public class Session3ConfigclientApplication {

    private final ContextRefresher contextRefresher;

    @Autowired
    public Session3ConfigclientApplication(ContextRefresher contextRefresher) {
        this.contextRefresher = contextRefresher;
    }

    public static void main(String[] args) {
        SpringApplication.run(Session3ConfigclientApplication.class, args);
    }

    @Scheduled(fixedRate = 1000L)
    public void update(){
        Set<String> set = contextRefresher.refresh();
        if(!set.isEmpty()){
            System.out.println("现在打印set集合的值：" + set);
        }
    }

}

