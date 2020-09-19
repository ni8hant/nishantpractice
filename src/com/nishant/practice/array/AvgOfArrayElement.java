package com.nishant.practice.array;

import java.util.Scanner;

public class AvgOfArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		double avg = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			avg = avg + a[i];
		}
		System.out.println(avg / (a.length));
		
	}

}
