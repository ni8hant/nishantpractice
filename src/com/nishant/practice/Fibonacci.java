package com.nishant.practice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1, j = 0, k = 1;
		System.out.print(j + " " + k);
		while (i <= n) {
			int s = j + k;
			System.out.print(" " + s);
			j = k;
			k = s;
			i++;

		}

	}

}
