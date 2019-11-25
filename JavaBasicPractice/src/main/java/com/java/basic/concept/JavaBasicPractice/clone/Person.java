package com.java.basic.concept.JavaBasicPractice.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

// You must implement Cloneable interface

public class Person implements Cloneable, Serializable {

	/*
	 * By default, java cloning is field by field copy, the Object class does not
	 * have idea about the structure of class on which clone() method will be
	 * invoked.
	 */

	/*
	 * 1. If the class has only primitive data type members then a completely new
	 * copy of the object will be created and the reference to the new object copy
	 * will be returned.
	 * 
	 * 2. If the class contains members of any class type then only the object
	 * references to those members are copied and hence the member references in
	 * both the original object as well as the cloned object refer to the same
	 * object.
	 */

	/*
	 * Creates and returns a copy of this object. The precise meaning of "copy" may
	 * depend on the class of the object. The general intent is that, for any object
	 * x, the expression:
	 */

	// 1) x.clone() != x will be true
	// 2) x.clone().getClass() == x.getClass() will be true, but these are not
	// absolute requirements.
	// 3) x.clone().equals(x) will be true, this is not an absolute requirement.

	protected native Object clone() throws CloneNotSupportedException;

	private static final long serialVersionUID = 1009098241698405290L;

	private String firstName;
	private String lastName;
	private int age;
	private Date dateOfBirth;

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

	public Person deepCopy() throws Exception {

		// Serialization of object
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream out = new ObjectOutputStream(bos);
		out.writeObject(this);

		// De-serialization of object
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream in = new ObjectInputStream(bis);
		Person copied = (Person) in.readObject();

		return copied;
	}

	private void readObject(ObjectInputStream aInputStream) throws ClassNotFoundException, IOException {

		aInputStream.defaultReadObject();
		// reading data order should be same as writing data order
		// firstName = aInputStream.readUTF();
		// lastName = aInputStream.readUTF();
		// age = aInputStream.readInt() + 1;
		// make defensive copy of the mutable Date field
		dateOfBirth = new Date(dateOfBirth.getTime());
	}

	private void writeObject(ObjectOutputStream aOutputStream) throws IOException {

		// perform the default serialization for all non-transient, non-static fields
		aOutputStream.defaultWriteObject();
		aOutputStream.writeUTF(firstName);
		aOutputStream.writeUTF(lastName);
		aOutputStream.writeInt(age);
		aOutputStream.writeLong(dateOfBirth.getTime());
	}

	@Override
	public String toString() {
		return String.format("Person [firstName=%s, lastName=%s, age=%s, dateOfBirth=%s]", firstName, lastName, age,
				dateOfBirth);
	}
}
