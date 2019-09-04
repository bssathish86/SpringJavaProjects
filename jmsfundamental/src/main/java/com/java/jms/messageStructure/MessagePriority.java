package com.java.jms.messageStructure;

import javax.jms.JMSConsumer;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.JMSProducer;
import javax.jms.Message;
import javax.jms.Queue;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory;

public class MessagePriority {

	public static void main(String[] args) throws NamingException, JMSException {

		InitialContext initialContext = new InitialContext();
		Queue queue = (Queue) initialContext.lookup("queue/myQueue");

		try (ActiveMQConnectionFactory cf = new ActiveMQConnectionFactory(); JMSContext context = cf.createContext()) {
			context.createProducer().send(queue, "Hi, simple message service");

			JMSProducer producer = context.createProducer();
			String[] message = new String[3];
			message[0] = "Message 1 !!";
			message[1] = "Message 2 !!";
			message[2] = "Message 3 !!";

			producer.setPriority(3);
			producer.send(queue, message[0]);

			producer.setPriority(1);
			producer.send(queue, message[1]);

			producer.setPriority(8);
			producer.send(queue, message[2]);

			JMSConsumer jmsConsumer = context.createConsumer(queue);
			for (int i = 0; i < 10; i++) {
				// System.out.println(jmsConsumer.receiveBody(String.class));
				Message msg = jmsConsumer.receive();
				System.out.println(msg.getJMSPriority() + " : ");
			}
		}
	}

}
