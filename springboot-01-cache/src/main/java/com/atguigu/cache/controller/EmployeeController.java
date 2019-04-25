package com.atguigu.cache.controller;

import com.atguigu.cache.bean.Employee;
import com.atguigu.cache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @RequestMapping("/employee/{id}")
    public Employee getEmpById(@PathVariable("id") Integer id){
        Employee emp = employeeService.getEmp(id);
        System.out.println("查询 "+id+"号员工了");
        return  emp;
    }
    @RequestMapping("/employee")
    public Employee updateEmpById(Employee employee){
        Employee emp = employeeService.updateEmp(employee);
        System.out.println("更新 "+emp.getId()+"号员工了");
        return  emp;
    }
    @RequestMapping("/deleEmp/{id}")
    public String delEmpById(@PathVariable("id") Integer id){
        employeeService.deleteEmp(id);
        System.out.println("删除 "+id+"号员工了");
        return  "success";
    }
}
