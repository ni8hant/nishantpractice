package com.nishant.practice;

import java.util.Scanner;

public class GrossCalcualtion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basic salary : ");
		int bs = sc.nextInt();
		int da, hra, gs;
		if (bs >= 5000) {
			da = (2 * bs) / 100;
			hra = (3 * bs) / 100;
		} else {
			da = (1 * bs) / 100;
			hra = 200;
		}
		gs = bs + da + hra;
		System.out.println("Gross salary = " + gs);
		sc.close();
	}

}
