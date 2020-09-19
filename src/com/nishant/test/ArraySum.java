package com.nishant.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArraySum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = br.readLine().split(" ");
		int[] input = new int[arr.length];
		for (int i_arr = 0; i_arr < arr.length; i_arr++) {
			input[i_arr] = Integer.parseInt(arr[i_arr]);
		}

		String arr2[] = br.readLine().split(" ");
		int[] input2 = new int[arr2.length];

		for (int i_arr = 0; i_arr < arr2.length; i_arr++) {
			input2[i_arr] = Integer.parseInt(arr2[i_arr]);
		}

		System.out.println("Int array " + Arrays.toString(input));
		int[] result = SumArray(input, input2);
		System.out.println(Arrays.toString(result));

	}

	private static int[] SumArray(int[] input, int[] input2) {
		int firstArrayLen = input.length;
		int secondArrayLen = input2.length;

		if (firstArrayLen > secondArrayLen) {
			int[] result = new int[firstArrayLen];
			for (int i = 0; i < firstArrayLen; i++) {
				if (i < secondArrayLen) {
					result[i] = input[i] * 10 + input2[i];
				} else {
					result[i] = input[i] * 10;
				}
			}
			return result;
		} else if (firstArrayLen == secondArrayLen) {
			int[] result = new int[firstArrayLen];
			for (int i = 0; i < firstArrayLen; i++) {
				result[i] = input[i] * 10 + input2[i];
			}
			return result;

		} else {
			int[] result = new int[secondArrayLen];
			for (int i = 0; i < secondArrayLen; i++) {
				if(i < firstArrayLen) {
					result[i] = input[i] * 10 + input2[i];
				}else {
					result[i] =  input2[i] ;

				}
			}
			return result;
		}

	}

}
