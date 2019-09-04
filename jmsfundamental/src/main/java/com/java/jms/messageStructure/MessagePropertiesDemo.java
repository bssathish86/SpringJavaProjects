package com.java.jms.messageStructure;

import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.JMSProducer;
import javax.jms.Message;
import javax.jms.Queue;
import javax.jms.TextMessage;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory;

public class MessagePropertiesDemo {

	public static void main(String[] args) throws NamingException, InterruptedException, JMSException {

		InitialContext initialContext = new InitialContext();
		Queue queue = (Queue) initialContext.lookup("queue/myQueue");

		try (ActiveMQConnectionFactory cf = new ActiveMQConnectionFactory();
				JMSContext jmsContext = cf.createContext()) {
			JMSProducer producer = jmsContext.createProducer();
			TextMessage sendMessage = jmsContext.createTextMessage("Hi, simple message service");
			sendMessage.setBooleanProperty("Loggedin", true);
			producer.send(queue,sendMessage);

			producer.setDeliveryDelay(10000);
			Message mesage = jmsContext.createConsumer(queue).receive(3000);
			System.out.println(mesage);
			System.out.println(mesage.getBooleanProperty("Loggedin"));

		}
	}
}
