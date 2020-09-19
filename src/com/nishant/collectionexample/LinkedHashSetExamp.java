package com.nishant.collectionexample;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * 
 * LinkedHashSet class represents the LinkedList implementation of Set
 * Interface. It extends the HashSet class and implements Set interface. Like
 * HashSet, It also contains unique elements. It maintains the insertion order
 * and permits null elements.
 *
 */

public class LinkedHashSetExamp {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("UTK");
		lhs.add("Nishant");
		lhs.add("Nishant");
		lhs.add("UTK");
		lhs.add("utk");
		System.out.println(lhs);
		Iterator<String> itr = lhs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
