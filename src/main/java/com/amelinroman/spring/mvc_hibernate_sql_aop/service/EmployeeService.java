package com.amelinroman.spring.mvc_hibernate_sql_aop.service;

import com.amelinroman.spring.mvc_hibernate_sql_aop.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    void deleteEmployee(int id);
}
