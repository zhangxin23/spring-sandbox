package com.sandbox.spring.service;

/**
 * Author: zhangxin
 * Date:   15-7-2
 */
public interface JmsService {
    void sendMsg(String msg);
    String getMsg();
}
