package com.java.basic.concept.JavaBasicPractice.interfacee.functionalInterface;

// Functional Interface can have one and only one abstract method but one or more default methods.
// Java API contain several Functional Interfaces like Comparable, Runnable and etc.

@FunctionalInterface
public interface FuncsionalInterface<T> {

	public <T> T m1();
}
