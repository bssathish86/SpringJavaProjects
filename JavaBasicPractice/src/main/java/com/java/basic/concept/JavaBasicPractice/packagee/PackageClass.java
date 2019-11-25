package com.java.basic.concept.JavaBasicPractice.packagee;

import com.java.basic.concept.JavaBasicPractice.inheritance.ClassParent;
//import com.java.basic.concept.JavaBasicPractice.inheritance.*; 
// we can access all classes in this package..

public class PackageClass {

	public static void main(String[] args) {

		// com.java.basic.concept.JavaBasicPractice.inheritance.ClassParent p = new
		// com.java.basic.concept.JavaBasicPractice.inheritance.ClassParent();
		// fully qualified file with package..

		ClassParent p = new ClassParent();
		p.m1();

		ClassA a = new ClassA(); // ClassA in same package of this file. so no need to import package.
		a.m1();
	}
}
