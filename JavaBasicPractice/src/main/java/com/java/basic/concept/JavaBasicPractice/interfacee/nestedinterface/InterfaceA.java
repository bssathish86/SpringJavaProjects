package com.java.basic.concept.JavaBasicPractice.interfacee.nestedinterface;

// By default interface public, abstract..
public interface InterfaceA {

	public void m1();

	default void m2() {
		System.out.println("interface InterfaceA -> default method m2 ()");
	}

	static void m3() {
		System.out.println(" interface InterfaceA -> static method m3 ()");
	}

	public static interface InterfaceAB {

		public void m1();

		default void m2() {
			System.out.println(" inner Static InterfaceAB -> default method m2 ()");
		}

		public interface InterfaceABC {

			public void m1();

			default void m2() {
				System.out.println("Nested InterfaceABC -> default method m2 ()");
			}
		}
	}

	public class ClassD {

		public void m1() {
			System.out.println("inner Class ClassJ -> public method m1 ()");
		}

		private void m2() {
			System.out.println("inner Class ClassJ -> private method m2 ()");
		}

		public interface ClassDInterfaceE {

			public void m1();

			default void m2() {
				System.out.println("Nested public interface ClassDInterfaceE -> default method m2 ()");
			}
		}

		// Only interface inside class can be protected access specifier
		protected interface ClassDInterfaceF {

			public void m1();

			default void m2() {
				System.out.println("Nested protected interface ClassDInterfaceF -> default method m2 ()");
			}
		}

		private interface ClassDInterfaceG {

			public void m1();

			default void m2() {
				System.out.println("Nested private interface ClassDInterfaceG -> default method m2 ()");
			}
		}

		public static class ClassDClassH {

			public void m1() {
				System.out.println("Nested inner Static Class ClassDClassH -> public method m1 ()");
			}

			// The method m2() from the type InterfaceA.ClassJ is never used
			// locally
			private void m2() {
				System.out.println("Nested inner Static Class ClassDClassH  -> private method m2 ()");
			}

			static void m3() {
				System.out.println("Nested inner Static Class ClassDClassH  -> static method m3 ()");
			}
		}

		public class ClassDClassI {

			public void m1() {
				System.out.println("Nested inner Class ClassDClassI -> public method m1 ()");
			}

			// The method m2() from the type InterfaceA.ClassJ is never used
			// locally
			private void m2() {
				System.out.println("Nested inner Class ClassDClassI  -> private method m2 ()");
			}

			// The method m3 cannot be declared static; static methods can only be declared
			// in a static or top level type
			/*
			 * static void m3() {
			 * System.out.println("Nested inner Class ClassDClassI -> static method m3 ()");
			 * }
			 */
		}
	}

	public static class ClassJ {

		public void m1() {
			System.out.println("inner Class ClassJ -> public method m1 ()");
		}

		// The method m2() from the type InterfaceA.ClassJ is never used
		// locally
		private void m2() {
			System.out.println("inner static Class ClassJ -> private method m2 ()");
		}

		static void m3() {
			System.out.println("inner static Class ClassJ -> static method m3 ()");
		}

		public interface ClassDInterfaceK {

			public void m1();

			default void m2() {
				System.out.println("Nested static class interface ClassDInterfaceK -> default method m2 ()");
			}
		}

		public class ClassDClassL {

			public void m1() {
				System.out.println("Nested Static Class Class ClassDClassL -> public method m1 ()");
			}

			// The method m2() from the type InterfaceA.ClassJ.ClassDClassL is never
			// used locally
			private void m2() {
				System.out.println("Nested Static Class Class ClassDClassL -> private method m2 ()");
			}

			// The method m3 cannot be declared static; static methods can only be declared
			// in a static or top level type
			/*
			 * public static void m3() { System.out.
			 * println("Nested Static Class Class ClassDClassL -> static method m3 ()"); }
			 */
		}
	}
}
