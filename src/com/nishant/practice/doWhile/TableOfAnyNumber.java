package com.nishant.practice.doWhile;

import java.util.Scanner;

public class TableOfAnyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =1;
		do {
			int a = n*i;
			System.out.println(a);
			i++;
		} while (i <= 10);

	}

}
