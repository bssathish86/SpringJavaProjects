package com.java.basic.concept.JavaBasicPractice.inheritance;

public class ClassChild extends ClassParent {

	public ClassChild() {
		super();
		System.out.println(" Constructor ClassChild");
	}

	public void m1() {
		System.out.println("ClassChild -> m1 ()");
	}

	public void m2() {
		System.out.println("ClassChild -> m2 ()");
	}

	public static void m3() {
		System.out.println("ClassChild -> m3 ()");
	}
}
