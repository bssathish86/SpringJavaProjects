package com.java.basic.concept.JavaBasicPractice.eenum;

public enum CurrencyEnumWithMethod {

	PENNY(1) {
		@Override
		public String color() {
			return "copper";
		}
	},
	NICKLE(5) {
		@Override
		public String color() {
			return "bronze";
		}
	},
	DIME(10) {
		@Override
		public String color() {
			return "silver";
		}
	},
	QUARTER(25) {
		@Override
		public String color() {
			return "silver";
		}
	};

	private int value;

	// You can define abstract methods inside Enum in Java and can also provide a
	// different implementation for different instances of enum in java.
	public abstract String color();

	private CurrencyEnumWithMethod(int value) {
		this.value = value;
	}
}
