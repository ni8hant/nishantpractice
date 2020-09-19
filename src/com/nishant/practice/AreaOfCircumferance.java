package com.nishant.practice;

import java.util.Scanner;

public class AreaOfCircumferance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float r = sc.nextFloat();
		float cir, a;

		a = (float) (2 * 3.14 * r *r);

		cir = (float) (2 * (3.14) * r);
		
		System.out.println("Area " + a +" circumferance " + cir);

	}

}
