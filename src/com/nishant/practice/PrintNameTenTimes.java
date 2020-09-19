package com.nishant.practice;

import java.util.Scanner;

public class PrintNameTenTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		Scanner scs = new Scanner(System.in);
		String str = scs.nextLine();
		while (i <= n) {
			System.out.println(str + " ");
			i = i + 1;
		}

	}
}
