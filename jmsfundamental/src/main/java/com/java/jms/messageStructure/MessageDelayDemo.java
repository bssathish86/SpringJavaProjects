package com.java.jms.messageStructure;

import javax.jms.JMSContext;
import javax.jms.JMSProducer;
import javax.jms.Message;
import javax.jms.Queue;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory;

public class MessageDelayDemo {

	public static void main(String[] args) throws NamingException, InterruptedException {

		InitialContext initialContext = new InitialContext();
		Queue queue = (Queue) initialContext.lookup("queue/myQueue");

		try (ActiveMQConnectionFactory cf = new ActiveMQConnectionFactory(); JMSContext context = cf.createContext()) {
			JMSProducer producer = context.createProducer();
			producer.send(queue, "Hi, simple message service");
			producer.setDeliveryDelay(10000);
			Message mesage = context.createConsumer(queue).receive(3000);
			System.out.println(mesage);

		}
	}
}
