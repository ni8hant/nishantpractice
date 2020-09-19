package nishantpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RotationTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int size = Integer.parseInt(input[0]);
		int steps = Integer.parseInt(input[1]);
		String[] arr = br.readLine().split(" ");
		int[] intArr = new int[size];
		for (int i = 0; i < size; i++) {
			intArr[i] = Integer.parseInt(arr[i]);
		}

		for (int i = 0; i < steps; i++) {
			int j, last;
			last = intArr[intArr.length - 1];

			for (j = intArr.length - 1; j > 0; j--) {
				intArr[j] = intArr[j - 1];
			}
			intArr[0] = last;
		}

		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
	}

}
