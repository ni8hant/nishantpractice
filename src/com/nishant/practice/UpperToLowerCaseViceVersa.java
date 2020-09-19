package com.nishant.practice;

import java.util.Scanner;

public class UpperToLowerCaseViceVersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if (ch >= 65 && ch <= 90) {

			System.out.println((char) (ch + 32));
		} else {
			System.out.println((char) (ch - 32));
		}

		/*int ch = sc.nextInt();
		if (ch >= 65 && ch <= 90) {
			ch = ch + 32;
			char c = (char) ch;
			System.out.println(c);
			System.out.println((char) (ch + 32));
		} else {
			System.out.println((char) (ch - 32));
		}*/

	}

}
