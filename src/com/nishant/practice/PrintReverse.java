package com.nishant.practice;

import java.util.Scanner;

public class PrintReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i = n; i > 0; i--) {
            System.out.print(i);
            System.out.print(" ");
		}

	}

}
