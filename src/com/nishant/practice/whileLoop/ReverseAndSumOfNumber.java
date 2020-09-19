package com.nishant.practice.whileLoop;

import java.util.Scanner;

public class ReverseAndSumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n, sum = 0, a, add = 0;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			sum = sum * 10 + a;
			add = add + a;
		}
		System.out.println(temp + " reverse is " + sum + " Addition is " + add);
	}

}
