package com.cjtignap.aopadvance.aspects;

import com.cjtignap.aopadvance.dao.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyDemoLoggingAspect {

    @Before("com.cjtignap.aopadvance.aspects.MyPointcutsExpressions.forDAOMethodsWithoutGettersAndSetter()")
    public void addAccountLoggingAdvice(JoinPoint joinPoint){
        System.out.println("Logging advice applied before");


        //display the method signature
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        System.out.println(methodSignature);

        //display the method argument
        Object[] args = joinPoint.getArgs();
        for(Object arg:args){
            if(arg instanceof Account){
                Account account = (Account)arg;
                System.out.println("Name : "+ account.getName());
                System.out.println("Address : "+ account.getAddress());
            }
        }
    }
}
