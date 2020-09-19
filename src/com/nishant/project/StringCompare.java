package com.nishant.project;

public class StringCompare {

	public static void main(String[] args) {
		String s1 = new String("Nishant");
		String s2 = new String("Nishant");
		if (s1.equals(s2)) {
			System.out.println("String value equal");
		} else {
			System.out.println("String value not equal");

		}

		if (s1 == s2) {
			System.out.println("String value equal");
		} else {
			System.out.println("String value not equal");

		}

		StringBuffer s3 = new StringBuffer("Nishant");
		StringBuffer s4 = new StringBuffer("Nishant");
		if (s3.equals(s4)) {
			System.out.println("String value equal");
		} else {
			System.out.println("String value not equal");

		}

		if (s3 == s4) {
			System.out.println("String value equal");
		} else {
			System.out.println("String value not equal");

		}

		StringBuilder s5 = new StringBuilder("Nishant");
		StringBuilder s6 = new StringBuilder("Nishant");
		if (s5.equals(s6)) {
			System.out.println("String value equal");
		} else {
			System.out.println("String value not equal");

		}

		if (s5 == s6) {
			System.out.println("String value equal");
		} else {
			System.out.println("String value not equal");

		}

	}

}
