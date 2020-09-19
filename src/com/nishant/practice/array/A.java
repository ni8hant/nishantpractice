package com.nishant.practice.array;

//Java code below
import java.util.*;

class A {

	static boolean exists(int[] ints, int k) {
		for (int i = 0; i < ints.length; i++) {
			if (k == ints[i]) {
				return true;
			}
		}
		return false;
	}
}
