package com.java.basic.concept.JavaBasicPractice.interfacee.nestedinterface;

public class NestedInterfaceClass implements InterfaceA {

	public NestedInterfaceClass() {
		System.out.println("NestedInterfaceClass ");
	}

	@Override
	public void m1() {
		System.out.println("NestedInterfaceClass -> m1()");
	}

	public static void main(String[] args) {

		System.out.println("NestedInterfaceClass main ()");
		System.out.println("- - - - - - - ClassJ.ClassDInterfaceK. - - - - - - - - - - ->");
		NestedInterfaceClass ref = new NestedInterfaceClass();

		ref.m1();
		ref.m2();
		InterfaceA.m3();

		ref.getInterfaceInstanceDetails();

		ref.getClassInstanceDetails();

		ref.getStaticClassInstanceDetails();

	}

	private void getInterfaceInstanceDetails() {
		System.out.println("- - - - - - - InterfaceA.InterfaceAB - - - - - - - - - - - ->");
		InterfaceA.InterfaceAB interfaceABRef = new InterfaceA.InterfaceAB() {
			@Override
			public void m1() {
				System.out.println("InterfaceA.InterfaceAB -> m1()");
			}
		};
		interfaceABRef.m1();
		interfaceABRef.m2();
		System.out.println("- - - - - - - InterfaceA.InterfaceAB.InterfaceABC- - - - - ->");
		InterfaceA.InterfaceAB.InterfaceABC interfaceABCRef = new InterfaceA.InterfaceAB.InterfaceABC() {

			@Override
			public void m1() {
				System.out.println("InterfaceA.InterfaceAB.InterfaceABC -> m1()");
			}
		};
		interfaceABCRef.m1();
		interfaceABCRef.m2();
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ->");
	}

	private void getClassInstanceDetails() {
		System.out.println("- - - - - - - InterfaceA.ClassJ - - - - - - - - - - - - - - ->");
		/*
		 * No enclosing instance of type InterfaceA.ClassJ is accessible. Must qualify
		 * the allocation with an enclosing instance of type InterfaceA.ClassJ (e.g.
		 * x.new A() where x is an instance of InterfaceA.ClassJ).
		 */
		InterfaceA.ClassD classCClassCRef = new InterfaceA.ClassD();
		classCClassCRef.m1();
		System.out.println("- - - - - - - InterfaceA.ClassD.ClassDInterfaceE- - - - - - ->");
		InterfaceA.ClassD.ClassDInterfaceE classDInterfaceERef = new InterfaceA.ClassD.ClassDInterfaceE() {
			@Override
			public void m1() {
				System.out.println("InterfaceA.ClassJ.ClassDInterfaceF -> m1()");
			}
		};
		classDInterfaceERef.m1();
		classDInterfaceERef.m2();
		System.out.println("- - - - - - - InterfaceA.ClassD.ClassDInterfaceE- - - - - - ->");
		InterfaceA.ClassD.ClassDInterfaceF classDInterfaceFRef = new InterfaceA.ClassD.ClassDInterfaceF() {
			@Override
			public void m1() {
				System.out.println("InterfaceA.ClassJ.ClassDInterfaceF -> m1()");
			}
		};
		classDInterfaceFRef.m1();
		classDInterfaceFRef.m2();
		System.out.println("- - - - - - - InterfaceA.ClassD.ClassDClassH - - - - - - - - >");
		InterfaceA.ClassD.ClassDClassH classDClassHRef = new InterfaceA.ClassD.ClassDClassH();
		classDClassHRef.m1();
		InterfaceA.ClassD.ClassDClassH.m3();
		System.out.println("- - - - - - - InterfaceA.ClassD.ClassDClassI - - - - - - - - >");
		InterfaceA.ClassD.ClassDClassI ClassDClassIRef = classCClassCRef.new ClassDClassI();
		ClassDClassIRef.m1();
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ->");
	}

	private void getStaticClassInstanceDetails() {

		System.out.println("- - - - - - - ClassJ.ClassDInterfaceK - - - - - - - - - - - ->");
		InterfaceA.ClassJ.m3();
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ->");
	}
}
