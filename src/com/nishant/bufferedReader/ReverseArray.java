package com.nishant.bufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseArray {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(br.readLine().trim());
		String[] arr = br.readLine().split(" ");
		String[] res = new String[i];
		for (int j = 0; j < arr.length; j++) {

			res[j] = arr[i - 1 - j];
			System.out.print(res[j] + " ");
		}

	}
	


}
