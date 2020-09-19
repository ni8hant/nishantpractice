package com.nishant.practice.forLoop;

import java.util.Scanner;

public class TriangularBlankWIthAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		for (int i = c; i >= 65; i--) {
			for (int j = 65; j <= i; j++) {
				System.out.print((char) j );
			}
			System.out.println();
		}
		for (int i = c; i >= 65; i--) {
			for (int j = i; j < c; j++) {
				System.out.print(" ");
			}
			for (int k = i; k >= 65; k--) {
				System.out.print((char) k);
			}
			System.out.println();
		}

	}

}
