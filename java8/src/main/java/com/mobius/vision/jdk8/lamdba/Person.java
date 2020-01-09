package com.mobius.vision.jdk8.lamdba;

import lombok.Data;

import java.util.List;

/**
 * @author NingXioaoming
 * @createTime 2019/11/8 11:01
 * @description
 */

public class Person {
    private String userName = "zhangsan";
    private Integer age = 20;
    private List<String> list;

    public Person() {

    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
