package com.nishant.practice;

import java.util.Scanner;

public class CompoundIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float p = sc.nextFloat();
		float r = sc.nextFloat();
		float t = sc.nextFloat();
		double ci;

		ci = p * (Math.pow((1 + r / 100), t));

		System.out.println("ompound Intrest is " + ci);

	}

}
