package com.nishant.bufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class RemoveCharFromParticularPosition {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		String str = br.readLine();
		/*char [] arr = new char[n];
		for (int i_arr = 0; i_arr < arr_arr.length(); i_arr++) {
			arr[i_arr] =arr_arr.charAt(i_arr);
		}*/
		String result = removeChar(str,n);
		wr.println(result);

		wr.close();
		br.close();

	}

	private static String removeChar(String str, int pos) {
		int len = str.length();
		String res = null;
		if(len<=pos) {
			return res= "Invalida Position";
		  
		}
		res = str.substring(0, pos) + str.substring(pos + 1);
		return res;
	}

	

	
	

}
