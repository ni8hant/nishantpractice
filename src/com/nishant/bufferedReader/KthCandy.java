package com.nishant.bufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KthCandy {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(br.readLine().trim());
		String arr[] = br.readLine().split(" ");
		int[] input = new int[i];
		for (int i_arr = 0; i_arr < arr.length; i_arr++) {
			input[i_arr] = Integer.parseInt(arr[i_arr]);
		}

		String result = kthCandy(i, input);
		System.out.println(result);

	}

	private static String kthCandy(int i, int[] input) {
		// TODO Auto-generated method stub
		return null;
	}

}
