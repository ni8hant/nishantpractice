package com.nishant.practice.forLoop;

import java.util.Scanner;

public class AtoZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char s = sc.next().charAt(0);
		for (int i = 65; i <= 90; i++) {
			System.out.print(s + " ");
			s++;
		}

	}

}
