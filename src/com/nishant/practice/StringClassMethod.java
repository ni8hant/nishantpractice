
package com.nishant.practice;

import java.util.Scanner;

public class StringClassMethod {

	 public static  void main(String[] args) {
		// String class predefined method
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println("Length of String " + s.length());
		
		System.out.println("Character at 4th position " + s.charAt(4));
		
		System.out.println("Substring " + s.substring(3));
		
		System.out.println("Index of String " + s.indexOf(s));
		
		System.out.println("Concatenated String " + s.concat("India"));
		
		System.out.println("Index of a " + s.indexOf('a', 6));
		
		System.out.println("Equqaltiy check " + s.equals("nishant"));
		
		System.out.println("Equality ignore case " +"Nishant".equalsIgnoreCase(s));
		
		System.out.println("Campare "+ s.compareTo("Kumar"));
		
		System.out.println("Comapre Ignore case " + s.compareToIgnoreCase("NishANT"));
		
		System.out.println("Convert to lower case " + s.toLowerCase());
		
		System.out.println("Convert to upper case " + s.toUpperCase());
		
		System.out.println("Trim " +  s.trim());
		
		System.out.println("Replace " + s.replace('N', 'S'));
		
		sc.close();

	}

}
