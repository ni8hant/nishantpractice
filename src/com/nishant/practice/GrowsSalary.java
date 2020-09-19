package com.nishant.practice;

import java.util.Scanner;

public class GrowsSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      
      int bs = sc.nextInt();
      
      float hra = sc.nextFloat();
      
      float da = sc.nextFloat();
      
      float total = bs+hra+da;
      
      System.out.println("gross slary : " + total);
	}

}
