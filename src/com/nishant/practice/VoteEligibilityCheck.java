package com.nishant.practice;

import java.util.Scanner;

public class VoteEligibilityCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age : ");
		int s = sc.nextInt();
		if (s >= 18) {
			System.out.println("You can vote");

		} else {
			System.out.println("You can not vote");
		}
		sc.close();
	}

}
