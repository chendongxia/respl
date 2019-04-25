package com.atguigu.cache.mapper;

import com.atguigu.cache.bean.Employee;
import org.apache.ibatis.annotations.*;

@Mapper
public interface EmployeeMapper {
    @Select("select * from employee where id = #{id}")
    public Employee getEmpById(Integer id);
    @Insert("insert employee(lastName,gender,email,did) values(#{lastName},#{gender},#{email},#{did})")
    public void insEmp(Employee employee);
    @Update("update employee set lastName=#{lastName},gender=#{gender},email=#{email},did=#{did} where id=#{id}")
    public void updateEmp(Employee employee);
    @Delete("delete employee where id = #{id}")
    public void deleEmp(Integer id);
}
