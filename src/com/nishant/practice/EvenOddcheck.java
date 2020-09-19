package com.nishant.practice;

import java.util.Scanner;

public class EvenOddcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + " is even number");
		} else {
			System.out.println(num + " is odd number");
		}

	}

}
