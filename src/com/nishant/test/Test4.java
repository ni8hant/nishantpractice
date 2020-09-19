package com.nishant.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

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

		String[] result = mergeArrays(input, input2);

		for (int j = 0; j < result.length; j++) {
			System.out.print(result[j] + " ");
		}

	}

	public static String[] mergeArrays(int[] a, int[] b) {
		String[] array;

		if (a.length > b.length) {
			array = new String[a.length];
		} else {
			array = new String[b.length];
		}
		String append = "";
		for (int i = 0; i < array.length; i++) {
			if ((i < a.length) && (i < b.length)) {
				append = a[i] + "" + b[i];
			}
			if ((i >= a.length) && (i <= b.length)) {
				append = 0 + "" + b[i];
			}
			if ((i <= a.length) && (i >= b.length)) {
				append = a[i] + "" + 0;
			}
			array[i] = append;
		}

		return array;
	}


}

/*public boolean getFirstNRewardEntries(String n, UserDetails userDetails) {
	// UserDetails class holds details for user like uniqueIdentifier id, phone
	// number, address etc.

	try {
		List<RewardEntry> rewards = rewardService.getRewardEntries(userDetails.id);
		if (rewards != null) {
			return true;
		}
		return false;
	} catch (Exception e) {
		e.getCause().toString();
		return false;

	}

}*/
