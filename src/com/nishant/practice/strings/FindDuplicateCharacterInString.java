package com.nishant.practice.strings;

import java.util.Scanner;

public class FindDuplicateCharacterInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count =0;
        int j=0;
		char ch = s.charAt(j);
		for (int i = 0; i < s.length(); i++) {
			if (ch == s.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);

	}
}
