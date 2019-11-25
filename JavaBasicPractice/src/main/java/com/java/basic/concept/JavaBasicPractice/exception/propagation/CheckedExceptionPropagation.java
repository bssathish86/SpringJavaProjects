package com.java.basic.concept.JavaBasicPractice.exception.propagation;

import java.io.IOException;

public class CheckedExceptionPropagation {

	void m() throws IOException {
		throw new java.io.IOException("Device error");// checked exception
	}

// Add throws declaration or Surround with try catch.
	void n() throws IOException {
		m();
	}

// Catching Exception and re-throwing exception.
	void p() throws Exception {
		try {
			n();
		} catch (Exception e) {
			throw new Exception("Exception re-throwed..");
		}
	}

	public static void main(String args[]) {
		CheckedExceptionPropagation obj = new CheckedExceptionPropagation();
		try {
			obj.p();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Normal flow");
	}
}
