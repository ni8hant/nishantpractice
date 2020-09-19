package com.nishant.hakerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class SockMerchant {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {
		int pair = 0;
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			if (!set.contains(ar[i])) {
				set.add(ar[i]);
			} else {
				set.remove(ar[i]);
				pair++;
			}
		}
		return pair;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		String[] arItems = br.readLine().split(" ");
		int[] ar = new int[n];

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = sockMerchant(n, ar);

		System.out.println(result);

		br.close();
	}
}
