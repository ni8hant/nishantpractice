package com.nishant.practice;

import java.util.Scanner;

public class CheckCapaitalOrSmallNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character");
		char ch = sc.next().charAt(0);
		if (ch >= 65 && ch <= 90) {
			System.out.println("Capital letter");
		} else {
			System.out.println("Small letter");
		}
	}

}
