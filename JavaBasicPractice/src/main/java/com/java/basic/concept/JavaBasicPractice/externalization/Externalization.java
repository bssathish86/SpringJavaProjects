package com.java.basic.concept.JavaBasicPractice.externalization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Externalization {
	private String filePath = "citizen.ser";

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Externalization demo = new Externalization();

		Citizen citizenSe = getCitizenData();
		demo.serialize(citizenSe);

		System.out.println("\n=============\n");

		Citizen citizenDe = demo.deserialize();
		Person person = (Person) citizenDe;

		System.out.println("Citizen's details afeter de-serialization:\n" + citizenDe);
		System.out.println("Person's details afeter de-serialization:\n" + person);
	}

	public <T> void serialize(T object) throws IOException {
		Citizen citizen = getCitizenData();

		FileOutputStream fos = new FileOutputStream(filePath);
		ObjectOutputStream outputStream = new ObjectOutputStream(fos);
		outputStream.writeObject(object);
		outputStream.close();

		System.out.println("Citizen's details before serialization:\n" + citizen);
		System.out.println("Serialization done");
	}

	public <T> T deserialize() throws ClassNotFoundException, IOException {

		FileInputStream fis = new FileInputStream(filePath);
		ObjectInputStream inputStream = new ObjectInputStream(fis);
		T object = (T) inputStream.readObject();
		inputStream.close();
		return object;
	}

	private static Citizen getCitizenData() {

		Citizen citizen = new Citizen();
		citizen.setFirstName("Sathish");
		citizen.setLastName("Kumar");
		citizen.setAge(32);
		citizen.setDateOfBirth(new Date());
		citizen.setCountry("India");

		return citizen;
	}
}
