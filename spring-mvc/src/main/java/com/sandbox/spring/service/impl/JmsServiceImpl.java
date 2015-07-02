package com.sandbox.spring.service.impl;

import com.sandbox.spring.service.JmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.jms.support.JmsUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;

/**
 * Author: zhangxin
 * Date:   15-7-2
 */
@Service(value = "jmsService")
public class JmsServiceImpl implements JmsService {
    @Autowired
    private JmsTemplate jmsTemplate;

    @Override
    public void sendMsg(final String msg) {
        jmsTemplate.send("sandbox.queue", new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createObjectMessage(msg);
            }
        });
    }

    @Override
    public String getMsg() {
        try {
            ObjectMessage recvMsg = (ObjectMessage)jmsTemplate.receive();
            return (String)recvMsg.getObject();
        } catch (JMSException e) {
            throw JmsUtils.convertJmsAccessException(e);
        }
    }
}
