package com.cjtignap.aopadvance.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {



    public void addAccount(Account account){
        System.out.println("Adding account!"+getClass()+"\n");
    }
}
