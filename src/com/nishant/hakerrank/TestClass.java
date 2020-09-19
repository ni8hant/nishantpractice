package com.nishant.hakerrank;

import java.io.*;
import java.util.*;

public class TestClass {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int N = Integer.parseInt(br.readLine().trim());
		int[] A = new int[N];
		String[] arr_A = br.readLine().split(" ");
		for (int i_A = 0; i_A < N; i_A++) {
			A[i_A] = Integer.parseInt(arr_A[i_A]);
		}
		int out_ = Solve(N, A);
		System.out.println(out_);

		wr.close();
		br.close();
	}

	static int Solve(int N, int[] A) {
		if (N == 0) {
			return 0;
		}
		int[] B = new int[N];
		for (int i = 0; i < N; i++) {
			if (A[i] < 0) {
				B[i] = -A[i];
			} else {
				B[i] = A[i];
			}
		}
		int min = B[0];
		int pos = 0;
		for (int i = 0; i < B.length; i++) {

			if (min >= B[i]) {
				min = B[i];
				pos = i;
			}
		}
		return A[pos];
	}

}