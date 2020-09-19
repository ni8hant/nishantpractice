package com.nishant.practice.whileLoop;

import java.util.Scanner;

public class InputNumberCountNoInIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =0;
		while (n > 0) {
			n = n/10;
			i++;
			}
		System.out.println("count of the number " + i);

	}

}
