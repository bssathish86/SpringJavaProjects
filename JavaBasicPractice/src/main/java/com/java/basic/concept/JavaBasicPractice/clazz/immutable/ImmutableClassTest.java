package com.java.basic.concept.JavaBasicPractice.clazz.immutable;

public class ImmutableClassTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Employee emp = new Employee("Adithya", 34, new Address("Home", "Madhapur", "Hyderabad"));
		Address address = emp.getAddress();
		System.out.println(address);

		address.setAddress("Hi-tech City");
		address.setAddressType("Office");
		address.setCity("Hyderabad");
		System.out.println(emp.getAddress());
	}
}
