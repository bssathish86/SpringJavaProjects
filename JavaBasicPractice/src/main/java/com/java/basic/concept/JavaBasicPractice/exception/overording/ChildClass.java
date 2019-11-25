package com.java.basic.concept.JavaBasicPractice.exception.overording;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ChildClass extends ParentClass {

	public ChildClass() {
		super();
		System.out.println("ChildClass");
	}

	// Exception Exception is not compatible with throws clause in ParentClass.m1()
	/*
	 * public void m1() throws Exception { throw new
	 * IOException(" ChildClass private method exception"); }
	 */

	// widen the visibility of the inherited method from ParentClass
	// Exception Exception is not compatible with throws clause in ParentClass.m2()
	// public void m2() throws Exception {
	@Override
	public void m2() throws FileNotFoundException {
		System.out.println("ChildClass protected method exception");
	}

	// Cannot reduce the visibility of the inherited method from ParentClass
	// @Override
	// protected void m2() throws IOException {
	@Override
	public void m3() {
		System.out.println("ChildClass public method exception");
	}

	public static void m4() throws IOException {
		System.out.println("ChildClass public static method exception");
	}

	static void m5() throws IOException {
		System.out.println("ChildClass static method exception");
	}
}
