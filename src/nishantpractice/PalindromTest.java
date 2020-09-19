package nishantpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int first = Integer.parseInt(input[0]);
		int last = Integer.parseInt(input[1]);
		int len =0;
		if (last > first) {
			len = (last - first) + 1;
		}else {
			System.out.println("Not a Valid Input");
		}
		int palindromCount = 0;
		int num = 0, reversedInteger = 0, remainder, originalInteger;
		for (int i = 1000000; i <= 1235959; i++) {
			num = i;
			reversedInteger = 0;
			originalInteger = num;
			while (num != 0) {
				remainder = num % 10;
				reversedInteger = reversedInteger * 10 + remainder;
				num /= 10;
			}
			if (originalInteger == reversedInteger)
				palindromCount++;
		}

		System.out.println(palindromCount * len);

	}

}
