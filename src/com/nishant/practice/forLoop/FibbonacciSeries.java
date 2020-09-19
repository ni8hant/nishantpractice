package com.nishant.practice.forLoop;

import java.util.Scanner;

public class FibbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int a = 0, b = 1, sum = 0;
		System.out.print(a + " " + b + " ");

		for (int i = 1; i <= s; i++) {
			sum = a + b;
			System.out.print(sum + " ");
			a = b;
			b = sum;
		}

	}

}
