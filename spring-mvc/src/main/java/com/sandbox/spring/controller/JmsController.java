package com.sandbox.spring.controller;

import com.sandbox.spring.service.JmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * Author: zhangxin
 * Date:   15-7-2
 */
@Controller
@RequestMapping(value = "/jms")
public class JmsController {
    @Resource(name = "jmsService")
    private JmsService jmsService;

    @RequestMapping(value = "/sendMsg", method = RequestMethod.GET)
    public void sendMsg(String msg) {
        jmsService.sendMsg(msg);
    }

    @RequestMapping(value = "/getMsg", method = RequestMethod.GET)
    public String getMsg() {
        return jmsService.getMsg();
    }
}
