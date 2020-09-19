package com.nishant.practice;

import java.util.Scanner;

public class VowelCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println(ch + " is a Vowel");
		} else {
			System.out.println(ch + "is a Consonent");
		}

	}
}