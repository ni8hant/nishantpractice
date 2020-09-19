package com.nishant.practice.forLoop;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = n; i >= 0; i--) {
			System.out.print(i + " ");
		}

	}

}
