package com.test.date;

public class DoubleRound {

	public static void main(String[] args) {
		double base = 50.954334;
		double rate = 1.00;
		System.out.println(Math.round(base * rate));

		double bal = Double.parseDouble(String.format("%.2f", base));
		System.out.println(bal);

	}

}
