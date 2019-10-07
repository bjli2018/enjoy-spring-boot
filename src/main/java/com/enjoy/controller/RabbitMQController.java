package com.enjoy.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enjoy.mq.Sender;

@RestController
public class RabbitMQController {
	
	@Resource
    private Sender sender;
	
    @RequestMapping("/rabbitmq")
    public void sendMsgToRabbitMQ() {
    	sender.send();
    }
}
