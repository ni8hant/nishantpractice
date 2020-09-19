package com.nishant.practice.strings;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String temp = s;
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);
		}
		if (rev.equalsIgnoreCase(temp) ) {
			System.out.println(rev + " Palindrom string " + temp);
		} else {
			System.out.println(rev + " Not a palindrom " + temp);
		}

	}

}
