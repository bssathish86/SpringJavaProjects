package com.java.basic.concept.JavaBasicPractice.clazz.sstatic;

// Illegal modifier for the class StaticClass; only public, abstract & final are permitted
//public static class StaticClass {

public class StaticClass {

	private static int a = 5;

	static {
		System.out.println("static block");
		System.out.println("static block before int a : " + a);
		a = 10;
		System.out.println("static block after int a : " + a);
		print();
	}

	private static int b = 25;

	static void print() {
		System.out.println(b);
	}

	{
		System.out.println("instance block");
		int a = 15;
		System.out.println("instance int a : " + a);
	}

	public StaticClass() {
		super();
		System.out.println("constructor");
		a = 20;
		System.out.println("constructor int a : " + a);
	}

	public static void main() {
		System.out.println("StaticClass");
	}

	public static void main(String[] args) {
		System.out.println("before creation of instance : int a : " + a);
		new StaticClass();
		System.out.println("after creation of instance : int a : " + a);
	}
}
