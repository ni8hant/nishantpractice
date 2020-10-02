package nishantpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SamAndStones {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numberOfTestCase = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < numberOfTestCase; i++) {
			int numberOfPiles = Integer.parseInt(br.readLine().trim());
			String[] strArr = br.readLine().split(" ");
			int[] intArr = new int[numberOfPiles];
			for (int j = 0; j < numberOfPiles; j++) {
				intArr[j] = Integer.parseInt(strArr[j]);
			}

			int result = minimumNumberOfPile(intArr);
			System.out.println(result);
		}
	}

	private static int minimumNumberOfPile(int[] intArr) {
		Arrays.sort(intArr);
		return intArr[0];
	}

}
