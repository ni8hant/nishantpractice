package com.nishant.practice;

import java.util.Scanner;

public class SwappingOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int b = sc.nextInt();

		int c;

		c = a;
		a = b;
		b = c;

		System.out.println("Interchanged number : " + a + " other number " + b);

	}

}
