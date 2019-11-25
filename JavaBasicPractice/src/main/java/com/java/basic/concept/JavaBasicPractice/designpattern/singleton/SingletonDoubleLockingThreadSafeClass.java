package com.java.basic.concept.JavaBasicPractice.designpattern.singleton;

public class SingletonDoubleLockingThreadSafeClass {

	// uses a technique known as lazy instantiation to create the singleton object
	private static SingletonDoubleLockingThreadSafeClass instance = null;

	public SingletonDoubleLockingThreadSafeClass() {
		System.out.println("SingletonDoubleLockingThreadSafeClass");
	}

	/*
	 * Let’s reconsider the case that two threads enter the if code at the same tie.
	 * Imagine Thread 1 enters the synchronized block and is preempted.Subsequently,
	 * a second thread enters the if block.When Thread 1 exits the synchronized
	 * block,Thread 2 makes a second check to see if the singleton instance is still
	 * null. Since Thread 1 set the singleton member variable, Thread 2’ s second
	 * check will fail, and a second singleton will not be created.
	 */

	public static SingletonDoubleLockingThreadSafeClass getInstance() {
		if (instance == null) {
			synchronized (SingletonDoubleLockingThreadSafeClass.class) {
				if (instance == null) {
					instance = new SingletonDoubleLockingThreadSafeClass();
				}
			}
		}
		return instance;
	}
}
