package com.amelinroman.spring.mvc_hibernate_sql_aop.dao;

import com.amelinroman.spring.mvc_hibernate_sql_aop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
}
