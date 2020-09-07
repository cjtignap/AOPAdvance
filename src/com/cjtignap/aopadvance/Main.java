package com.cjtignap.aopadvance;

import com.cjtignap.aopadvance.dao.Account;
import com.cjtignap.aopadvance.dao.AccountDAO;
import com.cjtignap.aopadvance.dao.MemberDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AccountDAO accountDAO = context.getBean("accountDAO",AccountDAO.class);
        Account account = new Account();
        account.setName("Chris John");
        account.setAddress("San Pablo, Malolos city");
        accountDAO.addAccount(account);

        MemberDAO memberDAO = context.getBean("memberDAO",MemberDAO.class);
        memberDAO.addAccount();


    }
}
