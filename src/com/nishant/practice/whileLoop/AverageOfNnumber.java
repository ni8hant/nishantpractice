package com.nishant.practice.whileLoop;

import java.util.Scanner;

public class AverageOfNnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float avg;
		 int i =1,sum = 0;
		// avg = (float) ((n + 1) / 2f);
		// System.out.println(avg);
		while (i <= n) {
          sum = sum+i;
          i++;
		}
		avg = (float) (sum/n);
		System.out.println(avg);
	}

}
