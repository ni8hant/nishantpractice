package com.nishant.practice.forLoop;

import java.util.Scanner;

public class IsoTriConstantNumWithRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
