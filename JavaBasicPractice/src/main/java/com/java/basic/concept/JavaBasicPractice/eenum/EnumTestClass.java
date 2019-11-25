package com.java.basic.concept.JavaBasicPractice.eenum;

public class EnumTestClass {

	public static void main(String[] args) {

		/*
		 * System.out.println("CurrencyEnumWithMethod"); for (CurrencyEnumWithMethod cc
		 * : CurrencyEnumWithMethod.values()) { System.out.println(cc + "-> color : " +
		 * cc.color()); }
		 */
		System.out.println(".... CurrencyEnumImplementsInterface ....");
		for (CurrencyEnumImplementsInterface cc : CurrencyEnumImplementsInterface.values()) {
			CurrencyEnumImplementsInterface ss = cc;
			System.out.println(ss == cc);
		}
	}
}
