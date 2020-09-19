package com.nishant.practice;

import java.util.Scanner;

public class FactriolOfAnyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int fact = 1, j = 1;
		while (j <= i) {
			fact = (fact) * (j);
			j++;
		}
		System.out.println(fact);
	}

}
