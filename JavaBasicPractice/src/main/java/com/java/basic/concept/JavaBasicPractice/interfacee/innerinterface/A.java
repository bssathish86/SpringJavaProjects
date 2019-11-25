package com.java.basic.concept.JavaBasicPractice.interfacee.innerinterface;

public interface A {

	// All the fields are public, static, and final.

	// By default method modifier is public and abstract.
	void m1();

	// Illegal modifier for the interface method m2; only
	// public, abstract, default, static and strictfp are permitted
	// private void m1 ();

	// This method requires a body instead of a semicolon
	// default void m2();

	default void m2() {
		System.out.println("interface InterfaceA -> default method m1 ().");
	}

	public static void m3() {
		System.out.println("interface InterfaceA -> static methid m3 ().");
	}
}
