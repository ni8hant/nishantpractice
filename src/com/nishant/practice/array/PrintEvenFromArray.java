package com.nishant.practice.array;

import java.util.Scanner;

public class PrintEvenFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}

	}

}
