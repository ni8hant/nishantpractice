package com.nishant.practice;

import java.util.Scanner;

public class PrintNumberDifferByFur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = sc.nextInt();
		while (i<=n){
			System.out.print(i +" ");
			i = i+4;
		}

	}

}
