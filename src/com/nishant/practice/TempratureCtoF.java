package com.nishant.practice;

import java.util.Scanner;

public class TempratureCtoF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float f = sc.nextInt();
		float c = (float) ((f - 32) * 5.0 / 9.0);

		System.out.println("Temprature in C " + c);

	}

}
