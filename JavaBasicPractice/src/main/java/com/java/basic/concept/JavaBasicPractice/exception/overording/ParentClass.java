package com.java.basic.concept.JavaBasicPractice.exception.overording;

import java.io.IOException;

public class ParentClass {

	public ParentClass() {
		System.out.println("ParentClass");
	}

	public void m1() {
		System.out.println("ParentClass public method.");
	}

	protected void m2() throws IOException {
		throw new IOException(" ParentClass protected method exception");
	}

	public void m3() throws IOException {
		throw new IOException(" ParentClass public method exception");
	}

	public static void m4() throws IOException {
		throw new IOException(" ParentClass public static method exception");
	}

	static void m5() throws IOException {
		throw new IOException(" ParentClass static method exception");
	}
}
