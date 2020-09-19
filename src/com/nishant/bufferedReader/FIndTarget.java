package com.nishant.bufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FIndTarget {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = br.readLine().split(" ");
		int target = Integer.parseInt(br.readLine().trim());
		int[] input = new int[arr.length];
		for (int i_arr = 0; i_arr < arr.length; i_arr++) {
			input[i_arr] = Integer.parseInt(arr[i_arr]);
		}
		List<Integer> list = new ArrayList<>();
		for (int i_arr = 0; i_arr < arr.length; i_arr++) {
			if (input[i_arr] == target) {
				list.add(i_arr);
			}
		}
		if (list.size() == 0) {
			list.add(-1);
			list.add(-1);
		} else if (list.size() == 1) {
            list.add(list.get(0));
		}
		System.out.println(list);
	}

}
