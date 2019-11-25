package com.java.basic.concept.JavaBasicPractice.clone;

import java.util.Calendar;
import java.util.Date;

public class JavaClone {

	public static void main(String[] args) throws Exception {

		// Create instance of Person object
		Person personDetails = new Person("Lokesh", "Gupta", 32, new Date(Calendar.getInstance().getTimeInMillis()));

		// Verify the content
		System.out.println(personDetails);

		// Now create a deep copy of it
		Person deepCopiedInstance = personDetails.deepCopy();

		// Again verify the content
		System.out.println(deepCopiedInstance);

	}

}
