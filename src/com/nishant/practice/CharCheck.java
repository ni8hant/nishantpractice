package com.nishant.practice;

import java.util.Scanner;

public class CharCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 10; i++) {
			Scanner sc = new Scanner(System.in);
			char c = sc.next().charAt(0);
			if (c >= 65 && c <= 90) {
				System.out.println(c + "  is Capital letter");
			} else if (c >= 97 && c <= 122) {
				System.out.println(c + " is small letter");
			} else if (c >= 48 && c <= 57) {
				System.out.println(c + " is digit");
			} else {
				System.out.println(c + " is special symbol");
			}

		}
	}
}
