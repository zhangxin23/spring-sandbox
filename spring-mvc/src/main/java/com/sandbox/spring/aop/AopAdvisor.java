package com.sandbox.spring.aop;

/**
 * Author: zhangxin
 * Date:   15-7-6
 */
public class AopAdvisor {
    public void beforeAction() {
        System.out.println("###beforeAction###");
    }

    public void afterAction() {
        System.out.println("###afterAction###");
    }
}
