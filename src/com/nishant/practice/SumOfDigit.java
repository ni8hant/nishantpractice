package com.nishant.practice;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a, sum = 0;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			sum = sum + a;

		}
		System.out.println("Sum of digit " + sum);

	}

}
