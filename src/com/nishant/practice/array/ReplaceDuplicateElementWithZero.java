package com.nishant.practice.array;

import java.util.Scanner;

public class ReplaceDuplicateElementWithZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter Array");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++)
				if (a[i] == a[j]) {
					a[j] = 0;
				}
		}

		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}

	}

}
