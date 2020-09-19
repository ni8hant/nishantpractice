package com.nishant.practice.whileLoop;

import java.util.Scanner;

public class SumOfEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = 2 * n;
		int i = 1, sum = 0;
		while (i <= m) {
			if (i % 2 == 0) {
				sum = sum + i;
				i++;
			} else {
				i++;
			}

		}
		System.out.println(sum);
/*
		int i = 0, n = 23, sum = 0;
		while (i < n) {
			sum = sum + i;
			i = i + 2;
		}
		System.out.println(sum);*/
	}

}
