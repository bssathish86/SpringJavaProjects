package com.java.basic.concept.JavaBasicPractice.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {
// public class Person {

	private String firstName;
	private String lastName;
	private int age;
	private Date dateOfBirth;
	// transient value wont be available.
	private transient double height;
	// static field will not be participate in serialization process.
	private static double weight;
	// static field will not be participate in serialization process.
	private transient static String colour = "Brown";
	private transient final String Nationality = "Indian";

	public Person() {
		super();
	}

	public Person(String firstName, String lastName, int age, Date dateOfBirth, double weight, double height,
			String colour) {
		super();
		System.out.println("weight " + weight);
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.weight = weight;
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public static double getWeight() {
		return weight;
	}

	public static void setWeight(double weight) {
		Person.weight = weight;
	}

	public static String getColour() {
		return colour;
	}

	public static void setColour(String colour) {
		Person.colour = colour;
	}

	public String getNationality() {
		return Nationality;
	}

	private void readObject(ObjectInputStream aInputStream) throws ClassNotFoundException, IOException {

		aInputStream.defaultReadObject();
		// reading data order should be same as writing data order
		// firstName = aInputStream.readUTF();
		// lastName = aInputStream.readUTF();
		// age = aInputStream.readInt();
		// make defensive copy of the mutable Date field
		// dateOfBirth = new Date(dateOfBirth.getTime());
	}

	private void writeObject(ObjectOutputStream aOutputStream) throws IOException {
		aOutputStream.defaultWriteObject();
		// perform the default serialization for all non-transient, non-static fields
		// aOutputStream.writeUTF(firstName);
		// aOutputStream.writeUTF(lastName);
		// aOutputStream.writeInt(age);
		// aOutputStream.writeLong(dateOfBirth.getTime());
	}

	@Override
	public String toString() {
		return String.format("Person [firstName=%s, lastName=%s, age=%s, dateOfBirth=%s, height=%s, Nationality=%s]",
				firstName, lastName, age, dateOfBirth, height, Nationality);
	}
}
