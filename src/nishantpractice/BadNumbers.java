package nishantpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BadNumbers {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine().trim());
		String[] strArr = br.readLine().split(" ");
		int lower = Integer.parseInt(br.readLine().trim());
		int upper = Integer.parseInt(br.readLine().trim());
		List<Integer> arr = new ArrayList<>();
		for (int i = 0; i < input; i++) {
			arr.add(Integer.parseInt(strArr[i]));
		}

		int result = goodSegment(arr, lower, upper);
		System.out.println(result);
	}

	private static int goodSegment(List<Integer> arr, int lower, int upper) {
		Collections.sort(arr);
		int maxDiff = 0;
		for (int i = 0; i < arr.size(); i++) {
			maxDiff = lower - arr.get(i) - 1;
			lower = arr.get(i);

		}
		return maxDiff;

	}

}
