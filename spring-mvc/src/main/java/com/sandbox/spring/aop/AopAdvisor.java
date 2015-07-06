package com.sandbox.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Author: zhangxin
 * Date:   15-7-6
 */
public class AopAdvisor {
    public void beforeAction() {
        System.out.println("###before action###");
    }

    public void afterAction() {
        System.out.println("###after action###");
    }

    public Object aroundAction(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("===before action===");
            Object result = joinPoint.proceed();
            System.out.println("===after action===");
            return result;
        } catch (Throwable t) {
            System.out.println("@@@forbidden action@@@");
        }
        return null;
    }

    public void interceptArgs(Integer id) {
        System.out.println("the argument is " + id);
    }
}
