package com.java.basic.concept.JavaBasicPractice.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Date;

public class Serialization {
	private static String filePath = "Person.ser";

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Serialization demo = new Serialization();

		Person personSe = getPersonData();
		demo.serialize(personSe);

		System.out.println("\n=============\n");
		Person personDe = demo.deserialize();

		System.out.println("Person's details afeter de-serialization:\n" + personDe);
	}

	public <T> void serialize(T object) throws IOException {

		FileOutputStream fos = new FileOutputStream(filePath);
		ObjectOutputStream outputStream = new ObjectOutputStream(fos);
		outputStream.writeObject(object);
		outputStream.close();

		System.out.println("Serialization done");
	}

	public <T> T deserialize() throws ClassNotFoundException, IOException {

		FileInputStream fis = new FileInputStream(filePath);
		ObjectInputStream inputStream = new ObjectInputStream(fis);
		T object = (T) inputStream.readObject();
		inputStream.close();
		return object;
	}

	private static Person getPersonData() {
		// Create new Person object
		Person person = new Person();
		person.setFirstName("Lokesh");
		person.setLastName("Gupta");
		person.setAge(32);
		person.setDateOfBirth(new Date(Calendar.getInstance().getTimeInMillis()));
		person.setHeight(70.00);
		person.setWeight(60.00);
		return person;
	}
}
