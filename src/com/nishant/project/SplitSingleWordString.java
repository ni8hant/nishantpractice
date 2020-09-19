package com.nishant.project;

public class SplitSingleWordString {

	public static void main(String[] args) {
		String str = "Hellosdsd";

		if (str.trim().contains(" ")) {
			String[] splited = str.split("\\s",2);
			String fn = splited[0];
			String lstName = splited[1].trim();

			System.out.println(fn);
			System.out.println(lstName);
		} else {
			String fn = str.substring(0, 5); 
			String lstName = str.substring(5,str.length()).trim();
			
			System.out.println(fn);
			System.out.println(lstName);
			System.out.println(fn.replaceAll(" ", ""));
		}
	}
}
