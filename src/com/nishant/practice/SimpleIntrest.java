package com.nishant.practice;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		float p = sc.nextInt();
		float r = sc.nextInt();
		float t = sc.nextInt();

		float i = (p * r * t) / 100;

		System.out.println("Intrest : " + i);

	}

}
