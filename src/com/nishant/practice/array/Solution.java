package com.nishant.practice.array;

import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

	public static int computeClosestToZero(int[] ts) {
		// Write your code here
		// To debug: System.err.println("Debug messages...");
		if (ts.length <= 0) {
			return 0;
		}
		int[] arr = new int[ts.length];
		for (int i = 0; i < ts.length; i++) {
			if (ts[i] < 0) {
				arr[i] = -ts[i];
			} else {
				arr[i] = ts[i];
			}
		}
		int min = arr[0];
		for (int j = 1; j < ts.length; j++) {
			if (min > arr[j]) {
				min = arr[j];
			}
		}
		return min;
	}

	/* Ignore and do not change the code below */
	// #region main
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ts = new int[n];
		for (int i = 0; i < n; i++) {
			ts[i] = in.nextInt();
		}
		PrintStream outStream = System.out;
		System.setOut(System.err);
		int solution = computeClosestToZero(ts);
		System.setOut(outStream);
		System.out.println(solution);
	}
	// #endregion
}