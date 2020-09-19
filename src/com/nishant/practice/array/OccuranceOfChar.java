package com.nishant.practice.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccuranceOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		HashMap<Character, Integer> hs = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (hs.containsKey(str.charAt(i))) {
				int count = hs.get(str.charAt(i));
				hs.put(str.charAt(i), ++count);
			} else {
				hs.put(str.charAt(i), 1);
			}
		}
		System.out.println(hs);

		for (Map.Entry<Character, Integer> entry : hs.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());

		}

		occuranceOfChar(str);

		occuranceOfCharUsingChar(str);

		occuranceUsingASCII(str);

		occuranceUsingWhileLoop(str);
	}

	private static void occuranceOfChar(String str) {
		System.out.println("********************Using Array *******************");
		int[] counter = new int[str.length()];
		int count = 1;
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = '*';
				}
			}

			counter[i] = count;
			count = 1;
			if (arr[i] != '*')
				System.out.println(arr[i] + " : " + counter[i]);
		}

	}

	// Wrong output
	private static void occuranceOfCharUsingChar(String str) {
		System.out.println("*******************Using Char At***********************");
		int[] counter = new int[str.length()];
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
					str.replace(str.charAt(j), '*');
				}
			}

			counter[i] = count;
			count = 1;
			if (str.charAt(i) != '*')
				System.out.println(str.charAt(i) + " : " + counter[i]);
		}

	}

	private static void occuranceUsingASCII(String str) {
		final int MAX_SIZE = 256;

	}

	private static void occuranceUsingWhileLoop(String str) {
		System.out.println("*******************While Char At***********************");

		HashMap<Character, Integer> hs = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (hs.containsKey(str.charAt(i))) {
				Integer count = hs.get(str.charAt(i));
				hs.put(str.charAt(i), ++count);
			} else {
				hs.put(str.charAt(i), 1);

			}
		}

		for (Map.Entry<Character, Integer> iterable_element : hs.entrySet()) {
			System.out.println(iterable_element);
		}
	}

}
