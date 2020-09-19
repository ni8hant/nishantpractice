package com.nishant.practice;

import java.util.Scanner;

public class PrintAtoZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		char c1 = 90;
		while (c <= c1) {
			System.out.print(c + " ");
			c++;
		}

	}

}
