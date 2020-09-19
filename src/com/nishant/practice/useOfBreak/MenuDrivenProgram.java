package com.nishant.practice.useOfBreak;

import java.util.Scanner;

public class MenuDrivenProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a, b, r;
		switch (n) {
		case 1:
			a = sc.nextInt();
			b = sc.nextInt();
			r = a + b;
			System.out.println(r);
			break;
		case 2:
			a = sc.nextInt();
			b = sc.nextInt();
			if (a > b) {
				System.out.println(a);
			} else {
				System.out.println(b);
			}

			break;
		case 3:
			a = sc.nextInt();
			for (int i = 1; i <= 10; i++) {
				r = a * i;
				System.out.println(r);
			}
			break;
		case 4:
			System.out.println("Exit");

			break;
		default:
			System.out.println("Invalid Choice");
			;
			break;
		}

	}

}
