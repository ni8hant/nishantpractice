package com.nishant.practice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String args[])  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a, sum = 0, temp;
		temp = n;

		while (n > 0) {
			a = n % 10;
			n = n / 10;
			sum = sum + a * a * a;

		}
		if (temp == sum) {
			System.out.println(temp + " is armstrong number");

		} else {
			System.out.println(temp + " is not an armstrong number");
		}
	}
}
