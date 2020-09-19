package com.nishant.project;

public class IndicesInArray {

	public static void main(String[] args) {
		int[] array = { 2, 4, 1, 5, 6, 3, 7, 8 };

		checkIndices(array, 0);
	}

	private static void checkIndices(int[] array, int j) {
		for (int i = 1; i < array.length; i++) {

			int temp = array[i] + array[j];
			for (int k = 1; k < array.length - 1; k++) {

				if (temp == array[k]) {
					System.out.println(j + " ," + i + " ," + k);
					break;

				}

			}

		}
		j = j + 1;
		if (j < array.length) {
			checkIndices(array, j);
		}

	}

}
