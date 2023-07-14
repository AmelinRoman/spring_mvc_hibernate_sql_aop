package com.amelinroman.spring.mvc_hibernate_sql_aop.dao;

import com.amelinroman.spring.mvc_hibernate_sql_aop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
