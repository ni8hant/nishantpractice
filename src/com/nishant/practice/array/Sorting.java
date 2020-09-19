package com.nishant.practice.array;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int i, temp;
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (i = 0; i < n; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		for (i = 0; i < n; i++) {
			System.out.print(a[i]);
		}

	}

}
