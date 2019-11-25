package com.java.basic.concept.JavaBasicPractice.reflection;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Reflection extends Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5986659197944435392L;

	private Set<Person> personList = new HashSet<Person>();
	private Department department;

	public Reflection() {
		super();
	}

	public Reflection(String firstName, String lastName, int age, Date dateOfBirth) {
		super(firstName, lastName, age, dateOfBirth);
	}

	public Reflection(String firstName, String lastName, int age, Date dateOfBirth, Set<Person> personList,
			Department department) {
		super(firstName, lastName, age, dateOfBirth);
		this.personList = personList;
		this.department = department;
	}

	public static void main(String[] args) {
		try {

			Class<?> enclosingClass = Class.forName("com.java.basic.concept.JavaBasicPractice.reflection.Reflection");
			Object enclosingInstance = enclosingClass.newInstance();

			Class<?> innerClass = Class
					.forName("com.java.basic.concept.JavaBasicPractice.reflection.Reflection$InnerClass");
			Constructor<?> ctor = innerClass.getDeclaredConstructor(enclosingClass);

			InnerClass sInner1 = (InnerClass) ctor.newInstance(enclosingInstance);
			sInner1.message();

			Class<?> ssClass1 = Class
					.forName("com.java.basic.concept.JavaBasicPractice.reflection.Reflection$StaticInnerClass");
			StaticInnerClass ssInner1 = (StaticInnerClass) ssClass1.newInstance();
			ssInner1.message();

			Class<?> soClass1 = Class.forName("com.java.basic.concept.JavaBasicPractice.reflection.OuterClass");
			OuterClass sOuter1 = (OuterClass) soClass1.newInstance();
			sOuter1.message();

			System.out.println("------------------------");
			Class<?>[] cl = Reflection.class.getDeclaredClasses();
			for (Class<?> c : cl) {
				System.out.println(c.getName());
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	class InnerClass {

		/*
		 * public InnerClass() { super(); }
		 */
		void message() {
			System.out.println("Hello InnerClass Java");
		}
	}

	static class StaticInnerClass {

		public StaticInnerClass() {
			super();
		}

		void message() {
			System.out.println("Hello StaticInnerClass Java");
			System.out.println(StaticInnerClass.class.getCanonicalName());
			System.out.println(StaticInnerClass.class.getName());
		}
	}

	public Set<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(Set<Person> personList) {
		this.personList = personList;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}

class OuterClass {

	public OuterClass() {
		super();
	}

	void message() {
		System.out.println("Hello OuterClass Java");
		System.out.println(OuterClass.class.getCanonicalName());
		System.out.println(OuterClass.class.getName());
	}

}

// Illegal modifier for the class StaticSimpleOuter; only public, abstract & final are permitted
/*
 * public static class StaticSimpleOuter {
 * 
 * public StaticSimpleOuter() { super(); }
 * 
 * void message() { System.out.println("Hello SimpleOuter Java"); } }
 */
