package com.nishant.practice.forLoop;

import java.util.Scanner;

public class RhombusStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k < 2 * i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n-1; i >= 1; i--) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k < 2 * i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
