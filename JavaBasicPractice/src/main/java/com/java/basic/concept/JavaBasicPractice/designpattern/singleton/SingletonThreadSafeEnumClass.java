package com.java.basic.concept.JavaBasicPractice.designpattern.singleton;

public enum SingletonThreadSafeEnumClass {

	INSTANCE(1);

	private int value;

	private SingletonThreadSafeEnumClass() {
		System.out.println("SingletonThreadSafeEnumClass");
	}

	private SingletonThreadSafeEnumClass(int _value) {
		System.out.println("SingletonThreadSafeEnumClass");
		this.value = _value;
	}

	public SingletonThreadSafeEnumClass getValue() {
		return null;
		// SingletonThreadSafeEnumClass.valueOf(SingletonThreadSafeEnumClass, name);
	}
}
