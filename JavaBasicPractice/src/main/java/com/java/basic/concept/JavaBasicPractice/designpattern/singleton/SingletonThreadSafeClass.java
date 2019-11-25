package com.java.basic.concept.JavaBasicPractice.designpattern.singleton;

public class SingletonThreadSafeClass {

	// uses a technique known as lazy instantiation to create the singleton object
	private static SingletonThreadSafeClass instance = null;

	private SingletonThreadSafeClass() {
		System.out.println("SingletonThreadSafeClass");
	}

	/*
	 * synchronization is very expensive, synchronized methods can run up to 100
	 * times slower than unsynchronized methods, we need to introduce a performance
	 * enhancement that only synchronize the singleton assignment in getInstance(
	 */

	public synchronized static SingletonThreadSafeClass getInstance() {
		if (instance == null) {
			instance = new SingletonThreadSafeClass();
		}
		return instance;
	}
}
