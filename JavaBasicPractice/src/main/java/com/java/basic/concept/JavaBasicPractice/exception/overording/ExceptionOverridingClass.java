package com.java.basic.concept.JavaBasicPractice.exception.overording;

import java.io.IOException;

public class ExceptionOverridingClass {

	public static void main(String[] args) {

		ParentClass parentObject = new ParentClass();
		ParentClass childObject = new ChildClass();

		try {
			// The method m1() from the type ParentClass is not visible
			// p.m1();
			parentObject.m2();
		} catch (IOException e) {
			e.printStackTrace();
			try {
				childObject.m2();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

		try {
			parentObject.m3();
		} catch (IOException e) {
			e.printStackTrace();
			try {
				childObject.m3();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

		try {
			parentObject.m4();
		} catch (IOException e) {
			e.printStackTrace();
			try {
				childObject.m4();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

		try {
			parentObject.m5();
		} catch (IOException e) {
			e.printStackTrace();
			try {
				childObject.m5();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

	}
}
