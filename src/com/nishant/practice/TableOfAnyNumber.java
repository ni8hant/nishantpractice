package com.nishant.practice;

import java.util.Scanner;

public class TableOfAnyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while (i <= 10) {
         int t= i*n;
         System.out.println(i +" * "+n+" = "+ t);
         i++;
		}
	}

}
