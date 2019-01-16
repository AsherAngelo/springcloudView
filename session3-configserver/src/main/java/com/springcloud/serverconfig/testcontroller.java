package com.springcloud.serverconfig;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class testcontroller {

    @RequestMapping("/hello")
    public String str(){
        return new Date().toString();
    }

}
