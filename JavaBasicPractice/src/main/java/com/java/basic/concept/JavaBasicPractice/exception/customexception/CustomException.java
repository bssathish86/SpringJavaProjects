package com.java.basic.concept.JavaBasicPractice.exception.customexception;

public class CustomException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7600633244294607098L;

	public CustomException() {
		super();
		System.out.println("CustomException . ..");
	}

	public CustomException(String message) {
		super(message);
		System.out.println("CustomException . ..");
	}

}
