package com.nishant.practice;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float h = sc.nextFloat();
		float b = sc.nextFloat();
		float a;

		a = ( h * b)/2;

		System.out.println("Area : " + a);

	}

}
