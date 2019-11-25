package com.java.basic.concept.JavaBasicPractice.eenum;

public enum CurrencyEnumImplementsInterface implements Runnable {

	// Syntax error on token "{", ; expected after this token

	PENNY(1), NICKLE(5), DIME(10), QUARTER(25);

	public static CurrencyEnumImplementsInterface ss;

	static {
		System.out.println("Static block");
	}

	private int value;

	private CurrencyEnumImplementsInterface(int _value) {
		System.out.println("Constructor block " + _value);
		value = _value;
	}

	@Override
	public void run() {
		System.out.println("Enum in Java implement interfaces");
	}
}
