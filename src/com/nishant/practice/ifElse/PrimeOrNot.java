package com.nishant.practice.ifElse;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a;
		int flag = 0;
		for (int i = 2; i < n; i++) {
			a = n % i;
			if (a == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println(n + " not prime number");
		} else {
			System.out.println(n + "  a prime number");
		}

	}

}
