package com.nishant.practice.array;

public class ArrayDeletion {
	public static void main(String[] args) {

		int a[] = { 2, 5, 6, 7 };
		int position = 1, n = 4;

		for (int i = position; i < a.length-1; i++) {
			a[i] = a[i + 1];
		}
		for (int i = 0; i < a.length - 1; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
