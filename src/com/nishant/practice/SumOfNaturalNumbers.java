package com.nishant.practice;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0, i = 1;
		while (i <= n) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum + " ");
	}

}
