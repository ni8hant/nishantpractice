package com.nishant.practice;

import java.util.Scanner;

public class AreaAndPerimeterofRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		float l = sc.nextFloat();

		float b = sc.nextFloat();

		float a = l * b;

		float p = 2 * (l + b);

		System.out.println("Area : " + a + " Perameter p : " + p);

	}

}
