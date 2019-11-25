package com.java.basic.concept.JavaBasicPractice.designpattern.singleton;

public class SingletoneUsingInnerClass {

	// Correct lazy initialization in Java
	private static class SingletonHolder {
		public static SingletoneUsingInnerClass instance = new SingletoneUsingInnerClass();
	}

	public static SingletoneUsingInnerClass getInstance() {
		return SingletonHolder.instance;
	}
}
