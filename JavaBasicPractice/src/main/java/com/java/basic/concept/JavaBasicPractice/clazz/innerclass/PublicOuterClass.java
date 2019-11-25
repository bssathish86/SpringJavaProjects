package com.java.basic.concept.JavaBasicPractice.clazz.innerclass;

// Illegal modifier for the class PublicOuterClass; only public, abstract & final are permitted
//public static class PublicOuterClass {

public class PublicOuterClass {

	private String strPrivate = "strPrivatePublicOuterClass";
	protected String strProtected = "strProtectedPublicOuterClass";
	public String strPublic = "strPublicPublicOuterClass";
	private static final String strStaticFinal = "strStaticFinalPublicOuterClass";
	protected static final String strProtectedStaticFinal = "strProtectedStaticFinalPublicOuterClass";
	public static final String strPublicStaticFinal = "strPublicStaticFinalPublicOuterClass";

	private PublicOuterClass() {
		super();
		System.out.println("PublicOuterClass");
	}

	public void m1() {
		System.out.println("PublicOuterClass -> public m1()");
	}

	protected void m2() {
		System.out.println("PublicOuterClass -> protected m2()");
	}

	private void m3() {
		System.out.println("PublicOuterClass -> private m3()");
	}

	static void m4() {
		System.out.println("PublicOuterClass -> static m4()");
	}

	private static class PrivateStaticInnerClass {
		private String strPrivate = "strPrivateClassAF";
		protected String strProtected = "strProtectedClassAF";
		public String strPublic = "strPublicClassAF";
		private static final String strStaticFinal = "strStaticFinalClassAF";
		protected static final String strProtectedStaticFinal = "strProtectedStaticFinalClassAF";
		public static final String strPublicStaticFinal = "strPublicStaticFinalClassAF";

		// The constructor OuterClass.PrivateStaticInnerClass() is never used locally
		public PrivateStaticInnerClass() {
			System.out.println("PrivateStaticInnerClass");
		}

		// The method m1() from the type OuterClass.PrivateStaticInnerClass is never
		// used locally
		public void m1() {
			System.out.println("PrivateStaticInnerClass -> public m1()");
		}

		// The method m1() from the type OuterClass.PrivateStaticInnerClass is never
		// used locally
		protected void m2() {
			System.out.println("PrivateStaticInnerClass -> protected m2()");
		}

		// The method m1() from the type OuterClass.PrivateStaticInnerClass is never
		// used locally
		private void m3() {
			System.out.println("PrivateStaticInnerClass -> private m3()");
		}

		// The method m1() from the type OuterClass.PrivateStaticInnerClass is never
		// used locally
		static void m4() {
			System.out.println("PrivateStaticInnerClass -> static m3()");
		}
	}

	static class StaticInnerClass {

	}
}
