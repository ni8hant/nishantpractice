package com.nishant.practice;

import java.util.Scanner;

public class BonusCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int jonning = sc.nextInt();
		int currentYear = sc.nextInt();
		int result = currentYear - jonning;
		if (result > 3) {
			System.out.println("Bonus is " + 1000);
		} else {
			System.out.println("Bonus is " + 500);
		}
		sc.close();
	}

}
