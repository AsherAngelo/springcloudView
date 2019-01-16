package com.springcloud.session2config.myconfiguration;

import org.springframework.cloud.bootstrap.config.PropertySourceLocator;
import org.springframework.core.env.*;

import java.util.HashMap;
import java.util.Map;

public class MyPropertiesConfiguration implements PropertySourceLocator {
    @Override
    public PropertySource<?> locate(Environment environment) {
        if(environment instanceof ConfigurableEnvironment){
            ConfigurableEnvironment cc = (ConfigurableEnvironment)environment;
            MutablePropertySources mm = cc.getPropertySources();
            mm.addFirst(myPropertySource());
        }
        return null;
    }

    public PropertySource myPropertySource(){
        Map<String,Object> map = new HashMap<>();
        map.put("spring.application.name","zhaomengjiePropertySourceLocator");
        PropertySource pp = new MapPropertySource("PropertySourceLocator-zmj",map);
        return pp;
    }
}
