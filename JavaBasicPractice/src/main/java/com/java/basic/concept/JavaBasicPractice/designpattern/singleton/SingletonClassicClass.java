package com.java.basic.concept.JavaBasicPractice.designpattern.singleton;

public class SingletonClassicClass {

	// Only 5 ways are correct :
	// 1.Synchronization the method.
	// 2.Static final variable.
	// 3.Using double checking lock with volatile keyword.
	// 4.Using SingletonHolder.
	// 5.Enum.

	// Uses a technique known as lazy instantiation to create the singleton object
	private static SingletonClassicClass instance = null;

	private SingletonClassicClass() {
		System.out.println("SingletonClassicClass");
	}

	/*
	 * If a thread is preempted at Line 2 before the assignment is made, the
	 * instance member variable will still be null, and another thread can
	 * subsequently enter the if block. In that case, two distinct singleton
	 * instances will be created.
	 */
	public static SingletonClassicClass getInstance() {
		if (instance == null) {
			instance = new SingletonClassicClass();
		}
		return instance;
	}
}
