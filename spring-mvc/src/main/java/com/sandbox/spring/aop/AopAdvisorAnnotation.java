package com.sandbox.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Author: zhangxin
 * Date:   15-7-7
 */
@Aspect
public class AopAdvisorAnnotation {
    @Pointcut("execution(* com.sandbox.spring.service.impl.CityServiceImpl.get(..))")
    public void actionAnnotation() {
    }

    @Pointcut("execution(* com.sandbox.spring.service.impl.CityServiceImpl.get(Integer)) && args(id)")
    public void interceptActionAnnotation(Integer id) {
    }

    @Before("actionAnnotation()")
    public void beforeActionAnnotation() {
        System.out.println("&&&before action annotation&&&");
    }

    @After("actionAnnotation()")
    public void afterActionAnnotation() {
        System.out.println("&&&after action annotation&&&");
    }

    @Around("actionAnnotation()")
    public Object aroundActionAnnotation(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("^^^before around action annotation^^^");
            Object obj = joinPoint.proceed();
            System.out.println("^^^before around action annotation^^^");
            return obj;
        } catch (Throwable t) {
            System.out.println("^^^forbidden action annotation^^^");
        }
        return null;
    }

    @Before("interceptActionAnnotation(id)")
    public void beforeInterceptActionAnnotation(Integer id) {
        System.out.println("beforeInterceptActionAnnotation: the args is " + id);
    }
}
