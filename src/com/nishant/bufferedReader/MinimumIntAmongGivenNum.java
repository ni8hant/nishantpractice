package com.nishant.bufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MinimumIntAmongGivenNum {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		String[] arr_arr = br.readLine().split(" ");
		int[] arr = new int[n];
		for (int i_arr = 0; i_arr < arr_arr.length; i_arr++) {
			arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
		}
		int out_ = findIt(n,arr);
		wr.println(out_);

		wr.close();
		br.close();

	}

	static int findIt( int n,int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
              min = arr[i];
			}
		}
		return min;
	}

}
