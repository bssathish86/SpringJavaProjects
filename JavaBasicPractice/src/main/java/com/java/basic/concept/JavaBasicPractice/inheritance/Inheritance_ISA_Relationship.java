package com.java.basic.concept.JavaBasicPractice.inheritance;

public class Inheritance_ISA_Relationship {

	public static void main(String[] args) {

		ClassParent p = new ClassParent();
		p.m1();
		p.m3();
		// p.m2(); // The method m2() is undefined for the type ClassParent

		ClassChild c = new ClassChild();
		c.m1();
		c.m2();
		c.m3();

		ClassParent p1 = new ClassChild();
		p1.m1();
		p1.m3();
		// p1.m2(); //The method m2() is undefined for the type ClassParent

		// ClassChild c1 = new ClassParent();
		// Type mismatch: cannot convert from ClassParent to ClassChild
	}
}
