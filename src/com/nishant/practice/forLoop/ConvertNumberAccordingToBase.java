package com.nishant.practice.forLoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ConvertNumberAccordingToBase {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine().trim());
		int base = Integer.parseInt(br.readLine().trim());
		conevertTo(num, base);
		conevertToArray(num, base);

	}

	private static void conevertTo(int num, int base) {
		ArrayList<Integer> list = new ArrayList<>();

		while (num > 0) {
			int result = num % base;
			num = num / base;
			list.add(result);

		}
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.print(list.get(i));
		}
	}

	private static void conevertToArray(int num, int base) {
		System.out.println();
		int[] a = new int[5];
		int k = 0;
		while (num > 0) {
			int result = num % base;
			num = num / base;
			a[k] = result;
			k++;
		}

		for (int i = a.length - 2; i >= 0; i--) {
			System.out.print(a[i]);
		}

	}

}
