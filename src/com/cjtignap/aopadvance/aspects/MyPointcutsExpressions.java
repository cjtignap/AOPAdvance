package com.cjtignap.aopadvance.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyPointcutsExpressions {
    @Pointcut("execution(* com.cjtignap.aopadvance.dao.*.*(..))")
    public void forDAOMethods(){}

    @Pointcut("execution(* com.cjtignap.aopadvance.dao.*.set*(..)))")
    public void forSetterMethods(){}

    @Pointcut("execution(* com.cjtignap.aopadvance.dao.*.get*(..)))")
    public void forGetterMethods(){}


    @Pointcut("forDAOMethods() && !(forGetterMethods() || forSetterMethods())")
    public void forDAOMethodsWithoutGettersAndSetter(){}
}
