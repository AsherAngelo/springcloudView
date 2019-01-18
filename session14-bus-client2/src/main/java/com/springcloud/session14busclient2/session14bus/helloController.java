package com.springcloud.session14busclient2.session14bus;

import com.springcloud.session14busclient2.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix = "sf.user")
public class helloController {

    @Autowired
    private DepartmentMapper departmentMapper;

    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @RequestMapping("/hello")
    public String hello(){
        return toString();
    }
    @RequestMapping("/department")
    public String department(){
        return departmentMapper.getDeptById(1).toString();
    }
}
