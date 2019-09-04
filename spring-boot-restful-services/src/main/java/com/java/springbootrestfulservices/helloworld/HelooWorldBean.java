package com.java.springbootrestfulservices.helloworld;

public class HelooWorldBean {

	private String message;

	public HelooWorldBean() {
	}

	public HelooWorldBean(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelooWorldBean [message=" + message + "]";
	}

}
