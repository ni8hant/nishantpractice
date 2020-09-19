package com.test.date;

public class Combination {

	public static void main(String[] args) {
        
		String str = "abab";
		System.out.println(countDistinctPermutations(str));
	}

	static final int MAX_CHAR = 26;

	static int factorial(int n) {
		int fact = 1;
		for (int i = 2; i <= n; i++)
			fact = fact * i;
		return fact;
	}

	static int countDistinctPermutations(String str) {
		int length = str.length();

		int[] freq = new int[MAX_CHAR];

		for (int i = 0; i < length; i++)
			if (str.charAt(i) >= 'a')
				freq[str.charAt(i) - 'a']++;

		int fact = 1;
//		int factrest = 1;
		for (int i = 0; i < MAX_CHAR; i++) {
			fact = fact * factorial(freq[i]);
//		    factrest =  factrest * factorial(length-freq[i]);
		}
//		return factorial(length)/ fact* factrest ;
		return factorial(length)/ fact ;
	}
}
