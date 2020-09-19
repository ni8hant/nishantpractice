package com.nishant.practice.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ConcatenateCharacters {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		String[] arr_arr = br.readLine().split(" ");
		char[] arr = new char[n];
		for (int i_arr = 0; i_arr < arr_arr.length; i_arr++) {
			arr[i_arr] = arr_arr[i_arr].charAt(0);
		}
		String out_ = findIt(arr, n);
		wr.println(out_);

		wr.close();
		br.close();

	}

	static String findIt(char[] arr, int n) {
		String result = "";
		/*for (int i = 0; i < arr.length; i++) {
			result = result+String.valueOf(arr[i]);
	 	}*/

		for (int i = 0; i < arr.length; i++) {
			result = result+arr[i];
	 	}
	
		/*result = arr.toString();
		String s = result.replaceAll(" ", "");*/
		return result;

	}

}
