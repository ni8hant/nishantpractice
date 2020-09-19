package com.nishant.collectionexample;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * 
 * The PriorityQueue class implements the Queue interface. It holds the elements
 * or objects which are to be processed by their priorities. PriorityQueue
 * doesn't allow null values to be stored in the queue.
 *
 */
public class PriorityQueueExp {

	public static void main(String[] args) {

		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("Nishant");
		pq.add("djasdf");
		pq.add("ffsd weruu");

		System.out.println(pq.peek());
		System.out.println(pq.element());

		System.out.println("&******* After ****Iteratator");
		Iterator<String> itr = pq.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		pq.remove();
		pq.poll();

		System.out.println("*********After removing ************");
		Iterator<String> itr2 = pq.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

}
