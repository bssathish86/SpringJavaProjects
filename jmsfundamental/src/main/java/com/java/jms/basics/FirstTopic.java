package com.java.jms.basics;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class FirstTopic {

	public static void main(String[] args) throws NamingException, JMSException {
		InitialContext initialContext = null;
		Connection con = null;

		initialContext = new InitialContext();
		Topic topic = (Topic) initialContext.lookup("topic/myTopic");
		ConnectionFactory cf = (ConnectionFactory) initialContext.lookup("ConnectionFactory");

		con = cf.createConnection();
		Session session = con.createSession();

		MessageProducer producer = session.createProducer(topic);

		MessageConsumer consumer1 = session.createConsumer(topic);
		MessageConsumer consumer2 = session.createConsumer(topic);

		TextMessage msg = session.createTextMessage(" Hi , Good Morning to All !!");

		producer.send(msg);
		con.start();

		TextMessage messg1 = (TextMessage) consumer1.receive(5000);
		System.out.println("received message from  consumer1 : " + messg1.getText());

		TextMessage messg2 = (TextMessage) consumer2.receive(5000);
		System.out.println("received message from  consumer2 : " + messg2.getText());

		con.close();
		initialContext.close();

	}
}
