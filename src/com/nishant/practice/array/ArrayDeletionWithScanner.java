package com.nishant.practice.array;

import java.util.Scanner;

public class ArrayDeletionWithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the position for delete the array");
		int pos = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = pos; i < n - 1; i++) {
			a[i] = a[i + 1];
		}
        
		for (int i = 0; i < a.length-1; i++) {
			System.out.println(a[i]);
		}

	}

}
