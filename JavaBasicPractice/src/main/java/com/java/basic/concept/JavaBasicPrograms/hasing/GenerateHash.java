package com.java.basic.concept.JavaBasicPrograms.hasing;

import com.java.basic.concept.JavaBasicPrograms.iint.Convert32BitInteger;

public class GenerateHash {

	public static void main(String[] args) {

		String key = "KING";
		int hash = 0, newHash = 0, digits = 16;

		System.out.println("Key original value : " + Integer.MAX_VALUE);
		System.out.println("Key hash value : " + Convert32BitInteger.intToString(Integer.MAX_VALUE, digits));
		System.out.println("Key hash value : " + (Integer.MAX_VALUE >>> 16));
		System.out.println("Key hash value : " + Convert32BitInteger.intToString((Integer.MAX_VALUE >>> 16), digits));
		newHash = (2147483647 ^ (Integer.MAX_VALUE >>> 16));
		System.out.println("Key original value : " + newHash);
		System.out.println("Key hash value : " + Convert32BitInteger.intToString(newHash, digits));

		System.out.println("Key hash value : " + key.hashCode());
		System.out.println("Key hash value : " + Convert32BitInteger.intToString(key.hashCode(), digits));
		System.out.println("Key hash value : " + (key.hashCode() >>> 16));
		System.out.println("Key hash value : " + Convert32BitInteger.intToString((key.hashCode() >>> 16), digits));
		hash = (key == null) ? 0 : ((hash = key.hashCode()) ^ (hash >>> 16));
		System.out.println("Key hash value : " + hash);
		System.out.println("Key hash value : " + Convert32BitInteger.intToString(hash, digits));

		/*
		 * for (int i = 1; i <= 16; i++) {
		 * 
		 * System.out.println("Key hash value : " + Integer.toUnsignedString((hash >>>
		 * i), 2)); Convert32BitInteger.intToString(hash >>> i, 2); newHash = hash >>>
		 * i; System.out.println("Key hash value : " + newHash); }
		 */
	}
}
