package com.nishant.practice;

import java.util.Scanner;

public class PercenrageCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int p = sc.nextInt();
		int c = sc.nextInt();
		int total = m + p + c;
		int per = (total/3);
		if (per >= 60) {
			System.out.println(per + " 1St division");
		} else if (per >= 48 && per < 60) {
			System.out.println(per + " 2nd division");
		} else if (per >= 48 && per < 36) {
			System.out.println(per + " 3rd Division");
		} else {
			System.out.println(per + " fail");
		}

	}

}
