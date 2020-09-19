package com.nishant.practice.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TotalDiscountCal {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int discount = Integer.parseInt(br.readLine().trim());
		String arr[] = br.readLine().split(" ");
		int[] price = new int[arr.length];
		for (int i_arr = 0; i_arr < arr.length; i_arr++) {
			price[i_arr] = Integer.parseInt(arr[i_arr]);
		}
		int total = calculaterTotalPrice(price, discount);
		System.out.println(total);
	}

	private static int calculaterTotalPrice(int[] price, int discount) {
		double total = 0;
		for (int i = 0; i < price.length; i++) {
			int itemPrice = price[i];
			double itemdiscount = discount * 0.01;
			total = total + itemPrice * itemdiscount;
		}
		return (int) total;
	}

}
