package com.nishant.collectionexample;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 
 * ArrayDeque class implements the Deque interface. It facilitates us to use the
 * Deque. Unlike queue, we can add or delete the elements from both the ends.
 * 
 * ArrayDeque is faster than ArrayList and Stack and has no capacity
 * restrictions.
 *
 */
public class ArrayDequeExp {

	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<>();
		dq.add("Nish");
		dq.add("Lulu");
		dq.add("dgd");

		for (String str : dq) {
			System.out.println(str);
		}
	}

}
