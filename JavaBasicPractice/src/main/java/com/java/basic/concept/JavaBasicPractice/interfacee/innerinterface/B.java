package com.java.basic.concept.JavaBasicPractice.interfacee.innerinterface;

public interface B {

	// By default method modifier is public and abstract.
	void m1();

	default void m2() {
		System.out.println("interface B -> default method m1 ().");
	}

	public static void m3() {
		System.out.println("interface B -> static methid m3 ().");
	}
}
