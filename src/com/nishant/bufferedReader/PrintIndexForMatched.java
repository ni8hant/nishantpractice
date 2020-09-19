package com.nishant.bufferedReader;

import java.util.Arrays;

public class PrintIndexForMatched {

	public static void main(String[] args) {
		int[] input = { 2, 5, 7, 6, 8 };
		int a = 8;
		int[] result = output(a, input);
		System.out.println(Arrays.toString(result));
	}

	private static int[] output(int a, int[] input) {
		int[] output = new int[2];
		int start = -1;
		int end = -1;

		for (int loop = 0; loop < input.length; loop++) {
			if (a == input[loop] && start == -1) {
				start = loop;
				end = loop;
			}
			if (a == input[loop] && end != -1) {
				end = loop;
			}
		}
		output[0] = start;
		output[1] = end;

		return output;
	}

}
