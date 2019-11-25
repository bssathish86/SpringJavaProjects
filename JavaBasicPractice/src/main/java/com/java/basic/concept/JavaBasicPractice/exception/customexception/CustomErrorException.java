package com.java.basic.concept.JavaBasicPractice.exception.customexception;

public class CustomErrorException extends Error {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7600633244294607098L;

	public CustomErrorException() {
		super();
		System.out.println("CustomErrorException . ..");
	}

	public CustomErrorException(String message) {
		super(message);
		System.out.println("CustomErrorException . ..");
	}

}
