package com.java.basic.concept.JavaBasicPractice.clone.constructorcopy;

public class PrintOne {

	private Integer x;
	private Integer y;

	public PrintOne(PrintOne printOne) {
		this.x = printOne.x;
		this.y = printOne.y;
	}

	public PrintOne(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
