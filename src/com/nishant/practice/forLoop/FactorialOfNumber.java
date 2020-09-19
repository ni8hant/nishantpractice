package com.nishant.practice.forLoop;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= s; i++) {
			fact = fact * i;
		}
		System.out.println(fact + " ");

	}

}
