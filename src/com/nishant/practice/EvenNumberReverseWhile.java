package com.nishant.practice;

import java.util.Scanner;

public class EvenNumberReverseWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =0;
		if(n%2!=0) n= n-1;
		while (n >=i){
			System.out.print(n +" ");
			n = n -2;
			
		}

	}

}
