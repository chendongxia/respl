package com.atguigu.cache.bean;

public class Employee {
    private Integer id;
    private String lastName;
    private String gender;
    private String email;
    private Integer did;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getDid() {
        System.out.println("hhhhhh");
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }
}
