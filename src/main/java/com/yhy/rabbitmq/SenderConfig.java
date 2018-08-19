package com.yhy.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 *
 */
@Configuration
public class SenderConfig {
	
	@Bean
	public Queue queue() {
		return new Queue("Hello-yhy-queue");
	}

}
