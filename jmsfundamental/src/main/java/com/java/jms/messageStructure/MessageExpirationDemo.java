package com.java.jms.messageStructure;

import javax.jms.JMSContext;
import javax.jms.JMSProducer;
import javax.jms.Message;
import javax.jms.Queue;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory;

public class MessageExpirationDemo {

	public static void main(String[] args) throws NamingException, InterruptedException {

		InitialContext initialContext = new InitialContext();
		Queue queue = (Queue) initialContext.lookup("queue/myQueue");
		Queue expiryQueue = (Queue) initialContext.lookup("queue/expiryQueue");

		try (ActiveMQConnectionFactory cf = new ActiveMQConnectionFactory(); JMSContext context = cf.createContext()) {
			JMSProducer producer = context.createProducer();
			producer.setTimeToLive(2000);
			producer.send(queue, "Hi, simple message service");

			Thread.sleep(5000);

			Message mesage = context.createConsumer(queue).receive(5000);
			System.out.println(mesage);
			System.out.println(
					"Reading expired message  " + context.createConsumer(expiryQueue).receiveBody(String.class));

		}
	}
}
