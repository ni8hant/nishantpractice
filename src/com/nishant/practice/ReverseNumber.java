package com.nishant.practice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int sum = 0;

		while (num > 0) {
			int a = num % 10;
			num = num / 10;
			sum = sum * 10 + a;

		}
		System.out.println(sum);
	}
}
