package com.nishant.practice.whileLoop;

import java.util.Scanner;

public class MaximunInNnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 0, val, max = 0;
		while (i <= n) {
			val = sc.nextInt();
			if (max < val) {
				max = val;
			}
			i++;
		}
		System.out.println(max);

	}

}
