package com.java.jms.basics;

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

/**
 * @author sathishkumar_s
 *
 */
public class FirstQueue {

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
			TextMessage msg = session.createTextMessage("Hi, simple messaging service !!");
			producer.send(msg);
			System.out.println("create message to send :" + msg.getText());

			MessageConsumer consumer = session.createConsumer(queue);
			con.start();
			TextMessage messg = (TextMessage) consumer.receive(5000);
			System.out.println("received message from  producer : " + messg.getText());

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
