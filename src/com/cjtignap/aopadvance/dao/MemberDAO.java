package com.cjtignap.aopadvance.dao;

import org.springframework.stereotype.Component;

@Component
public class MemberDAO {
    public void addAccount(){
        System.out.println("Adding account!"+getClass());
    }
}
