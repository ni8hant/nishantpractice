package com.nishant.practice.forLoop;

import java.util.Scanner;

public class AllCombinationOf123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				for (int k = 1; k <= 3; k++) {
					System.out.println(i + " " + j + " " + k + " ");
				}

			}
			System.out.println();
		}

	}

}
