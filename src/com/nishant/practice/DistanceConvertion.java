package com.nishant.practice;

import java.util.Scanner;

public class DistanceConvertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float km = sc.nextFloat();

		float m, cm, inch, feet;

		m = km * 1000;
		cm = m * 100;
		inch = cm / 2.54f;
		feet = inch / 12;

		System.out.println("Distance " + m + "meter " + cm + "Centimeter " + inch + "inch " + feet + "feet");
	}

}
