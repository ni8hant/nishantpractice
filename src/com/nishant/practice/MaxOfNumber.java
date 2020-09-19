package com.nishant.practice;

import java.util.Scanner;

public class MaxOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if (m > n) {
			System.out.println(m + " m value is greater than " + n);
		} else {
			System.out.println(n + " value of n is greater than " + m);
		}
      sc.close();
	}

}
