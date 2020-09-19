package com.nishant.exceptionhandling;

public class TryCatchReturn {

	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		String s ="";
		System.out.println(s);
		int result = sum(a, b);
		System.out.println(result);

	}

	@SuppressWarnings("finally")
	private static int sum(int i, int j) {
		try {
			int result = i / j;
			System.out.println("Inside Try block");
			return result;
		} catch (Exception e) {
			System.out.println("Inside catch Block");
			return 1;
		}/* finally {
			System.out.println("finally block ");
			return 0;
		}*/

	}
}
