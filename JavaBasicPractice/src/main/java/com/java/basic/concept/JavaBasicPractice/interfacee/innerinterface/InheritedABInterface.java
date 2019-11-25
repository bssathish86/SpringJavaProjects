package com.java.basic.concept.JavaBasicPractice.interfacee.innerinterface;

public interface InheritedABInterface extends A, B {

	// This static method cannot hide the instance method from interface InterfaceA
	// public static void m1() { }

	public abstract void m1();

	default void m2() {

		// super reference is illegal in interface context
		// super.m2();

		// Cannot directly invoke the abstract method m1() for the type InterfaceA
		// InterfaceA.super.m1();

		// Cannot make a static reference to the non-static method m1() from the type InterfaceA
		// InterfaceA.m1();

		// B.super.m2();

		A.super.m2();
		B.super.m2();
	}

	// Illegal combination of modifiers for the interface method m3 ();
	// only one of abstract, default, or static permitted
	// public abstract static void m3 ();

	// Illegal modifier for the interface method m4;
	// only public, abstract, default, static and strictfp are permitted
	// public final void m4();
}
