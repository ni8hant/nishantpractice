package com.nishant.practice.doWhile;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fact =1;
		do {
			fact = fact*n;
			n--;
		} while (n >= 1);
		System.out.println(fact);

	}

}
