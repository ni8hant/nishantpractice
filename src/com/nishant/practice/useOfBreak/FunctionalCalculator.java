package com.nishant.practice.useOfBreak;

import java.util.Scanner;

public class FunctionalCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		char c = sc.next().charAt(0);
		int r = 0;
		switch (c) {
		case '+':
			r = a + b;
			break;
		case '-':
			r = a - b;
			break;
		case '*':
			r = a * b;
			break;
		case '/':
			r = a / b;
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
		System.out.println(r);
	}

}
