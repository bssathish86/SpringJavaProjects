package com.java.basic.concept.JavaBasicPractice.designpattern.singleton;

public class SingletoneTestClass {

	public static void main(String[] args) {

		System.out.println(".... SingletonClassicClass ....");
		SingletonClassicClass scc = SingletonClassicClass.getInstance();
		SingletonClassicClass scc1 = SingletonClassicClass.getInstance();
		System.out.println(scc == scc1);

		System.out.println(".... SingletonDoubleLockingThreadSafeClass ....");
		SingletonDoubleLockingThreadSafeClass sdltsc = SingletonDoubleLockingThreadSafeClass.getInstance();
		SingletonDoubleLockingThreadSafeClass sdltsc1 = SingletonDoubleLockingThreadSafeClass.getInstance();
		System.out.println(sdltsc == sdltsc1);

		System.out.println(".... SingletoneDoubleLockingWithVolatileClass ....");
		SingletoneDoubleLockingWithVolatileClass sdlwvc = SingletoneDoubleLockingWithVolatileClass.getInstance();
		SingletoneDoubleLockingWithVolatileClass sdlwvc1 = SingletoneDoubleLockingWithVolatileClass.getInstance();
		System.out.println(sdlwvc == sdlwvc1);

		System.out.println(".... SingletoneUsingInnerClass ....");
		SingletoneUsingInnerClass suic = SingletoneUsingInnerClass.getInstance();
		SingletoneUsingInnerClass suic1 = SingletoneUsingInnerClass.getInstance();
		System.out.println(suic == suic1);

		System.out.println(".... SingletonThreadSafeClass ....");
		SingletonThreadSafeClass stsc = SingletonThreadSafeClass.getInstance();
		SingletonThreadSafeClass stsc1 = SingletonThreadSafeClass.getInstance();
		System.out.println(stsc == stsc1);

		System.out.println(".... SingletonThreadSafeEagerlyInitializedClass ....");
		SingletonThreadSafeEagerlyInitializedClass stseic = SingletonThreadSafeEagerlyInitializedClass.getInstance();
		SingletonThreadSafeEagerlyInitializedClass stseic1 = SingletonThreadSafeEagerlyInitializedClass.getInstance();
		System.out.println(stseic == stseic1);

		System.out.println(".... SingletonThreadSafeEnumClass ....");
		/*
		 * SingletonThreadSafeEnumClass stseic = SingletonThreadSafeEnumClass.
		 * SingletonThreadSafeEnumClass stseic1 =
		 * SingletonThreadSafeEnumClass.getInstance(); System.out.println(stseic ==
		 * stseic1);
		 */

	}
}
