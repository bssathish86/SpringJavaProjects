package com.java.basic.concept.JavaBasicPractice.clazz.innerclass;

public class OuterClass {

	private String strPrivate = "strPrivateOuterClass";
	protected String strProtected = "strProtectedOuterClass";
	public String strPublic = "strPublicOuterClass";
	private static final String strStaticFinal = "strStaticFinalOuterClass";
	protected static final String strProtectedStaticFinal = "strProtectedStaticFinalOuterClass";
	public static final String strPublicStaticFinal = "strPublicStaticFinalOuterClass";

	private OuterClass() {
		super();
		System.out.println("OuterClass");
	}

	public void m1() {
		System.out.println("OuterClass -> public m1()");
	}

	protected void m2() {
		System.out.println("OuterClass -> protected m2()");
	}

	private void m3() {
		System.out.println("OuterClass -> private m3()");
	}

	static void m4() {
		System.out.println("OuterClass -> static m4()");
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

	private class PrivateInnerClass {
		private String strPrivate = "strPrivatePrivateInnerClass";
		protected String strProtected = "strProtectedPrivateInnerClass";
		public String strPublic = "strPublicPrivateInnerClass";
		private static final String strStaticFinal = "strStaticFinalPrivateInnerClass";
		protected static final String strProtectedStaticFinal = "strProtectedStaticFinalPrivateInnerClass";
		public static final String strPublicStaticFinal = "strPublicStaticFinalPrivateInnerClass";

		public PrivateInnerClass() {
			System.out.println("PrivateInnerClass");
		}

		public void m1() {
			System.out.println("PrivateInnerClass -> m1()");
		}

		protected void m2() {
			System.out.println("PrivateInnerClass -> protected m2()");
		}

		private void m3() {
			System.out.println("PrivateInnerClass -> private m3()");
		}

		// The method m3 cannot be declared static; static methods can only be declared
		// in a static or top level type
		/*
		 * static void m4() { System.out.println("PrivateInnerClass -> static m4()"); }
		 */
	}

	protected class ProtectedInnerClass {
		private String strPrivate = "strPrivateProtectedInnerClass";
		protected String strProtected = "strProtectedProtectedInnerClass";
		public String strPublic = "strPublicProtectedInnerClass";
		private static final String strStaticFinal = "strStaticFinalProtectedInnerClass";
		protected static final String strProtectedStaticFinal = "strProtectedStaticFinalProtectedInnerClass";
		public static final String strPublicStaticFinal = "strPublicStaticFinalProtectedInnerClass";

		public ProtectedInnerClass() {
			System.out.println("ProtectedInnerClass");
		}

		public void m1() {
			System.out.println("ProtectedInnerClass -> m1()");
		}

		protected void m2() {
			System.out.println("ProtectedInnerClass -> protected m2()");
		}

		private void m3() {
			System.out.println("ProtectedInnerClass -> private m3()");
		}

		// The method m3 cannot be declared static; static methods can only be declared
		// in a static or top level type
		/*
		 * static void m4() { System.out.println("ProtectedInnerClass -> static m4()");
		 * }
		 */
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
}
