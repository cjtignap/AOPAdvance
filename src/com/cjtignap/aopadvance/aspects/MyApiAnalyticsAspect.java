package com.cjtignap.aopadvance.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyApiAnalyticsAspect {

    @Before("com.cjtignap.aopadvance.aspects.MyPointcutsExpressions.forDAOMethodsWithoutGettersAndSetter()")
    public void addApiAnalyticsAspect(){
        System.out.println("API analytics advice applied before");
    }

}
