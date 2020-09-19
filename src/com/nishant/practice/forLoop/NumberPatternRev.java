package com.nishant.practice.forLoop;

import java.util.Scanner;

public class NumberPatternRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		for (int i = s; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}

	}

}
