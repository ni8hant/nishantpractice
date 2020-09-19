package com.test.date;

public class CheckReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String descrtption = "nishant null kumar";
		String abc = null;
		int x = 0;
		int y = 3;

		System.out.println(descrtption.replaceAll("null", (x > y ? "NA" : "Nishant Kumar")));

		System.out.println(descrtption.replaceAll(" ", ""));

	}

}
