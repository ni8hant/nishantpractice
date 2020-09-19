package com.nishant.practice.forLoop;

import java.util.Scanner;

public class ReverseEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = n; i >= 0; i--) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
