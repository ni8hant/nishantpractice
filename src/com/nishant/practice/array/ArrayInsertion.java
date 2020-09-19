package com.nishant.practice.array;

import java.util.Scanner;

public class ArrayInsertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Dimention of array");
		int n = sc.nextInt();
		System.out.println("Position of new number");
		int position = sc.nextInt();
		System.out.println("New Number");
		int newNumber = sc.nextInt();
		int i = 0;
		int a[] = new int[100];
		System.out.println("Array Before insertion ");
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();

		}

		for (i = n - 1; i >= position; i--) {
			a[i + 1] = a[i];
		}

		a[position] = newNumber;
		n = n + 1;
		for (i = 0; i < n; i++) {
			System.out.print(a[i]);
		}

	}

}
