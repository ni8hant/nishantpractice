package com.nishant.practice.forLoop;

import java.util.Scanner;

public class IsoTriNumthenBlank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = n; i >= 0; i--) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
