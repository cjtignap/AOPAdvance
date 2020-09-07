package com.cjtignap.aopadvance.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    String name,age;

    public String getName() {
        System.out.println("getname()");
        return name;
    }

    public void setName(String name) {
        System.out.println("setName()");
        this.name = name;
    }

    public String getAge() {
        System.out.println("getAge()");
        return age;
    }

    public void setAge(String age) {
        System.out.println("setAge()");
        this.age = age;
    }

    public void addAccount(){
        System.out.println("Adding account!"+getClass());
    }
    public void getAccount(){
        System.out.println("Getting list of accounts!"+getClass());
    }
}
