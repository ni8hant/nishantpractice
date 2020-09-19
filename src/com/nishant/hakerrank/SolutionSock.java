package com.nishant.hakerrank;

import java.io.IOException;
import java.util.Scanner;

public class SolutionSock {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {
		int count[] = new int[n];
		int pair = 0;
		int j = 0;
		for (int i = j + 1; i < n; i++) {
			if (ar[j] == ar[i]) {
				count[j++]++;
			}

		}
		for (int k = 0; k < n; k++) {
			int p = (int) ((1 / 2) * (count[k]));
			pair = pair + p;

		}
		return pair;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// InputStreamReader(System.out));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = sockMerchant(n, ar);
		System.out.println(result);

		// bufferedWriter.write(String.valueOf(result));
		// bufferedWriter.newLine();
		//
		// bufferedWriter.close();

		scanner.close();
	}
}
