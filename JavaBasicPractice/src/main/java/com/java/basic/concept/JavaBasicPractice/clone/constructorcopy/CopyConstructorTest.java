package com.java.basic.concept.JavaBasicPractice.clone.constructorcopy;

public class CopyConstructorTest {

	/*
	 * Copy constructors are special constructors in a class which takes argument
	 * for its own class type.So, when you pass an instance of class to copy
	 * constructor, then constructor will return a new instance of class with values
	 * copied from argument instance.It helps you to clone object with Cloneable
	 * interface.
	 */

	public static void main(String[] args) {
		PrintOne one = new PrintOne(1, 2);
		PrintTwo two = new PrintTwo(1, 2, 3);

		PrintOne clone1 = new PrintOne(one);
		PrintOne clone2 = new PrintOne(two);

		// Let check for class types
		System.out.println(clone1.getClass());
		System.out.println(clone2.getClass());

	}
}
