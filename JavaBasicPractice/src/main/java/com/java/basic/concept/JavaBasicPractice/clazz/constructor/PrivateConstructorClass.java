package com.java.basic.concept.JavaBasicPractice.clazz.constructor;

public class PrivateConstructorClass {

	// Reasons where you may need private constructor:
	// to prevent instantiation outside of the object
	// 1. singleton
	// 2.factory method
	// 3.static-methods-only (utility) class
	// 4.constants-only class

	private PrivateConstructorClass() {
		super();
		System.out.println("PrivateConstructorClass");
	}
}
