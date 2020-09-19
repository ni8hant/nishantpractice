package com.nishant.practice.array;

import java.util.Scanner;

public class FindMaxNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		// int[] a = { 5, 6, 48, 5 };
		int i, max = 0;
		for (i = 0; i < n; i++) {
              a[i] = sc.nextInt();
		}
		for (i = 0; i < n; i++) {
			if (a[i] > max) {
				max = a[i];
			}

		}
		System.out.println(max);

	}

}
