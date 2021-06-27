package com.atguigu.cache.bean;

public class Department {
    private Integer id;
    private String departmentName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        System.out.println("hhhh");
        System.out.println("hhhhhhh");
        this.departmentName = departmentName;
        System.out.println("bbbbb");
    }
}
