package com.java.basic.concept.JavaBasicPractice.reflection;

public class Department {

	private int id;
	private String name;

	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("Department [id=%s, name=%s]", id, name);
	}
}
