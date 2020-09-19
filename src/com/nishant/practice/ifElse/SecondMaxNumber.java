package com.nishant.practice.ifElse;

import java.util.Scanner;

public class SecondMaxNumber {
	public static void main(String[] args) {
		for (int i = 0; i < 15; i++) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int max1, max2;
			if (a > b && a > c) {
				if (b > c) {
					System.out.println(b + " is second max number");
				} else {
					System.out.println(c + " is the secnd max number");
				}
			} else if (b > a && b > c) {
				if (a > c) {
					System.out.println(a + " is second largest number");
				} else {
					System.out.println(c + " is second largest number");
				}
			} else if (c > a && c > b) {
				if (a > b) {
					System.out.println(a + " is second largest number");
				} else {
					System.out.println(b + " is second largest number");
				}

			}
		}
	}
}