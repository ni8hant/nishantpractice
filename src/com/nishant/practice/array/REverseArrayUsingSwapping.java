package com.nishant.practice.array;

import java.util.Scanner;

public class REverseArrayUsingSwapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
//		int a[] = {5,6,7,8};
//		int a[] = new int[4];
		
		int temp;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
       
        //Method 1
		int k =n-1;
		for (int i = 0; i < n/2 ; i++) {
				temp = a[i];
				a[i] = a[k];
				a[k] = temp;
				k--;
			}
		//Method 2	
		for (int i = 0; i < n/2 ; i++) {
			for (int j = n - 1; j > i; j--) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			    break;
			}
		}
		
		//Method 3
		for (int i = 0, j = n - 1; i < j; i++, j--) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
	
		for (int k1 = 0; k1 < n; k1++) {
			System.out.print(a[k1]);
		}
	}

}
