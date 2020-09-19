package com.nishant.practice;

import java.util.Scanner;

public class CheckNumberIsNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n >= 0) {
			System.out.println("Number is positive");
		} else {
			System.out.println("Number is negative");
		}

	}

}
