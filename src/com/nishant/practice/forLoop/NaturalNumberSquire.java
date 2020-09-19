package com.nishant.practice.forLoop;

import java.util.Scanner;

public class NaturalNumberSquire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		for (i = 1; i <= n; i++) {
			int a = i * i;
			System.out.print(a + " ");

		}

	}

}
