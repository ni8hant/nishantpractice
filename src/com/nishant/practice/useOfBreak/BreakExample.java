package com.nishant.practice.useOfBreak;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int j = s.nextInt();
		for (int i = 1; i <= 10; i++) {
			if (i == j)
				break;
			System.out.println(i);
		}

	}

}
