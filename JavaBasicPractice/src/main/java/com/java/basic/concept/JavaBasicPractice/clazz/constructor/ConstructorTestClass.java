package com.java.basic.concept.JavaBasicPractice.clazz.constructor;

public class ConstructorTestClass {

	public static void main(String[] args) {

		// The constructor PrivateConstructorClass() is not visible
		// PrivateConstructorClass prco = new PrivateConstructorClass();
		DefaultConstructorClass deco = new DefaultConstructorClass();
		ProtectedConstructorClass poco = new ProtectedConstructorClass();
		PublicConstructorClass puco = new PublicConstructorClass();
	}
}
