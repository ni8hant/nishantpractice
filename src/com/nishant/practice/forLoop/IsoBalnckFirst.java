package com.nishant.practice.forLoop;

import java.util.Scanner;

public class IsoBalnckFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			for (int j = i; j <= n - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print(k );
			}
			System.out.println();
		}

	}

}
