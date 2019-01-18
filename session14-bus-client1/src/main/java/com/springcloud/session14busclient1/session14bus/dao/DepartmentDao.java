package com.springcloud.session14busclient1.session14bus.dao;

import com.springcloud.session14busclient1.session14bus.entry.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//@RefreshScope
@Repository
public class DepartmentDao implements IDepartmentDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Department getDeptById(Integer id){
        String sql = "select * from department dd where dd.id = ?";
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Department>(Department.class),id);
    }

}
