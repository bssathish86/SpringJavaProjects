package com.java.basic.concept.JavaBasicPractice.exception.customexception;

public class CustomThrowableException extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7600633244294607098L;

	public CustomThrowableException() {
		super();
		System.out.println("CustomThrowableException . ..");
	}

	public CustomThrowableException(String message) {
		super(message);
		System.out.println("CustomThrowableException . ..");
	}

}
