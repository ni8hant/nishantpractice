package com.nishant.practice.array;

import java.util.Scanner;

public class Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int flag = 0, i;
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (i = 0; i < n; i++) {
			if (a[i] == 5) {
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("No. is found at loction " + i + " number is " + a[i]);
		}

	}

}
