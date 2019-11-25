package com.javainuse;

public class JavaLambda {

	public static void main(String[] args) {

		// (String param)->{System.out.println("My Name is "+param);};
		/*
		 * Both way we can use lambda functions
		 * Greetings greetingsInstance = n -> System.out.println("My name is " + n);
		 * Greetings greetingsInstance = (n) -> System.out.println("My name is " + n);
		 */
		Greetings greetingsInstance = (n) -> System.out.println("My name is " + n);
		greet(greetingsInstance, "Tom");
	}

	private static void greet(Greetings greetingsInstance, String name) {
		greetingsInstance.sayHello(name);
	}

}
