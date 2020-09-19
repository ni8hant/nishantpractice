package com.nishant.passwordencode;

//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncodePassword {

	private static String psvm(String srr) {
		//
		// BCryptPasswordEncoder pass = new BCryptPasswordEncoder();
		// String result = pass.encode(srr);
		// return result;
		return null;
	}

	public static void main(String[] args) {
		String Str = "Nishant";
		String result = psvm(Str);
		System.out.println(result);
	}

}
