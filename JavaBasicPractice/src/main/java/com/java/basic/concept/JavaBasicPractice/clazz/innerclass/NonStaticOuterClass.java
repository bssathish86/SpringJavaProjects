package com.java.basic.concept.JavaBasicPractice.clazz.innerclass;

public class NonStaticOuterClass {

	private String strPrivate = "strPrivateNonStaticOuterClass";
	protected String strProtected = "strProtectedNonStaticOuterClass";
	public String strPublic = "strPublicNonStaticOuterClass";
	private static final String strStaticFinal = "strStaticFinalNonStaticOuterClass";
	protected static final String strProtectedStaticFinal = "strProtectedStaticFinalNonStaticOuterClass";
	public static final String strPublicStaticFinal = "strPublicStaticFinalNonStaticOuterClass";

	private NonStaticOuterClass() {
		super();
		System.out.println("NonStaticOuterClass");
	}

	public NonStaticOuterClass(String strPrivate) {
		this.strPrivate = strPrivate;
	}

	public void m1() {
		System.out.println("NonStaticOuterClass -> public m1()");
	}

	protected void m2() {
		System.out.println("NonStaticOuterClass -> protected m2()");
	}

	private void m3() {
		System.out.println("NonStaticOuterClass -> private m3()");
	}

	static void m4() {
		System.out.println("NonStaticOuterClass -> static m4()");
	}

	public class NonStaticInnerClass {
		private String strPrivate = "strPrivateNonStaticInnerClass";
		protected String strProtected = "strProtectedNonStaticInnerClass";
		public String strPublic = "strPublicNonStaticInnerClass";
		private static final String strStaticFinal = "strStaticFinalNonStaticInnerClass";
		protected static final String strProtectedStaticFinal = "strProtectedStaticFinalNonStaticInnerClass";
		public static final String strPublicStaticFinal = "strPublicStaticFinalNonStaticInnerClass";

		public NonStaticInnerClass() {
			System.out.println("NonStaticInnerClass");
		}

		public void m1() {
			System.out.println("NonStaticInnerClass -> m1()");
		}

		protected void m2() {
			System.out.println("NonStaticInnerClass -> protected m2()");
		}

		private void m3() {
			System.out.println("NonStaticInnerClass -> private m3()");
		}

		// The method m3 cannot be declared static; static methods can only be declared
		// in a static or top level type
		/*
		 * static void m4() { System.out.println("NonStaticInnerClass -> static m4()");
		 * }
		 */

		public class NonStaticNestedClass {
			private String strPrivate = "strPrivateNonStaticNestedClass";
			protected String strProtected = "strProtectedNonStaticNestedClass";
			public String strPublic = "strPublicNonStaticNestedClass";
			private static final String strStaticFinal = "strStaticFinalNonStaticNestedClass";
			protected static final String strProtectedStaticFinal = "strProtectedStaticFinalNonStaticNestedClass";
			public static final String strPublicStaticFinal = "strPublicStaticFinalNonStaticNestedClass";

			public NonStaticNestedClass() {
				System.out.println("NonStaticNestedClass");
			}

			public void m1() {
				System.out.println("NonStaticNestedClass -> m1()");
			}

			protected void m2() {
				System.out.println("NonStaticNestedClass -> protected m2()");
			}

			private void m3() {
				System.out.println("NonStaticNestedClass -> private m3()");
			}

			// The method m3 cannot be declared static; static methods can only be declared
			// in a static or top level type
			/*
			 * static void m4() { System.out.println("NonStaticNestedClass -> static m4()");
			 * }
			 */
		}
	}
}
