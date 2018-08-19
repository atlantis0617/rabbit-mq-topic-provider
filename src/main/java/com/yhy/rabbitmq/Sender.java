package com.yhy.rabbitmq;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {
	
	@Autowired
	private AmqpTemplate rabbitTemplate;
	
	public void send() {
		String msg = "hello yhy-----------"+new Date();
		this.rabbitTemplate.convertAndSend("Hello-yhy-queue", msg);
	}

}
