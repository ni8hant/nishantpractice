package com.nishant.hakerearth;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyCode {

	private static final String URL_REGEX =
			"^((((https?|ftps?|gopher|telnet|nntp)://)|(mailto:|news:))" +
			"(%[0-9A-Fa-f]{2}|[-()_.!~*';/?:@&=+$,A-Za-z0-9])+)" +
			"([).!';/?:,][[:blank:]])?$";

	private static final Pattern URL_PATTERN = Pattern.compile(URL_REGEX);

	public static int urlValidator(String url) {
		if (url == null) {
			return 0;
		}
        int count =0;
		Matcher matcher = URL_PATTERN.matcher(url);
		count ++;
		return count;
	}
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		
		String url = sc.nextLine();
		
		int count = urlValidator(url);
		
		System.out.println(count);		
	}
}
