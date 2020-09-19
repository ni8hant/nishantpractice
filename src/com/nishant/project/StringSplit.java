package com.nishant.project;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello sdfd dff ere";
		
		String[] splited = str.split("\\s",2);
	
		String fn = splited[0];
		String lstName =splited[1];
/*//		int i;
		for (int i = 0; i < splited.length; i++) {
			if(i==0) {
				fn = splited[0];
			}
			else {
				lstName = lstName.concat(" ").concat(splited[i]).trim();
			}
		}*/
		System.out.println(fn );
		System.out.println(lstName );
         System.out.println(fn.replaceAll("@", ""));
	}
}
