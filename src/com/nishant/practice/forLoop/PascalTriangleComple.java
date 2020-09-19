package com.nishant.practice.forLoop;

public class PascalTriangleComple {

	public static void printPascal(int n) {
		for (int i = 1; i <= n; i++) {
			for (int k = i; k <= n; k++) {
				System.out.print(" ");
			}

			int c = 1;// used to represent C(i, j)
			for (int j = 1; j <= i; j++) {
				// The first value in a line is always 1
				System.out.print(c + " ");
				c = c * (i - j) / j;
			}
			System.out.println();
		}
	}

	// Driver code
	public static void main(String[] args) {
		int n = 6;
		printPascal(n);
	}
}
