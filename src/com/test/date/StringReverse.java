package com.test.date;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str = "Nishant Kumar";
		String reverse = "";

		for (int i = Str.length() - 1; i >= 0; i--) {
			reverse = reverse + Str.charAt(i);
		}
		System.out.println("Reverse String " + reverse);
		int N =3;
		int n = N-1;
	     int cal = n * N;
	     int res = (int) cal/2;
		System.out.println("Reverse String " + res);
	}
      

}
