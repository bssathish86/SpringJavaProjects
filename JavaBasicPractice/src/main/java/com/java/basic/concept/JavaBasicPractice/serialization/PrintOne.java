package com.java.basic.concept.JavaBasicPractice.serialization;

import java.io.Serializable;

public class PrintOne implements Serializable {

	private Integer x;
	private Integer y;

	public PrintOne() {
		super();
	}

	public PrintOne(PrintOne printOne) {
		this.x = printOne.x;
		this.y = printOne.y;
	}

	public PrintOne(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return String.format("PrintOne [x=%s, y=%s]", x, y);
	}
}
