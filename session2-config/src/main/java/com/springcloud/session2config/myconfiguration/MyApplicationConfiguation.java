package com.springcloud.session2config.myconfiguration;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;

import java.util.HashMap;
import java.util.Map;

public class MyApplicationConfiguation implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        ConfigurableEnvironment configurableEnvironment = applicationContext.getEnvironment();
        MutablePropertySources mutablePropertySources = configurableEnvironment.getPropertySources();
        mutablePropertySources.addFirst(createMapPropertySource());
    }

    public MapPropertySource createMapPropertySource(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("spring.application.name","zhaomengjie");
        return new MapPropertySource("zhao-meng-jie", map);
    }
}
