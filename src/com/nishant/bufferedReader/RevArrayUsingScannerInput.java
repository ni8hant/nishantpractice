package com.nishant.bufferedReader;

import java.util.Scanner;

public class RevArrayUsingScannerInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		sc.nextLine();
		String[] str = sc.nextLine().split(" ");
		String[] res = new String[i];
		for (int j = 0; j < str.length; j++) {
			res[j] = str[i - j - 1];
			System.out.print(res[j] + " ");
		}
		sc.close();
	}

}
