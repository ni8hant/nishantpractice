package com.nishant.bufferedReader;
/**
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FarthestFromZero {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(br.readLine().trim());
		String arr[] = br.readLine().split(" ");
		int[] input = new int[i];
		for (int i_arr = 0; i_arr < arr.length; i_arr++) {
			input[i_arr] = Integer.parseInt(arr[i_arr]);
		}

		int result = farthestFromZero(i, input);
		System.out.println(result);

	}

	private static int farthestFromZero(int i, int[] input) {
		int max = input[0];
		int temp;
		for (int j = 1; j < input.length; j++) {
			int k = input[j];
			if(k < 0){
			   k = -k;
			}
			if (k > max) {
				temp = max;
				max = input[j];
				input[j] = temp;
			}
		}
		return max;
	}

}
