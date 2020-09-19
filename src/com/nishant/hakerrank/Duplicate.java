package com.nishant.hakerrank;

import java.util.Scanner;

public class Duplicate {
	static final int NO_OF_CHARS = 256; 
    
    static void fillCharCounts(String str, int[] count) 
    { 
       for (int i = 0; i < str.length();  i++) 
          count[str.charAt(i)]++; 
    } 
       
    static void printDups(String str) 
    { 
      int count[] = new int[NO_OF_CHARS]; 
      fillCharCounts(str, count); 
      
      for (int i = 0; i < NO_OF_CHARS; i++) 
        if(count[i] == 2) 
            System.out.printf("\r%c \n", i); 
//            System.out.println(count[i]);
    } 
       
    public static void main(String[] args) 
    { 
    	Scanner ins = new Scanner(System.in);
        String ip = ins.nextLine();
        String str = ip.replaceAll(" ", "");
        printDups(str); 
    } 
}
