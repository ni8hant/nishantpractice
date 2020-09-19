package com.nishant.practice.forLoop;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				if (i == 0 || k == 0) {
					c = 1;
				} else {
					c = c * (i - k + 1) / k;
				}
				System.out.print(c+" ");

			}
			System.out.println();
		}
	}

}
