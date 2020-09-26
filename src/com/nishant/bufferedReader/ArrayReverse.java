package com.nishant.bufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(br.readLine().trim());
		String arr[] = br.readLine().split(" ");
		int[] input = new int[i];
		for (int i_arr = 0; i_arr < arr.length; i_arr++) {
			input[i_arr] = Integer.parseInt(arr[i_arr]);
		}
		System.out.println( "Int array "+ Arrays.toString(input) );
		String str = reverse(i,input);
		System.out.println(str);
		
		System.out.println("String array "+ Arrays.toString(arr));
		String strs = reverse(i,arr);
		System.out.println(strs);

	}

	private static String reverse(int i, String[] arr) {
		String[] res = new String[i];
		for(int j = 0;j < i;j++) {
			res[j] = arr[i-1-j];
			System.out.print(res[j] + " ");
		}
		System.out.println();

		return Arrays.toString(res);
	}

	private static String reverse(int i, int[] input) {
		int[] res = new int[i];
		for(int j = 0;j < i;j++) {
			res[j] = input[i-1-j];
			System.out.print(res[j] + " ");
		}
		System.out.println();

		return Arrays.toString(res);
	}

}
