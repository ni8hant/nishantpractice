package com.nishant.practice.array;

public class DeleteDuplicateFromArray {

	public static void main(String[] args) {

		int a[] = { 2, 3, 2, 4, 3, 6, 7 };
		int b[] = new int[10];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				if (a[i] == a[j]) {
					a[j] = 0;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				b[k] = a[i];
				k++;
			}
		}
		for (int i = 0; i < k; i++) {
			System.out.print(b[i]+" ");
		}
	}

}
