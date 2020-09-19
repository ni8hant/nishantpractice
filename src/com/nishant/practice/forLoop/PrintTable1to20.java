package com.nishant.practice.forLoop;

import java.util.Scanner;

public class PrintTable1to20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 10; j++) {
				int k = i * j;
				System.out.print(k+" ");
			}
			System.out.println();

		}

	}

}
