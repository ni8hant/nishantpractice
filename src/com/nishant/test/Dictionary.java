package com.nishant.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dictionary {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int numOfTest = Integer.parseInt(input[0]);
		int lengthOfWord = Integer.parseInt(input[1]);

		String[] arr = new String[numOfTest];
		for (int i = 0; i < numOfTest; i++) {
			arr[i] = br.readLine().trim();
			if (arr[i].length() != lengthOfWord) {
				System.out.println("Not a valid Input");
			}
		}

		int compInput = Integer.parseInt(br.readLine().trim());
		String[] comp = new String[compInput];

		for (int i = 0; i < compInput; i++) {
			comp[i] = br.readLine().trim();
		}

		findMatch(arr, comp);

	}

	private static void findMatch(String[] arr, String[] comp) {
		int count = 0;
		for (int i = 0; i < comp.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j].contains(comp[i])) {
					count++;
				}
			}
			System.out.println(count);
			count = 0;
		}

	}

}
/*Input
5 3
cat
mat
sat
man
fan

4
?at
ma?
?a?
?an

output
3
2
5
2
*/


/*4 4
tata
bata
tall
mall

 

3
?a?a
??ll
t???

 

O/p
2
2
2*/