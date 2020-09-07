package com.cjtignap.aopadvance;

import com.cjtignap.aopadvance.dao.AccountDAO;
import com.cjtignap.aopadvance.dao.MemberDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AccountDAO accountDAO = context.getBean("accountDAO",AccountDAO.class);
        accountDAO.addAccount();
        accountDAO.getAccount();

        accountDAO.setName("chris");
        accountDAO.getName();
        accountDAO.setAge("20");
        accountDAO.getAge();


    }
}
