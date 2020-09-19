package com.nishant.practice.forLoop;

import java.util.Scanner;

public class PatternBlankFirstDecreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = n; i >= 1; i--) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			System.out.println();

		}

	}

}
