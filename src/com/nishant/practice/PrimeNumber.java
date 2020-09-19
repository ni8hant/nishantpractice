package com.nishant.practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int temp = 0;
		int m =0;
		for (int i = 2; i <= num / 2; i++) {
			 m = num % i;
		}
		if (temp == m) {
			System.out.println(num + "is not a prime number");
		} else {
			System.out.println(num + "is a prime number");
		}
	}

}
