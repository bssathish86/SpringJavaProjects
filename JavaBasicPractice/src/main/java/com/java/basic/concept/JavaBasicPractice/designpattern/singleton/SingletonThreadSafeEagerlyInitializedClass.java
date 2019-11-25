package com.java.basic.concept.JavaBasicPractice.designpattern.singleton;

public class SingletonThreadSafeEagerlyInitializedClass {

	// This method is thread-safe, but it is not lazy initialized . The singleton
	// object is created as soon as the class is loaded.
	private static final SingletonThreadSafeEagerlyInitializedClass instance = new SingletonThreadSafeEagerlyInitializedClass();

	private SingletonThreadSafeEagerlyInitializedClass() {
		System.out.println("SingletonThreadSafeEagerlyInitializedClass");
	}

	public static SingletonThreadSafeEagerlyInitializedClass getInstance() {
		return instance;
	}
}
