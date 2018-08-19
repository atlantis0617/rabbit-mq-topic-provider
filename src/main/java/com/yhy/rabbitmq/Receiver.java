package com.yhy.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues="Hello-yhy-queue")
public class Receiver {
	
	@RabbitHandler
	public void process(String msg) {
		System.out.println("receiver"+msg);
	}

}
