package com.nishant.practice.strings;

import java.util.Scanner;

public class ReverseWordsInString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int j = 0; j < n; j++) {

			String s = sc.next();

			String sa[] = s.split("\\.");

			String rev = "";
			for (int i = sa.length - 1; i >= 0; i--) {
				rev = rev + sa[i];
				if (i > 0) {
					rev = rev + ".";
				}
			}

			System.out.println(rev);
		}

	}

}
