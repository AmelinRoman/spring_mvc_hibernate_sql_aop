package com.amelinroman.spring.mvc_hibernate_sql_aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLoggingAspect {

    @Around("execution(* com.amelinroman.spring.mvc_hibernate_sql_aop.dao.*.*(..))")
    public Object aroundAllRepositoryMethodsAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        var methodSignature = (MethodSignature) joinPoint.getSignature();
        var methodName = methodSignature.getName();

        System.out.println("Begin of "+methodName);

        var targetMethodResult = joinPoint.proceed();

        System.out.println("End of "+methodName);

        return targetMethodResult;
    }
}
