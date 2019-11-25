package com.java.basic.concept.JavaBasicPractice.interfacee.innerinterface;

public class ClassInheritedABInterface implements InheritedABInterface {

	public static void main(String[] args) {

		ClassInheritedABInterface inheritedClasObjs = new ClassInheritedABInterface();
		inheritedClasObjs.m1();

		InheritedABInterface interfaceABRef = inheritedClasObjs;
		interfaceABRef.m1();

		A interfaceARef = inheritedClasObjs;
		interfaceARef.m1();

		B interfaceBRef = inheritedClasObjs;
		interfaceBRef.m1();
	}

	@Override
	public void m1() {
		System.out.println("ClassInheritedABInterface -> default method m1 ().");
	}
}
