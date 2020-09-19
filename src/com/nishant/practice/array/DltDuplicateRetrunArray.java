package com.nishant.practice.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class DltDuplicateRetrunArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine().trim());
		String[] str = br.readLine().split(" ");
		int[] arr = new int[length];
		for (int i = 0; i < str.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
		}
		System.out.println(hs);

		Arrays.sort(arr);
		int[] result = withoutDuplicate(arr);
		System.out.println(Arrays.toString(result));

	}

	private static int[] withoutDuplicate(int[] arr) {
		int j = 0;
		int[] a = new int[5];
		for (int i = 1; i < arr.length; i++) {
			if (arr[j] == arr[i]) {
				arr[i] = 0;
			}
			j++;
		}
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				a[k] = arr[i];
				k++;
			}
		}
		return arr;
	}

}
