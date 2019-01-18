package com.springcloud.session14busclient1.session14bus.MyConfiguration;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
@Configuration
//@RefreshScope
//@Import(jdbcEntry.class)
public class MyConfiguration {

//    @Bean
//    //@RefreshScope
//    public DruidDataSource MyDataSource(){
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setUrl(url);
//        dataSource.setUsername(username);
//        dataSource.setPassword(password);
//        return dataSource;
//    }

    @Bean
    @RefreshScope
    public DruidDataSource MyDataSource(jdbcEntry jj){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(jj.getUrl());
        dataSource.setUsername(jj.getUsername());
        dataSource.setPassword(jj.getPassword());
        return dataSource;
    }

    @Bean
    //@RefreshScope
    public JdbcTemplate myJdbcTemplate(DruidDataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }
}
