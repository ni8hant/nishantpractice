package com.nishant.practice.doWhile;

import java.util.Scanner;

public class PrintName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.nextLine();
		String a = sc.nextLine();
		do {
			System.out.println(a);
			n++;
		} while (n <= 10);

	}

}
