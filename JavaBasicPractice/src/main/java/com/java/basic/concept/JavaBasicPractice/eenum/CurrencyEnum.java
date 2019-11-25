package com.java.basic.concept.JavaBasicPractice.eenum;

// Enums in Java are type-safe and has their own name space.
// Enum in Java are reference types like class or interface and you can define constructor, methods and variables inside java Enum.
// we can specify values of Enum constants at the creation time.
// Enum constants are implicitly static and final and can not be changed once created.
// Enum in java can be used as an argument on switch statement and with "case:" like int or char primitive type.
// constants defined inside Enum in Java are final you can safely compare them using "==", the equality operator.comparing objects using == operator is not recommended, Always use equals().
// Values() method returns array of Enum constants in the same order they have listed in Enum.
// Java, Enum can override methods also. Let’s see an example of overriding toString() method inside Enum.
// Two new collection classes EnumMap and EnumSet are added into collection package to support Java Enum. These classes are a high-performance implementation of Map and Set interface in Java.
// You can not create an instance of enums by using new operator in Java because the constructor of Enum in Java can only be private.
// An instance of Enum in Java is created when any Enum constants are first called or referenced in code.
// Enum in Java can implement the interface and override any method like normal class It’s also worth noting that Enum in java implicitly implements both Serializable and Comparable.
// You can define abstract methods inside Enum in Java and can also provide a different implementation for different instances of enum in java. 

public enum CurrencyEnum {

	PENNY(1), NICKLE(5), DIME(10), QUARTER(25);

	private int value;

	private CurrencyEnum(int value) {
		this.value = value;
	}

	/*
	 * public CurrencyEnum getValue(CurrencyEnum currency) { return
	 * CurrencyEnum.valueOf(CurrencyEnum, currency); }
	 */
};
