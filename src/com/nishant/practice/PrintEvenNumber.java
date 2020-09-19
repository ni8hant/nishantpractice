package com.nishant.practice;

import java.util.Scanner;

public class PrintEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = sum + 2;
			System.out.print(sum + " ");
		}
		System.out.println();
		int i = 0;
		while (i <= n) {
			i = i + 2;
			System.out.print(i + " ");
		}

	}

}
