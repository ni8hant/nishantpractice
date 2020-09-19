package com.nishant.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddNullInArrayTest {

	public static void main(String[] args) {
		List<String> rRnos = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			rRnos.add(null);

		}
		System.out.println(rRnos);
	}
}
