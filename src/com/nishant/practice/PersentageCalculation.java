package com.nishant.practice;

import java.util.Scanner;

public class PersentageCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		float a = sc.nextFloat();
		
		float b = sc.nextFloat();
		
		float c = sc.nextFloat();
		
		float per = sc.nextFloat();
		
		float total = a+b+c;
		
		float result = total*per/100;
		
		System.out.println("per "+ result);
		
		
		
		

	}

}
