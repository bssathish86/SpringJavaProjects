package com.java.basic.concept.JavaBasicPractice.exception.customexception;

public class CustomRuntimeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7600633244294607098L;

	public CustomRuntimeException() {
		super();
		System.out.println("CustomRuntimeException . ..");
	}

	public CustomRuntimeException(String message) {
		super(message);
		System.out.println("CustomRuntimeException . ..");
	}

}
