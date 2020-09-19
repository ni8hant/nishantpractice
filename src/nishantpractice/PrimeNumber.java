package nishantpractice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int i, j = 0;
		for (i = start; i < end; i++) {
		      if (i == 1 || i == 0) 
	                continue; 
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					break;
				}

			}
			if (i == j) {
				System.out.print(i + " ");
			}
		}
		
	}

}
