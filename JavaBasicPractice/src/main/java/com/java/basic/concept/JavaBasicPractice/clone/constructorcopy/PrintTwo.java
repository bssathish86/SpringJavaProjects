package com.java.basic.concept.JavaBasicPractice.clone.constructorcopy;

public class PrintTwo extends PrintOne {

	private Integer z;

	public PrintTwo(PrintTwo printTwo) {
		super(printTwo); // Call Super class constructor here
		this.z = printTwo.z;
	}

	public PrintTwo(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
}
