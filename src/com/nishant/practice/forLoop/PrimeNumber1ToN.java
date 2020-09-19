package com.nishant.practice.forLoop;

import java.util.Scanner;

public class PrimeNumber1ToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, j;
		for (j = 1; j <= n; j++) {
			for (i = 2; i < j; i++) {
				if (j % i == 0) {
					break;
				}
			}
			if (j == i) {
				System.out.println(j);
			}
		}

		printPrime(n);

	}

	private static void printPrime(int n) {
		boolean isPrime = true;
		for (int i = 1; i < n; i++) {
			int j = 2;
			while (j <= i / 2) {
				if (j % i == 0) {
					isPrime = false;
				}
			}
			j++;
			if (isPrime && i!= 1 && i != n) {
				System.out.println(i);

			}
		}

	}
}
