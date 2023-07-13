package com.amelinroman.spring.mvc_hibernate_sql_aop.controller;

import com.amelinroman.spring.mvc_hibernate_sql_aop.dao.EmployeeDAO;
import com.amelinroman.spring.mvc_hibernate_sql_aop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showAllEmployees(Model model){
        var allEmployees =employeeService.getAllEmployees();
        model.addAttribute("allEmps", allEmployees);
        return "all-employees";
    }
}
