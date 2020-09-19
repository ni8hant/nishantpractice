package nishantpractice;

import java.util.ArrayList;
import java.util.List;

public class ReplaceInteger {

	public static void main(String[] args) {
		char[] arr = new char[26];
		int j = 0;
		for (char i = 'A'; i <= 'Z'; i++) {
			arr[j] = i;
			j++;
		}

		int[] ints = { 4, 5, 13, 26, 28, -2, 1 };
		System.out.println(ints.length);
		List<Character> result = new ArrayList<Character>();
		for (int i = 0; i < ints.length; i++) {
			if (ints[i] > 26) {
				int num = ints[i] % 26;
				result.add(arr[num - 1]);
			} else if (ints[i] < 0) {
				int num = -ints[i];
				if (num > 26) {
					num = ints[i] % 26;
					result.add(arr[num - 1]);

				} else {
					result.add(arr[num - 1]);
				}
			} else {
				int num = ints[i];
				result.add(arr[num - 1]);
			}

		}
		System.out.println(result);

	}
}
