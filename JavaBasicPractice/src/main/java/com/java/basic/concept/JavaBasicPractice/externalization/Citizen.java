package com.java.basic.concept.JavaBasicPractice.externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Date;

public class Citizen extends Person implements Externalizable {

	private String Country;

	public Citizen() {
		super();
	}

	public Citizen(String firstName, String lastName, int age, Date dateOfBirth) {
		super(firstName, lastName, age, dateOfBirth);
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public void writeExternal(ObjectOutput objOut) throws IOException {
		objOut.writeUTF(Country);
	}

	public void readExternal(ObjectInput objIn) throws IOException, ClassNotFoundException {
		Country = objIn.readUTF();
	}

	@Override
	public String toString() {
		return String.format("Citizen [Country=%s]", Country);
	}
}
