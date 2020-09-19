package com.nishant.practice.whileLoop;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a, temp = n, sum = 0;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			sum = sum * 10 + a;
		}
		if (sum == temp) {
			System.out.println(temp + " is palindrom number");
		} else {
			System.out.println(temp + " not a palindron number");
		}
	}

}
