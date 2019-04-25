package com.atguigu.cache.service;

import com.atguigu.cache.bean.Employee;
import com.atguigu.cache.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;
    //key="#root.methodName+'['+#id+']'"  ,condition ="#a0>1",unless = "#a0==2"
    @Cacheable(cacheNames = {"emp"}/*,keyGenerator = "myKeyGenerator"*/)
    public Employee getEmp(Integer id){
        Employee empById = employeeMapper.getEmpById(id);
        System.out.println("id"+id+"开始查询了");
        return empById;
    }
    @CachePut(cacheNames = {"emp"},key="#employee.id")
    public Employee updateEmp(Employee employee){
        employeeMapper.updateEmp(employee);
        System.out.println("id"+employee.getId()+"开始更新了");
        return employee;
    }
    @CacheEvict(value = {"emp"} ,key="#id")
    public void deleteEmp(Integer id){
        System.out.println("删除员工id----"+id);
       // employeeMapper.deleEmp(id);
    }
}
