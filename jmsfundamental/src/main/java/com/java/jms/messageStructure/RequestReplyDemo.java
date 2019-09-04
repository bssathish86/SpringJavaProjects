package com.java.jms.messageStructure;

import javax.jms.JMSConsumer;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.JMSProducer;
import javax.jms.Message;
import javax.jms.Queue;
import javax.jms.TemporaryQueue;
import javax.jms.TextMessage;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory;

public class RequestReplyDemo {

	public static void main(String[] args) throws NamingException, JMSException {

		InitialContext initialContext = new InitialContext();
		Queue requestqueue = (Queue) initialContext.lookup("queue/requestQueue");
		Queue replyQueue = (Queue) initialContext.lookup("queue/replyQueue");

		try (ActiveMQConnectionFactory cf = new ActiveMQConnectionFactory();
				JMSContext jmsContext = cf.createContext()) {
			JMSProducer createProducer = jmsContext.createProducer();
			TextMessage sendMessage = jmsContext.createTextMessage("Hi, simple message service");

			// Setting default reply Queue to message.
			// TemporaryQueue replyQueue = jmsContext.createTemporaryQueue();
			sendMessage.setJMSReplyTo(replyQueue);
			createProducer.send(requestqueue, sendMessage);
			System.out.println(sendMessage.getJMSMessageID());

			JMSConsumer createConsumer = jmsContext.createConsumer(requestqueue);
			TextMessage receivedMessage = (TextMessage) createConsumer.receive();
			System.out.println(receivedMessage.getText());

			JMSProducer replyProducer = jmsContext.createProducer();
			// setting run time reply Queue to message.
			TextMessage replyMessage = jmsContext.createTextMessage("I got your message");
			replyMessage.setJMSCorrelationID(replyMessage.getJMSMessageID());
			replyProducer.send(receivedMessage.getJMSReplyTo(), replyMessage);

			JMSConsumer replyConsumer = jmsContext.createConsumer(replyQueue);
			TextMessage repliedMessage = (TextMessage) replyConsumer.receive();
			System.out.println(repliedMessage.getJMSMessageID());
		}
	}
}
