package com.nishant.practice.whileLoop;

import java.util.Scanner;

public class RandomPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int i = 1;
		int a = 0;
		while (a <= n) {
        a= a+4;
        System.out.print(a + " ");
        a= a-1;
        System.out.print(a +" ");
        //i++;
		}

	}

}
