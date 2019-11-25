package com.java.basic.concept.JavaBasicPractice.designpattern.singleton;

public class SingletoneDoubleLockingWithVolatileClass {

	/*
	 * The volatile prevents memory writes from being re-ordered, making it
	 * impossible for other threads to read uninitialized fields of your singleton
	 * through the singleton’s pointer.
	 */
	private volatile static SingletoneDoubleLockingWithVolatileClass instance = null;

	private SingletoneDoubleLockingWithVolatileClass() {
		System.out.println("SingletoneDoubleLockingWithVolatileClass");
	}

	public static SingletoneDoubleLockingWithVolatileClass getInstance() {
		if (instance == null) {
			synchronized (SingletoneDoubleLockingWithVolatileClass.class) {
				if (instance == null) {
					instance = new SingletoneDoubleLockingWithVolatileClass();
				}
			}
		}
		return instance;
	}
}
