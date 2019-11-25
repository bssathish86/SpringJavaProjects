package com.java.basic.concept.JavaBasicPractice.clazz.constructor;

public class PrivateConstructorClassUsingStatic {

	private static final PrivateConstructorClassUsingStatic red = new PrivateConstructorClassUsingStatic("red");
	private static final PrivateConstructorClassUsingStatic yellow = new PrivateConstructorClassUsingStatic("yellow");
	private static final PrivateConstructorClassUsingStatic blue = new PrivateConstructorClassUsingStatic("blue");

	public String name = "";

	private PrivateConstructorClassUsingStatic(String name) {
		System.out.println("PrivateConstructorClassUsingStatic ()");
		this.name = name;
	}

	public static void main(String[] args) {
		System.out.println("PrivateConstructorClassUsingStatic Main ()");
		// PrivateConstructorClassUsingStatic pccs = new
		// PrivateConstructorClassUsingStatic();
		System.out.println(red.name);
		System.out.println(yellow.name);
		System.out.println(blue.name);
	}
}
