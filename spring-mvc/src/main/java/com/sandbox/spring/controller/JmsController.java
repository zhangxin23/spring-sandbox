package com.sandbox.spring.controller;

import com.sandbox.spring.service.JmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public void sendMsg(String msg) {
        jmsService.sendMsg(msg);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String getMsg() {
        return jmsService.getMsg();
    }
}
