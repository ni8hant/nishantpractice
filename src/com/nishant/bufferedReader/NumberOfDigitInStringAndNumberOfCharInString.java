package com.nishant.bufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import com.nishant.practice.strings.FindDuplicateCharacterInString;

public class NumberOfDigitInStringAndNumberOfCharInString {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		String arr_arr = br.readLine();
		char [] arr = new char[n];
		for (int i_arr = 0; i_arr < arr_arr.length(); i_arr++) {
			arr[i_arr] =arr_arr.charAt(i_arr);
		}
		int digitCount = findDigitCount(arr);
		wr.println(digitCount);

		int charCount = findEnglishLetterCount(arr);
		wr.println(charCount);

		wr.close();
		br.close();

	}

	static int findEnglishLetterCount(char[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] >= 64 && arr[i] <= 90) || (arr[i] >= 97 && arr[i] <= 122)) {
				count++;
			}
		}
		return count;
	}

	static int findDigitCount(char[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 49 && arr[i] <= 57) {
				count++;
			}

		}
		return count;
	}

}
