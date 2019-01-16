package com.springcloud.session4consulclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
public class helloController{

    private final DiscoveryClient discoveryClient;

    @Autowired
    public helloController(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    @RequestMapping("/hello")
    public void str(){
        ServiceInstance serviceInstance = discoveryClient.getInstances("spring-cloud-consul").get(0);
        return serviceInstance.getUri().toString();
    }


    /**
     * 获取当前应用信息
     *
     * @return
     */
    @GetMapping("/current/service-instance")
    public ServiceInstance getCurrentServiceInstance(String str) {
        return discoveryClient.getInstances(str).get(0);
        //return discoveryClient.getLocalServiceInstance();
    }


    /**
     * 获取所有的服务名
     *
     * @return
     */
    @GetMapping("/list/services")
    public List<String> listServices() {
        return discoveryClient.getServices();
    }

    /**
     * 获取所有的服务实例信息
     *
     * @return
     */
    @GetMapping("/list/service-instances")
    public List<ServiceInstance> listServiceInstances() {
        List<String> services = listServices();
        List<ServiceInstance> serviceInstances = new LinkedList<>();

        services.forEach(serviceName -> {
            serviceInstances.addAll(discoveryClient.getInstances(serviceName));
        });

        return serviceInstances;
    }

}
