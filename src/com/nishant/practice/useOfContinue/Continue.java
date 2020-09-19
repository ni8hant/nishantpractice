package com.nishant.practice.useOfContinue;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int j = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i == j)
				continue;
			System.out.println(i);

		}
	}

}
