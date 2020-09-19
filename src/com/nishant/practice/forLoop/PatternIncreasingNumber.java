package com.nishant.practice.forLoop;

import java.util.Scanner;

public class PatternIncreasingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(k);
				k++;

			}
			System.out.println();

		}
	}

}
