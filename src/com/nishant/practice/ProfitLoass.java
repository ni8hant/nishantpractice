package com.nishant.practice;

import java.util.Scanner;

public class ProfitLoass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cp = sc.nextInt();
		int sp = sc.nextInt();
	
		if (sp > cp) {
			System.out.println("Profit " + (sp - cp));
		} else {
			System.out.println("Loss " + (cp - sp));
		}
	}

}
