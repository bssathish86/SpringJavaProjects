package com.java.basic.concept.JavaBasicPractice.externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Person implements Externalizable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1009098241698405290L;

	private String firstName;
	private String lastName;
	private int age;
	private Date dateOfBirth;

	public Person() {
		super();
	}

	public Person(String firstName, String lastName, int age, Date dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
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

	public void writeExternal(ObjectOutput objOut) throws IOException {
		objOut.writeUTF(firstName);
		objOut.writeUTF(lastName);
		objOut.writeInt(age);
		objOut.writeLong(dateOfBirth.getTime());
	}

	public void readExternal(ObjectInput objIn) throws IOException, ClassNotFoundException {
		firstName = objIn.readUTF();
		lastName = objIn.readUTF();
		age = objIn.readInt();
		dateOfBirth = new Date(objIn.readLong());
	}

	private void readObject(ObjectInputStream objInputStream) throws ClassNotFoundException, IOException {

		// objInputStream.defaultReadObject();
		// reading data order should be same as writing data order
		// firstName = aInputStream.readUTF();
		// lastName = aInputStream.readUTF();
		// age = aInputStream.readInt();
		// make defensive copy of the mutable Date field
		// dateOfBirth = new Date(dateOfBirth.getTime());
	}

	private void writeObject(ObjectOutputStream objOutputStream) throws IOException {

		// perform the default serialization for all non-transient, non-static fields
		// objOutputStream.defaultWriteObject();
		// objOutputStream.writeUTF(firstName);
		// objOutputStream.writeUTF(lastName);
		// objOutputStream.writeInt(age);
		// objOutputStream.writeLong(dateOfBirth.getTime());
	}

	@Override
	public String toString() {
		return String.format("Person [firstName=%s, lastName=%s, age=%s, dateOfBirth=%s]", firstName, lastName, age,
				dateOfBirth);
	}
}
