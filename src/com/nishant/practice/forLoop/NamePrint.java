package com.nishant.practice.forLoop;

import java.util.Scanner;

public class NamePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//skip by program because This line you have to add (It consumes the "\n" character)
		String s = sc.nextLine();
		String s1 = sc.nextLine();
		// String s = sc.nextLine();

		for (int i = 0; i <= n; i++) {
			System.out.println(s1 + " ");
		}

	}

}
