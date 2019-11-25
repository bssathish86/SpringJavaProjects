package com.java.basic.concept.JavaBasicPractice.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Date;

public class SerializationChildClass {

	private static String filePath = "PoliceMan.ser";

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		SerializationChildClass demo = new SerializationChildClass();
		PoliceMan policeMan = getPoliceManData();

		demo.serialize(policeMan);

		System.out.println("\n=============\n");
		PoliceMan policeMan1 = demo.deserialize();

		System.out.println("PoliceMan details afeter de-serialization:\n" + policeMan1);
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

	private static PoliceMan getPoliceManData() {
		// Create new PoliceMan object
		PoliceMan policeMan = new PoliceMan();
		PrintOne printone = new PrintOne();

		policeMan.setFirstName("Lokesh");
		policeMan.setLastName("Gupta");
		policeMan.setAge(32);
		policeMan.setDateOfBirth(new Date(Calendar.getInstance().getTimeInMillis()));
		policeMan.setHeight(70.00);
		policeMan.setWeight(60.00);
		policeMan.setStationName("Chennai");
		policeMan.setLocality("Coimbatore");
		policeMan.setHoursworked(12);
		printone.setX(11);
		printone.setY(22);
		policeMan.setPrintone(printone);

		return policeMan;
	}
}
