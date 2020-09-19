package com.nishant.practice;

import java.util.Scanner;

public class MaxOfThreeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		// if (a>b){
		// if(a>c){
		// System.out.println(a + " Value of a is greater");
		// }
		// if (c > b) {
		// System.out.println(c + " is greater ");
		// }
		// else{
		// System.out.println();
		// }
		// }else{
		// System.out.println(b +" is greater");
		// }

		if (a > b) {
			if (a > c) {
				System.out.println(a + " is greater");
			} else {
				System.out.println(c + " is greater");
			}

		} else if (b > c) {
			System.out.println(b + " is greater");
		} else {
			System.out.println(c + " is greater ");
		}
	}

}
