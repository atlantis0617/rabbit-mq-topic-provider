package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yhy.rabbitmq.OrderSender;
import com.yhy.rabbitmq.ProductSender;
import com.yhy.rabbitmq.RabbitMqHelloApplication;
import com.yhy.rabbitmq.UserSender;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=RabbitMqHelloApplication.class)
public class RabbitMqHelloApplicationTests {
	
	@Autowired
	private UserSender sender;
	@Autowired
	private ProductSender psender;
	@Autowired
	private OrderSender osender;

	@Test
	public void send() {
		this.sender.send();
		this.psender.send();
		this.osender.send();
	}

}
