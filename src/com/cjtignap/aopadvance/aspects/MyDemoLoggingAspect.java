package com.cjtignap.aopadvance.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyDemoLoggingAspect {

    @Before("com.cjtignap.aopadvance.aspects.MyPointcutsExpressions.forDAOMethodsWithoutGettersAndSetter()")
    public void addAccountLoggingAdvice(){
        System.out.println("Logging advice applied before");
    }
}
