package com.nishant.practice.forLoop;

import java.util.Scanner;

public class IsoscelesRightAngleTriangleABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char n = sc.next().charAt(0);
		for (int i = n; i >= 65; i--) {
			for (int j = 65; j <= i; j++) {
				System.out.print((char) j + " ");
			}
			System.out.println();
		}

	}

}
