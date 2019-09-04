package com.java.jms.basics;

import java.util.Enumeration;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class QueueBrowser {

	public static void main(String[] args) {
		InitialContext initialContext = null;
		Connection con = null;

		try {
			initialContext = new InitialContext();
			ConnectionFactory cf = (ConnectionFactory) initialContext.lookup("ConnectionFactory");
			con = cf.createConnection();
			Session session = con.createSession();

			Queue queue = (Queue) initialContext.lookup("queue/myQueue");
			MessageProducer producer = session.createProducer(queue);
			TextMessage msg1 = session.createTextMessage("Message 1 !!");
			TextMessage msg2 = session.createTextMessage("Message 2 !!");

			producer.send(msg1);
			producer.send(msg2);

			javax.jms.QueueBrowser queueBrowser = session.createBrowser(queue);
			Enumeration messageEnum = queueBrowser.getEnumeration();

			while (messageEnum.hasMoreElements()) {
				TextMessage textMessage = (TextMessage) messageEnum.nextElement();
				System.out.println(" message from  producer : " + textMessage.getText());
			}

			MessageConsumer consumer = session.createConsumer(queue);
			con.start();
			TextMessage messg = (TextMessage) consumer.receive(5000);
			System.out.println("received message 1 from  producer : " + messg.getText());
			messg = (TextMessage) consumer.receive(5000);
			System.out.println("received message 2 from  producer : " + messg.getText());

		} catch (NamingException ex) {
			ex.printStackTrace();
		} catch (JMSException ex) {
			ex.printStackTrace();
		} finally {

			if (con != null) {
				try {
					con.close();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			if (initialContext != null) {
				try {
					initialContext.close();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
	}

}
